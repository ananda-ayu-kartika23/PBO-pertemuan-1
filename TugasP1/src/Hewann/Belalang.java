 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewann;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
public class Belalang extends Serangga {

    /**
     * @return the suara
     */
    protected String getSuara() {
        return suara;
    }

    /**
     * @param suara the suara to set
     */
    protected void setSuara(String suara) {
        this.suara = suara;
    }


    
    
    private String suara;
    
    public static void main(String[] args) {

        Belalang Kuning = new Belalang();
        
        Kuning.setJumlahKaki(6);
        Kuning.setWarnaTubuh("kuningg");
        Kuning.setJumlahMata(2);

        Kuning.setPernafasan("Trakea");
        Kuning.setJenisMulut("Pengunyah");

        Kuning.setSuara("KriikKriik");
        
        System.out.println("Jumlah kaki     : " + Kuning.getJumlahKaki());
        System.out.println("Warna tubuh     : " + Kuning.getWarnaTubuh());
        System.out.println("Jumlah mata     : " + Kuning.getJumlahMata());
        System.out.println("Pernafasan      : " + Kuning.getPernafasan());
        System.out.println("Jenis mulut     : " + Kuning.getJenisMulut());
        System.out.println("Suara khas      : " + Kuning.getSuara());
        
        


        
    }

   
    }

