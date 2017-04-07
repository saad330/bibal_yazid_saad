/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.Controller;

import bibal_yazid_saad.DAO.OeuvreManager;
import bibal_yazid_saad.Model.Oeuvre;
import bibal_yazid_saad.View.IHMoeuvre;

import java.sql.Date;

/**
 *
 * @author Asaad
 */
public class OeuvreControler {
    
     static OeuvreManager OeuvreManager; 
  static IHMoeuvre iHMoeuvre;
  static Oeuvre o;
  public OeuvreControler(){
    OeuvreManager=new OeuvreManager();
    
}
  public void AjouterOeuvre(String Titre, String Auteur, int Lending, int Lending2, String Type){
      
      o = new Oeuvre( Titre,  Auteur, Lending, Lending2, Type);
      OeuvreManager.AjouterOeuvre(o);
      
      
  }
    public Object[][] Lister(){
      Object[][] o = null;
        OeuvreManager.Lister();
        return o;
    }
    
    public Oeuvre  FindByTitle(String titre){
        Oeuvre o =null;
        OeuvreManager.FindByTitle(titre);
        return o;
    }
    public void SupprimerOeuvre( String titre){
           
      OeuvreManager.SupprimerOeuvre(titre);
        
    }
 
}
