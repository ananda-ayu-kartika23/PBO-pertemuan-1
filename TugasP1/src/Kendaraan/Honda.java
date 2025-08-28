/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
public class Honda extends MobilPribadi {

    /**
     * @return the Merk
     */
    protected String getMerk() {
        return Merk;
    }

    /**
     * @param Merk the Merk to set
     */
    protected void setMerk(String Merk) {
        this.Merk = Merk;
    }

    /**
     * @return the Fitur
     */
    protected String getFitur() {
        return Fitur;
    }

    /**
     * @param Fitur the Fitur to set
     */
    protected void setFitur(String Fitur) {
        this.Fitur = Fitur;
    }
    private String Merk;
    private String Fitur;
    
    public static void main(String[] args) {

        Honda honda = new Honda();
        
        honda.setRoda(4);
        honda.setMesin("VTEC Turbo");

        honda.setJumlahPenumpang("6");
        honda.setDesain("sporty");

        honda.setMerk("civic");
        honda.setFitur("CMBS");
        
        System.out.println("Jumlah Roda        : " + honda.getRoda());
        System.out.println("Mesin              : " + honda.getMesin());
        System.out.println("Jumlah Penumpang   : " + honda.getJumlahPenumpang());
        System.out.println("Desain             : " + honda.getDesain());
        System.out.println("Merk               : " + honda.getMerk());
        System.out.println("Fitur              : " + honda.getFitur());



        
        



        
    }
    
}
