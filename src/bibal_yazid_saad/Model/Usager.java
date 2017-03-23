/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.Model;

import java.sql.Date;

/**
 *
 * @author dizay
 */
public class Usager {
    private int ID;
    private String Nom;
	private String Prenom;
	private Date Date_Naissance;
	private String Tel;
	private String Adresse;
        

    public Usager(String Nom, String Prenom, java.sql.Date Date_Naissance, String Tel, String Adresse) {
        this.ID=ID;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Date_Naissance = (java.sql.Date) Date_Naissance;
        this.Tel = Tel;
        this.Adresse = Adresse;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    Usager(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public java.sql.Date getDate_Naissance() {
        return Date_Naissance;
    }

    public void setDate_Naissance(java.sql.Date Date_Naissance) {
        this.Date_Naissance = (java.sql.Date) Date_Naissance;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }
        
}
