/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.DAO;

import bibal_yazid_saad.Model.Oeuvre;

/**
 *
 * @author Asaad
 */
public interface OeuvreInterface {
     public void AjouterOeuvre (Oeuvre o);
    public Object[][] Lister();
    public Oeuvre FindByTitle(String titre);
    public void SupprimerOeuvre(String titre);
    
    
}
