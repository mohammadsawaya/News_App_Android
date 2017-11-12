package com.android2017.session12_navigationdrawer;

/**
 * Created by Mohammad on 28.10.2017.
 */

public class Nachricht {
    private String titel;
    private String autor;
    private String nachricht;
    private String categorie;


    public Nachricht() {
    }

    public Nachricht(String titel, String autor, String nachricht,String categorie) {
        this.titel = titel;
        this.autor = autor;
        this.nachricht = nachricht;
        this.categorie =categorie;

    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNachricht() {
        return nachricht;
    }

    public void setNachricht(String nachricht) {
        this.nachricht = nachricht;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
