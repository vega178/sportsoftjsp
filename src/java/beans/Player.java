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
public class Player extends Employee{
    private String numberShirt;
    private double weight;
    private double height;
    private String birhtDate;
    private String position;
    private int idTeam;

    public Player() {
    }

    public Player(String numberShirt, double weight, double height, String birhtDate, String position, int idTeam) {
        this.numberShirt = numberShirt;
        this.weight = weight;
        this.height = height;
        this.birhtDate = birhtDate;
        this.position = position;
        this.idTeam = idTeam;
    }

    public Player(String numberShirt, double weight, double height, String birhtDate, String position, int idTeam, int id, String name, String lastName, String documentType, String documentNumber, String email, String telephone, String address, int idEntity, int userType) {
        super(id, name, lastName, documentType, documentNumber, email, telephone, address, idEntity, userType);
        this.numberShirt = numberShirt;
        this.weight = weight;
        this.height = height;
        this.birhtDate = birhtDate;
        this.position = position;
        this.idTeam = idTeam;
    }

    public String getNumberShirt() {
        return numberShirt;
    }

    public void setNumberShirt(String numberShirt) {
        this.numberShirt = numberShirt;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirhtDate() {
        return birhtDate;
    }

    public void setBirhtDate(String birhtDate) {
        this.birhtDate = birhtDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }
    
    
}
