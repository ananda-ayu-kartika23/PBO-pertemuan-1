/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tumbuhan;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
public class Nangka extends Dikotil {

    /**
     * @return the WarnaBuah
     */
    protected String getWarnaBuah() {
        return WarnaBuah;
    }

    /**
     * @param WarnaBuah the WarnaBuah to set
     */
    protected void setWarnaBuah(String WarnaBuah) {
        this.WarnaBuah = WarnaBuah;
    }

    /**
     * @return the AromaBuah
     */
    protected String getAromaBuah() {
        return AromaBuah;
    }

    /**
     * @param AromaBuah the AromaBuah to set
     */
    protected void setAromaBuah(String AromaBuah) {
        this.AromaBuah = AromaBuah;
    }

    

    private String WarnaBuah;
    private String AromaBuah;

    public static void main(String[] args) {

        Nangka nangka = new Nangka();
        
        nangka.setFotosintesis("iya");
        nangka.setBatang("kayu");
        nangka.setWarnaDaun("hijau");

        nangka.setJenisBiji(2);
        nangka.setJenisAkar("tunggang");

        nangka.setWarnaBuah("kuning");
        nangka.setAromaBuah("menyengat");
        
        System.out.println("Batang         : " + nangka.getBatang());
        System.out.println("Fotosintesis   : " + nangka.getFotosintesis());
        System.out.println("Warna Daun     : " + nangka.getWarnaDaun());
        System.out.println("Jenis Biji     : " + nangka.getJenisBiji());
        System.out.println("Jenis Akar     : " + nangka.getJenisAkar());
        System.out.println("Warna Buah     : " + nangka.getWarnaBuah());
        System.out.println("Aroma Buah     : " + nangka.getAromaBuah());



    }

    }

