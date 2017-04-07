/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.Model;

/**
 *
 * @author Asaad
 */
public class Oeuvre {
   private int ID;
   private String Titre;
   private String Auteur;
   private int NbrResa=0;
  
   private int Lending;
   private int Lending2;
   private String Type;
   public Oeuvre() {
    }  

    public int getNbrResa() {
        return NbrResa;
    }

    public void setNbrResa(int NbrResa) {
        this.NbrResa = NbrResa;
    }
   

    public Oeuvre(String Titre, String Auteur, int NbrResa, int Lending, int Lending2, String Type) {
        this.Titre = Titre;
        this.Auteur = Auteur;
        this.NbrResa = NbrResa;
        this.Lending = Lending;
        this.Lending2 = Lending2;
        this.Type = Type;
    }
   

    public Oeuvre(String Titre, String Auteur, int Lending, int Lending2, String Type) {
        this.Titre = Titre;
        this.Auteur = Auteur;
        this.Lending = Lending;
        this.Lending2 = Lending2;
        this.Type = Type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String Titre) {
        this.Titre = Titre;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String Auteur) {
        this.Auteur = Auteur;
    }

    public int getLending() {
        return Lending;
    }

    public void setLending(int Lending) {
        this.Lending = Lending;
    }

    public int getLending2() {
        return Lending2;
    }

    public void setLending2(int Lending2) {
        this.Lending2 = Lending2;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
   
}
 