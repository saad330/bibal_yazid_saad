/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.Controller;

import bibal_yazid_saad.DAO.ExemplaireManager;
import bibal_yazid_saad.Model.Exemplaire;
import bibal_yazid_saad.Model.Oeuvre;
import bibal_yazid_saad.View.IHMexemplaire;

/**
 *
 * @author Yazid
 */
public class ExemplaireControler {
    static ExemplaireManager ExemplaireManager; 
  static IHMexemplaire iHMexemplaire;
  static Exemplaire e;
    
  public ExemplaireControler(){
    ExemplaireManager=new ExemplaireManager();
    
}
  public void ajouterExemplaire(Oeuvre oe,String Etat){
      
      e= new Exemplaire(oe,Etat);
      ExemplaireManager.ajouterExemplaire(e);
      
      
  }
    public Object[][] Lister(){
       Object[][] o = null;
        ExemplaireManager.Lister();
        return o;
        
    }
    
    public Exemplaire FindByID(int ID){
        Exemplaire e=null;
        ExemplaireManager.FindByID(ID); 
        return e;
    }
    public void SupprimerExemplaire(int ID){
           
      ExemplaireManager.SupprimerExemplaire(ID);
        
    }
  public void ModifierExemplaire( String Etat){
      Exemplaire e;
      e = new Exemplaire(Etat);
      ExemplaireManager.ModifierExemplaire(e);
      
  }
}
