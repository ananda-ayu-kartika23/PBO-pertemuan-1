/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tumbuhan;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
public class Dikotil extends Tumbuhan{

    /**
     * @return the JenisBiji
     */
    protected int getJenisBiji() {
        return JenisBiji;
    }

    /**
     * @param JenisBiji the JenisBiji to set
     */
    protected void setJenisBiji(int JenisBiji) {
        this.JenisBiji = JenisBiji;
    }

    /**
     * @return the JenisAkar
     */
    protected String getJenisAkar() {
        return JenisAkar;
    }

    /**
     * @param JenisAkar the JenisAkar to set
     */
    protected void setJenisAkar(String JenisAkar) {
        this.JenisAkar = JenisAkar;
    }

    
    private int JenisBiji;  
    private String JenisAkar;
    
            

}
