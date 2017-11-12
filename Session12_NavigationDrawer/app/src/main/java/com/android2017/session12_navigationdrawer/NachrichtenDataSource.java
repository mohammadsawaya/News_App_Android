package com.android2017.session12_navigationdrawer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohammad on 29.10.2017.
 */

public class NachrichtenDataSource {

    private List<Nachricht> sport = new ArrayList<>();
    private List<Nachricht> economy = new ArrayList<>();
    private List<Nachricht> technik = new ArrayList<>();
    private List<Nachricht> politik = new ArrayList<>();


    public List<Nachricht> getSport() {
        Nachricht nachricht6 = new Nachricht("Sport Jazira", "DDR", "Berlin VS ESSEN", "sport");
        Nachricht nachricht7 = new Nachricht("Sprot Al Arabia ", "ZDF", "Bayern VS Dortmond", "sprot");
        Nachricht nachricht8 = new Nachricht("Sport Berlin", "D1", "Hamburg VS Bonn", "sport");

        sport.add(nachricht6);
        sport.add(nachricht7);
        sport.add(nachricht8);
        return sport;
    }


    public List<Nachricht> getEconomy() {
        Nachricht nachricht5 = new Nachricht("$ VS. €", "Morad", "Sorry2 gesunken !", "economy");
        economy.add(nachricht5);
        return economy;
    }


    public List<Nachricht> getTechnik() {
        Nachricht nachricht4 = new Nachricht("thichnelogie", "No Aoutor1", "Sorry1 !", "technik");
        technik.add(nachricht4);
        return technik;
    }

    public List<Nachricht> getPolitik() {
        Nachricht nachricht1 = new Nachricht("The Wore in Syria", "MOhammad", "bevor 6 jahren fang der Krieg in Syrien und bin ich nach Deutschland geflüchtet.", "politik");
        Nachricht nachricht2 = new Nachricht("Das Griek ", "Ahmad", "bevor 8 jahren fang der Krieg in Syrien und bin ich nach Deutschland geflüchtet.", "politik");
        Nachricht nachricht3 = new Nachricht("ISS in Bagdad", "Ali", "bevor 10 jahren fang der Krieg in Syrien und bin ich nach Deutschland geflüchtet.", "politik");
        politik.add(nachricht1);
        politik.add(nachricht2);
        politik.add(nachricht3);
        return politik;
    }

    public NachrichtenDataSource() {

    }

}
