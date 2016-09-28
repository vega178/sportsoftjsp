/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author santhyago
 */
public class Team {

    private int id;
    private String name;
    private int id_Tornament;

    public Team() {
    }

    public Team(int id, String name, int id_Tornament) {
        this.id = id;
        this.name = name;
        this.id_Tornament = id_Tornament;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_Tornament() {
        return id_Tornament;
    }

    public void setId_Tornament(int id_Tornament) {
        this.id_Tornament = id_Tornament;
    }

}
