/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.Controller;

import bibal_yazid_saad.View.IHMusager;
import bibal_yazid_saad.DAO.UsagerManager;
import bibal_yazid_saad.Model.Usager;
import java.sql.Date;

/**
 *
 * @author dizay
 */
public class UsagerControler {
  static UsagerManager UsagerManager; 
  static IHMusager iHMusager;
  static Usager u;
  public UsagerControler(){
    UsagerManager=new UsagerManager();
    
}
  public void ajouterUsager(String Nom, String Prenom, Date Date_Naissance, String Tel, String Adresse){
      
      u = new Usager(Nom, Prenom, Date_Naissance, Tel, Adresse);
      UsagerManager.ajouterUsager(u);
      
      
  }
    public Object[][] Lister(){
       Object[][] o = null;
        UsagerManager.Lister();
        return o;
        
    }
    
    public Usager FindByName(String Nom){
        Usager u=null;
        UsagerManager.FindByName(Nom); 
        return u;
    }
    public void SupprimerUsager(String Nom){
           
      UsagerManager.SupprimerUsager(Nom);
        
    }
  public void ModifierUsager(String Nom, String Prenom, Date Date_Naissance, String Tel, String Adresse){
      Usager u;
      u = new Usager(Nom, Prenom, Date_Naissance, Tel, Adresse);
      UsagerManager.ModifierUsager(u);
      
  }
}
