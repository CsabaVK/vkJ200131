/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csabavk
 */
public class Beolvasas {
    public String Hotel;
    public int arfelpanzio;
    public int arejszaka;
    //public int IFA = 460; nem jó
    
    public Beolvasas(String row) {
            String[] split = row.split(";");
            this.Hotel = split[0];
            this.arfelpanzio = Integer.parseInt(split[1]);
            this.arejszaka = Integer.parseInt(split[2]);
        }
    
    public String getHotel() {
        return Hotel;
    }

    public int getArfelpanzio() {
        return arfelpanzio;
    }

    public int getArejszaka() {
        return arejszaka;
    }

    /*public int getIFA() {
        return IFA;
    }*/

    
}
