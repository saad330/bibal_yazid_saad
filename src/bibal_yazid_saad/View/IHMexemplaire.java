/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.View;

import bibal_yazid_saad.Connection.DbInteraction;
import bibal_yazid_saad.Controller.ExemplaireControler;
import bibal_yazid_saad.Controller.OeuvreControler;
import bibal_yazid_saad.Model.Oeuvre;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
//import net.proteanit.sql.DbUtils;


/**
 *
 * @author dizay
 */
public class IHMexemplaire extends javax.swing.JFrame {

    /**
     * Creates new form IHMusager
     */
    OeuvreControler  oc=new OeuvreControler(); 
    ExemplaireControler ec=new ExemplaireControler();
       
    public IHMexemplaire() {
        initComponents();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ovid = new javax.swing.JTextField();
        etat = new javax.swing.JTextField();
        ajouter = new javax.swing.JButton();
        Bsupp = new javax.swing.JButton();
        vd = new javax.swing.JButton();
        Bmodf = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        expid = new javax.swing.JTextField();
        Blist12 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableExemplaire = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        NomForSearch = new javax.swing.JLabel();
        Titrech = new javax.swing.JTextField();
        Blist = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableOeuvre1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ajouter Exemplaire");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OeuvreID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Etat");

        ovid.setEditable(false);
        ovid.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ovid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ovidKeyTyped(evt);
            }
        });

        etat.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        etat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                etatKeyTyped(evt);
            }
        });

        ajouter.setBackground(new java.awt.Color(0, 0, 0));
        ajouter.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ajouter.setForeground(new java.awt.Color(255, 255, 255));
        ajouter.setText("Ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });
        ajouter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ajouterKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ajouterKeyReleased(evt);
            }
        });

        Bsupp.setBackground(new java.awt.Color(0, 0, 0));
        Bsupp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Bsupp.setForeground(new java.awt.Color(255, 255, 255));
        Bsupp.setText("Supprimer");
        Bsupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsuppActionPerformed(evt);
            }
        });
        Bsupp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BsuppKeyPressed(evt);
            }
        });

        vd.setBackground(new java.awt.Color(0, 0, 0));
        vd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        vd.setForeground(new java.awt.Color(255, 255, 255));
        vd.setText("Vider Les Champs");
        vd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vdActionPerformed(evt);
            }
        });

        Bmodf.setBackground(new java.awt.Color(0, 0, 0));
        Bmodf.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Bmodf.setForeground(new java.awt.Color(255, 255, 255));
        Bmodf.setText("Modifier");
        Bmodf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmodfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ExemplaireID");

        expid.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        expid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                expidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                expidKeyTyped(evt);
            }
        });

        Blist12.setBackground(new java.awt.Color(0, 0, 0));
        Blist12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Blist12.setForeground(new java.awt.Color(255, 255, 255));
        Blist12.setText("Lister Tout");
        Blist12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Blist12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addGap(34, 34, 34)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etat, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ovid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addComponent(expid, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(223, 223, 223)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Blist12, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Bsupp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bmodf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(vd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bmodf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ovid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bsupp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ajouter)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Blist12)
                .addGap(22, 22, 22))
        );

        TableExemplaire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TableExemplaire.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TableExemplaire.setForeground(new java.awt.Color(102, 102, 102));
        TableExemplaire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "OeuvreID", "Etat"
            }
        ));
        TableExemplaire.setGridColor(new java.awt.Color(255, 255, 255));
        TableExemplaire.setSelectionBackground(new java.awt.Color(0, 0, 0));
        TableExemplaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableExemplaireMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableExemplaire);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        NomForSearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NomForSearch.setForeground(new java.awt.Color(255, 255, 255));
        NomForSearch.setText("Titre");

        Titrech.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TitrechKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TitrechKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TitrechKeyTyped(evt);
            }
        });

        Blist.setBackground(new java.awt.Color(0, 0, 0));
        Blist.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Blist.setForeground(new java.awt.Color(255, 255, 255));
        Blist.setText("Lister Tout");
        Blist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlistActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Identifier Oeuvre");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Vider Le Tableau");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(NomForSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titrech, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Blist, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(476, 476, 476))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Titrech, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Blist, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NomForSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        TableOeuvre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TableOeuvre1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TableOeuvre1.setForeground(new java.awt.Color(102, 102, 102));
        TableOeuvre1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Titre", "Auteur", "NbrReservation", "Lending", "Lending2", "Type"
            }
        ));
        TableOeuvre1.setGridColor(new java.awt.Color(255, 255, 255));
        TableOeuvre1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        TableOeuvre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableOeuvre1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableOeuvre1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(599, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        // TODO add your handling code here:
       
         if(ovid.getText().equals("") || etat.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Remplir Tous Les Champs Avant Ajouter","Erreur",JOptionPane.ERROR_MESSAGE);
            
         }
         else{
             
      
        ec.ajouterExemplaire(Oeuvre.class.cast(ovid.getText()),etat.getText());
        JOptionPane.showMessageDialog(null, "Ajout Avec Succés","OK",JOptionPane.INFORMATION_MESSAGE);
        
        oc.Lister();
          viderr();
         
         
         
         }
         
    }//GEN-LAST:event_ajouterActionPerformed

    private void BlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlistActionPerformed
        // TODO add your handling code here:
        
        oc.Lister();
      TableOeuvre1.setModel(DbUtils.resultSetToTableModel(DbInteraction.rs));
    }//GEN-LAST:event_BlistActionPerformed

    private void TableExemplaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableExemplaireMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TableExemplaireMouseClicked
        public void videtable(){
            DefaultTableModel dm = (DefaultTableModel) TableOeuvre1.getModel();

        while(dm.getRowCount()>0){
            for(int i=0;i<dm.getRowCount();i++){
                dm.removeRow(i);
            }
            
    }

        }  
    private void TitrechKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TitrechKeyReleased
        // TODO add your handling code here:
        
        
        oc.FindByTitle(Titrech.getText());
        TableOeuvre1.setModel(DbUtils.resultSetToTableModel(DbInteraction.rs));
        
        
        // if(Nomrech.getText().equals("")){
        //     videtable();
        // }
       
   
    if( evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ){
         
                videtable();
            
    }
         
    }//GEN-LAST:event_TitrechKeyReleased
