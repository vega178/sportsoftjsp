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
public class Referee extends Employee {
    private String position;
    private int idGame;

    public Referee() {
    }

    public Referee(String position, int idGame) {
        this.position = position;
        this.idGame = idGame;
    }

    public Referee(String position, int idGame, int id, String name, String lastName, String documentType, String documentNumber, String email, String telephone, String address, int idEntity, int userType) {
        super(id, name, lastName, documentType, documentNumber, email, telephone, address, idEntity, userType);
        this.position = position;
        this.idGame = idGame;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }
    
    
    
}
