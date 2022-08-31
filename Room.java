/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uweacomsys;

import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author hoyos
 */
public class Room {
    private int roomNo;
    private SimpleStringProperty roomStatus; 
    private SimpleStringProperty roomCleaningStatus;
    private SimpleStringProperty type;
    private int hallNo;
    private float rentalRate;
    
    private Lease lease;
    
    private CleaningStatus cleaningStatus;
   
    
    private SimpleStringProperty hallName;
    
private ArrayList<Room> rooms;
  
    public Room (int roomNo, String roomStatus , String type,String roomCleaningStatus, float rentalRate){
        this.roomNo = roomNo;
        
        this.roomStatus =new SimpleStringProperty(roomStatus);
        
        this.roomCleaningStatus = new SimpleStringProperty(roomCleaningStatus);
        this.type = new SimpleStringProperty(type);
        
        this.rentalRate = rentalRate; 
        
    }
          
 
    public int gethallNo(){
    return hallNo;}
    public void deleteLease(){
        this.lease = null;
    }
    public void deleteCleaningStatus(){
    this.cleaningStatus = null;
    }
    
    public void addLease(Lease lease)
    {
        this.lease = lease;
    }
    
    public void addCleaningStatus(CleaningStatus cleaningStatus){
    
    this.cleaningStatus = cleaningStatus;
    }
    
    public Lease getLease(){
        return this.lease;
    }
    public CleaningStatus getCleaningStatus(){
    
    return this.cleaningStatus;}

            
    public int getRoomNo(){
        return roomNo;}
    
    public void setRoomNo(String roomNo){}
    
    public String getRoomStatus(){
        return this.roomStatus.get();} 
    
    public void setRoomStatus(String roomStatus)
    {}
    
    public float getRentalRate() {return rentalRate;}
    
    public float setRentalRate() {return rentalRate;}
    
     public String getType(){
    return type.get();
    }
    
    public void setRentalRate(float rentalRate) { this.rentalRate = rentalRate;}
    
    public String getRoomCleaningStatus(){
        return this.roomCleaningStatus.get();}
    public void setRoomCleaningStatus(String roomCleaningStatus ) {}
    
     public ArrayList<Room> getRooms(){
      return rooms;
      }
     
     
     
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
    }
    
}