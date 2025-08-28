/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
public class Kendaraan {

    /**
     * @return the Roda
     */
    protected int getRoda() {
        return Roda;
    }

    /**
     * @param Roda the Roda to set
     */
    protected void setRoda(int Roda) {
        this.Roda = Roda;
    }

    /**
     * @return the Mesin
     */
    protected String getMesin() {
        return Mesin;
    }

    /**
     * @param Mesin the Mesin to set
     */
    protected void setMesin(String Mesin) {
        this.Mesin = Mesin;
    }
    private int Roda;
    private String Mesin;
}
