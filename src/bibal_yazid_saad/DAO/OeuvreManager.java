/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.DAO;

import bibal_yazid_saad.Connection.DbInteraction;
import bibal_yazid_saad.Model.Oeuvre;
import bibal_yazid_saad.View.IHMusager;
import static bibal_yazid_saad.View.IHMusager.TableUsager;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Asaad
 */
public class OeuvreManager implements OeuvreInterface{

    @Override
    public void AjouterOeuvre(Oeuvre o) {
            try {
            DbInteraction.Connect();
            String sql="insert into oeuvre(Titre,Auteur,NbrResa,Lending,Lending2,Discriminator) values ('"+o.getTitre()+"','"+o.getAuteur()+"','"+o.getNbrResa()+"','"+o.getLending()+"','"+o.getLending2()+"','"+o.getType()+"')";
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
        } catch (SQLException ex) {
            Logger.getLogger(OeuvreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql="select * from oeuvre ";
        try {
            DbInteraction.pst=(PreparedStatement) DbInteraction.con.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(OeuvreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DbInteraction.rs=(com.mysql.jdbc.ResultSet) (ResultSet) DbInteraction.pst.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(OeuvreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
            TableOeuvre.setModel(DbUtils.resultSetToTableModel(DbInteraction.rs)); // changer tableUSager en tableOeuvre dans IHM
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Oeuvre FindByTitle(String titre) {
        Oeuvre o =null;
        try {
            DbInteraction.Connect();
        } catch (SQLException ex) {
            Logger.getLogger(OeuvreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql="select * from oeuvre where Titre like '%" + titre + "%' ";
        try {
            DbInteraction.pst=(PreparedStatement) DbInteraction.con.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(OeuvreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DbInteraction.rs=(com.mysql.jdbc.ResultSet) (ResultSet) DbInteraction.pst.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(OeuvreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
            TableUsager.setModel(DbUtils.resultSetToTableModel(DbInteraction.rs));
            
        
   return o;
    }

    @Override
    public void SupprimerOeuvre(String titre) {
          int row=IHMoeuvre.TableOeuvre.getSelectedRow();
            String ID=(TableOeuvre.getModel().getValueAt(row, 0).toString());
        try {
            DbInteraction.Connect();
        } catch (SQLException ex) {
            Logger.getLogger(OeuvreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql="delete from oeuvre where ID='"+ID+"'";
            DbInteraction.update(sql);
            DbInteraction.disconnect();
           
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
