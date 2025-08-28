/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
public class MobilPribadi extends Kendaraan {

    /**
     * @return the JumlahPenumpang
     */
    protected String getJumlahPenumpang() {
        return JumlahPenumpang;
    }

    /**
     * @param JumlahPenumpang the JumlahPenumpang to set
     */
    protected void setJumlahPenumpang(String JumlahPenumpang) {
        this.JumlahPenumpang = JumlahPenumpang;
    }

    /**
     * @return the Desain
     */
    protected String getDesain() {
        return Desain;
    }

    /**
     * @param Desain the Desain to set
     */
    protected void setDesain(String Desain) {
        this.Desain = Desain;
    }
    private String JumlahPenumpang;
    private String Desain;
    
}
