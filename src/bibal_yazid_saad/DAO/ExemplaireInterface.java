/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.DAO;

import bibal_yazid_saad.Model.Exemplaire;

/**
 *
 * @author Yazid
 */
public interface ExemplaireInterface {
    public void ajouterExemplaire(Exemplaire e);
    public Object[][] Lister();
    public Exemplaire FindByID(int ID);
    public void SupprimerExemplaire(int ID);
    public void ModifierExemplaire(Exemplaire e);
}
