/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewann;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
public class Serangga extends Hewan {

    /**
     * @return the Pernafasan
     */
    protected String getPernafasan() {
        return Pernafasan;
    }

    /**
     * @param Pernafasan the Pernafasan to set
     */
    protected void setPernafasan(String Pernafasan) {
        this.Pernafasan = Pernafasan;
    }

    /**
     * @return the JenisMulut
     */
    protected String getJenisMulut() {
        return JenisMulut;
    }

    /**
     * @param JenisMulut the JenisMulut to set
     */
    protected void setJenisMulut(String JenisMulut) {
        this.JenisMulut = JenisMulut;
    }

    private String Pernafasan;
    private String JenisMulut;

}
