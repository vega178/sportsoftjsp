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
public class Tournaments {
    private int id;
    private String name_tournaments;
    private String start_date;
    private String finis_date;
    private int id_user;
    private String description;
    private int id_sport;

    public Tournaments() {
    }

    public Tournaments(int id, String name_tournaments, String start_date, String finis_date, int id_user, String description, int id_sport) {
        this.id = id;
        this.name_tournaments = name_tournaments;
        this.start_date = start_date;
        this.finis_date = finis_date;
        this.id_user = id_user;
        this.description = description;
        this.id_sport = id_sport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_tournaments() {
        return name_tournaments;
    }

    public void setName_tournaments(String name_tournaments) {
        this.name_tournaments = name_tournaments;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getFinis_date() {
        return finis_date;
    }

    public void setFinis_date(String finis_date) {
        this.finis_date = finis_date;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_sport() {
        return id_sport;
    }

    public void setId_sport(int id_sport) {
        this.id_sport = id_sport;
    }
    
    
}
