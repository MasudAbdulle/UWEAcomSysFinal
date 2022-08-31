/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uweacomsys;

import java.util.ArrayList;
import java.util.logging.Logger;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author masud
 * 
 * 
 */

public class Hall {
     private SimpleStringProperty name,hallAddress, phoneNumber;
    
    private int hallNumber;
    private SimpleIntegerProperty totalNumberRooms;
    private ArrayList<Room> rooms = new ArrayList<Room>();
    // array of rooms 
     private ArrayList<Student> students;
    
    
    public Hall(){}

    public  Hall(String hallName, String hallAddress, String phoneNumber, int hallNumber) {
    this.name = new SimpleStringProperty(hallName);
    this.hallAddress = new SimpleStringProperty(hallAddress);
    this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.hallNumber = hallNumber;
      
        
    }

    public int getHallNumber() {
        return hallNumber;
    }
    
   public void addRoom(Room room) {
       rooms.add(room);
   }

    public String getName() {
        return name.get();
    }

    public String getHallAddress() {
        return hallAddress.get();
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

  //  public int getHallNumber() {
  //      return hallNumber;
    //}

    //public int getTotalNumberRooms() {
      //  return totalNumberRooms;
    //}
    
    public ArrayList<Room> getRooms(){
        return rooms; 
    }
    
        public void addStudent(Student student){
    students.add(student);
}
    
   
    //return hall;
    
    
    
     public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
    }
    
    }
   
    // get rooms 
    //add room
    //find room 
  