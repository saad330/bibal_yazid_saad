/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.DAO;

import bibal_yazid_saad.Connection.DbInteraction;
import bibal_yazid_saad.View.IHMusager;
import bibal_yazid_saad.Model.Usager;
import static bibal_yazid_saad.View.IHMusager.TableUsager;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author dizay
 */
public class UsagerManager implements UsagerInterface{

    @Override
    public void ajouterUsager(Usager u) {
        try {
            
            DbInteraction.Connect();
            String sql="insert into usager(nom,prenom,Date_Naissance,Tel,Adresse) values ('"+u.getNom()+"','"+u.getPrenom()+"','"+u.getDate_Naissance()+"','"+u.getTel()+"','"+u.getAdresse()+"')";
            DbInteraction.update(sql);
            DbInteraction.disconnect();
            
           
            
        } catch (SQLException ex) {
            Logger.getLogger(UsagerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public Object[][] Lister() {
         
             Object[][] o = null;
             
              try {
            DbInteraction.Connect();
            String sql="select * from usager ";
            DbInteraction.pst=(PreparedStatement) DbInteraction.con.prepareStatement(sql);
            DbInteraction.rs=(com.mysql.jdbc.ResultSet) (ResultSet) DbInteraction.pst.executeQuery(sql);
            TableUsager.setModel(DbUtils.resultSetToTableModel(DbInteraction.rs));
            
          
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
            
        }
               
               return o;
              
    }

    @Override
    public Usager FindByName(String Nom) {
        Usager u=null;
        try {
              
            DbInteraction.Connect();
            String sql="select * from usager where Nom like '%" + Nom + "%' ";
            DbInteraction.pst=(PreparedStatement) DbInteraction.con.prepareStatement(sql);
            DbInteraction.rs=(com.mysql.jdbc.ResultSet) (ResultSet) DbInteraction.pst.executeQuery(sql);
            TableUsager.setModel(DbUtils.resultSetToTableModel(DbInteraction.rs));
           
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
      
        return u;
    }

    @Override
    public void SupprimerUsager(String Nom) {
        try {
            int row=IHMusager.TableUsager.getSelectedRow();
            String ID=(TableUsager.getModel().getValueAt(row, 0).toString());
            DbInteraction.Connect();
            String sql="delete from usager where ID='"+ID+"'";
            DbInteraction.update(sql);
            DbInteraction.disconnect();
           
            
        } catch (SQLException ex) {
            Logger.getLogger(UsagerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ModifierUsager(Usager u) {
        try {
            int row=IHMusager.TableUsager.getSelectedRow();
            String ID=(TableUsager.getModel().getValueAt(row, 0).toString());
            DbInteraction.Connect();
            String sql="update usager set Nom='"+u.getNom()+"',Prenom='"+u.getPrenom()+"',Date_Naissance='"+u.getDate_Naissance()+"',Tel='"+u.getTel()+"',Adresse='"+u.getAdresse()+"' where ID="+ID+"";
            DbInteraction.update(sql);
            DbInteraction.disconnect();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsagerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
