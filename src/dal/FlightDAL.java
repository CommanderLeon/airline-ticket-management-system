/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import main.Flight;

/**
 *
 * @author Commander.LEON
 */
public class FlightDAL {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void insertFlight(Flight flObj){
        //Connect to db
        con = DBConnect.connect();
        
        try {
            String q = "INSERT INTO flight (FlightID,Departure,Destination,DateTime,PlaneNo,NoOfSeats) VALUES('"+flObj.getFid()+"','"+flObj.getDeparture()+"','"+flObj.getDestination()+"','"+flObj.getDateTime()+"','"+flObj.getPlaneNo()+"','"+flObj.getNoSeats()+"','"+flObj.getDescription()+"')";
            pst = con.prepareStatement(q);
            pst.execute();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }        
    }
    
}
