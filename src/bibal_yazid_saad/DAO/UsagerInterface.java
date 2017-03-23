/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.DAO;

import bibal_yazid_saad.Model.Usager;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dizay
 */
public interface UsagerInterface {
    public void ajouterUsager(Usager u);
    public Object[][] Lister();
    public Usager FindByName(String Nom);
    public void SupprimerUsager(String Nom);
    public void ModifierUsager(Usager u);
    
}
