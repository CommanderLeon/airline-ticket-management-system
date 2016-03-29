/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Commander.LEON
 */
public class Flight {
    private String fid;
    private String departure;
    private String destination;
    private String dateTime;
    private String noSeats;
    private String planeNo;
    private String description;

    public Flight(String fid, String departure, String destination, String dateTime, String planeNo, String noSeats, String description) {
        this.fid = fid;
        this.departure = departure;
        this.destination = destination;
        this.dateTime = dateTime;
        this.noSeats = noSeats;
        this.planeNo = planeNo;
        this.description = description;
    }

    public String getPlaneNo() {
        return planeNo;
    }

    public void setPlaneNo(String planeNo) {
        this.planeNo = planeNo;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getNoSeats() {
        return noSeats;
    }

    public void setNoSeats(String noSeats) {
        this.noSeats = noSeats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