public  void viderr(){
        ovid.setText("");
        etat.setText("");
        expid.setText("");
}
    private void BsuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsuppActionPerformed
        // TODO add your handling code here:
     
         
        int row=IHMexemplaire.TableExemplaire.getSelectedRow();
        String IDD=(TableExemplaire.getModel().getValueAt(row, 0).toString());
         ec.SupprimerExemplaire(Integer.parseInt(expid.getText()));
  
         JOptionPane.showMessageDialog(null, "Suppression Avec Succés");
         ec.Lister();
            viderr();
        
        
        
    }//GEN-LAST:event_BsuppActionPerformed

    private void ovidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ovidKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ovidKeyTyped

    private void etatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etatKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_etatKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
          
            
    
    }//GEN-LAST:event_formWindowActivated

    private void TitrechKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TitrechKeyTyped
        // TODO add your handling code here:char c = evt.getKeyChar();
          char c = evt.getKeyChar();
                //le caractère est numérique
                if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'|| c == KeyEvent.VK_SPACE) {
                    // System.out.println(evt);
                } else {
                    //suppression du caractère
                    evt.consume();
                }
              
                
              
    }//GEN-LAST:event_TitrechKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        videtable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void vdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vdActionPerformed
        // TODO add your handling code here:
        viderr();
    }//GEN-LAST:event_vdActionPerformed

    private void TitrechKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TitrechKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TitrechKeyPressed

    private void BsuppKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BsuppKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_BsuppKeyPressed

    private void ajouterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ajouterKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ajouterKeyReleased

    private void ajouterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ajouterKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ajouterKeyPressed

    private void BmodfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmodfActionPerformed
        // TODO add your handling code here:
            int row=IHMexemplaire.TableExemplaire.getSelectedRow();
            String ID=(TableExemplaire.getModel().getValueAt(row, 0).toString());
        ec.ModifierExemplaire(etat.getText());

        JOptionPane.showMessageDialog(null, "Modification Avec Succés");
        viderr();
        ec.Lister();

    }//GEN-LAST:event_BmodfActionPerformed

    private void TableOeuvre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableOeuvre1MouseClicked
        // TODO add your handling code here:
        
        try {
            int row=TableOeuvre1.getSelectedRow();
            String Table_click=(TableOeuvre1.getModel().getValueAt(row, 0).toString());
            
             String sql="select * from oeuvre where ID='"+Table_click+"' ";
            DbInteraction.pst=(PreparedStatement) DbInteraction.con.prepareStatement(sql);
            DbInteraction.rs=(com.mysql.jdbc.ResultSet) (ResultSet) DbInteraction.pst.executeQuery(sql);
            
            if(DbInteraction.rs.next()){
                
                
                String add1=DbInteraction.rs.getString("ID");
                ovid.setText(add1);
                 
               
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_TableOeuvre1MouseClicked

    private void expidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expidKeyTyped
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_expidKeyTyped

    private void Blist12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Blist12ActionPerformed
        // TODO add your handling code here:
        ec.Lister();
        TableExemplaire.setModel(DbUtils.resultSetToTableModel(DbInteraction.rs));
                
    }//GEN-LAST:event_Blist12ActionPerformed

    private void expidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expidKeyReleased
        // TODO add your handling code here:
          ec.FindByID(Integer.parseInt(expid.getText()));
        TableExemplaire.setModel(DbUtils.resultSetToTableModel(DbInteraction.rs));
    }//GEN-LAST:event_expidKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IHMexemplaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IHMexemplaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IHMexemplaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IHMexemplaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IHMexemplaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blist;
    private javax.swing.JButton Blist12;
    private javax.swing.JButton Bmodf;
    private javax.swing.JButton Bsupp;
    private javax.swing.JLabel NomForSearch;
    private static javax.swing.JTable TableExemplaire;
    private javax.swing.JTable TableOeuvre1;
    private javax.swing.JTextField Titrech;
    private javax.swing.JButton ajouter;
    private javax.swing.JTextField etat;
    private javax.swing.JTextField expid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField ovid;
    private javax.swing.JButton vd;
    // End of variables declaration//GEN-END:variables

  
}