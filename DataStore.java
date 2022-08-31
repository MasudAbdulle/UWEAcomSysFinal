package uweacomsys;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//import static uweaccomodationsysten.model.UWEAccomodationSystem.getInstance;

/**
 * 
 *
 * @author hoyos
 */
public class DataStore {
    
//    private static String DATA_STORE_FILE = "UWEBAS.uwe";
//    
//    private static boolean dataStoreExists(){
//        File file = new File(DATA_STORE_FILE);
//        
//    }
      
    
    
   private SimpleStringProperty cleaningStatus;
   private SimpleStringProperty hallNumber;
   private int roomNo;
   private int hallNo;
   private SimpleStringProperty hallName;
   private SimpleStringProperty studentName;
   private String leaseNo;
   private SimpleStringProperty occupancyStatus;
   private SimpleStringProperty roomStatus; 
   private SimpleStringProperty roomCleaningStatus;
   private SimpleStringProperty type;
   
   private float rentalRate;
    private Room room;
    private Hall hall;
    private ArrayList<Room> rooms;
     private ArrayList<Hall> halls;
    
   
    public DataStore(int roomNo,String hallName,int hallNo, String roomStatus , String type,String roomCleaningStatus, float rentalRate, Room room){
     this.hallName = new SimpleStringProperty(hallName);
     this.hallNo = hallNo;
     this.roomNo = roomNo;        
     this.roomStatus =new SimpleStringProperty(roomStatus);
     this.roomCleaningStatus = new SimpleStringProperty(roomCleaningStatus);
     this.type = new SimpleStringProperty(type);
     this.rentalRate = rentalRate; 
     this.room = room;
        
        
    }
    
    public int gethallNo(){
    return hallNo;}

    public String getLeaseNo() {
        return leaseNo;
    }
    
    public int getHallNo(){
    return hallNo;
    }
    
    public void setType(String type){}
    public String getType(){
    return type.get();
    }
     public String getRoomCleaningStatus(){return this.roomCleaningStatus.get();}
     

    public String getHallName() {
        return hallName.get();
    }

    public String getHallNumber() {
        return hallNumber.get();
    }

    public int getRoomNo() {
        return roomNo;
    }

    public String getStudentName() {
        return studentName.get();
    }

    public  String getOccupancyStatus() {
        return occupancyStatus.get();
    }

    public String getCleaningStatus() {
        return cleaningStatus.get();
    }
 
    public void addLease(Lease l){
        
       setType("occupied");
       }
    
    public void setRoomStatus(String roomStatus)
    {}
    
      public Room getRoom()
    {
        return this.room;
    } 
      
    
      
      
      
      
      public ArrayList<Room> getRooms(){
      return rooms;
      }
      
     
        public float getRentalRate() {return rentalRate;}
        
          public String getRoomStatus(){
        return this.roomStatus.get();} 
        
  

      private ArrayList<Room> getRooms(Hall hall)
    {
        ArrayList<Room> rooms = new ArrayList<Room>();
        
        for  (int roomNo = 0; roomNo<30; roomNo++)
        {
            // roomType roomType = RoomType.SINGLE; 
 
            float rentalRate = 550.0f;
            
            if (roomNo>=0 &&   roomNo<10){
                /*
                roomType = RoomType.SINGLE;
                description = descSingle;
*/
                rentalRate = 550.0f;
            }
            
            else if (roomNo>=10 && roomNo<25)
            {
               //  roomType = RoomType.DOUBLE;
                rentalRate = 650.0f;
            }
            else 
            {
                rentalRate = 800.0f;
               // roomType = RoomType.STUDIO;
                //description = descStudio;
            }
            
           // Room room = new Room( roomNo+1 , "Unoccupied","Single","Clean", rentalRate);
            
            hall.addRoom(room);
        }
        
        return rooms;
        
        
    }
      
    
        
    private ArrayList<Hall> gethalls()
    {
        ArrayList<Hall> halls = new ArrayList<Hall>();
        
      Hall BreconHall = new Hall("Brecon Hall" , "UWE FRENCCHAY" ,"01174783", 1);
      Hall MendipHall = new Hall("Mendip Hall" , "UWE FRENCCHAY" ,"01174783", 2);
      Hall QuanTockHall = new Hall("Quantock Hall" , "UWE FRENCCHAY" ,"01174783", 3);
        
      
      halls.add(BreconHall);
      halls.add(MendipHall);
      halls.add(QuanTockHall);
        return halls;
        
        
    }
    
 
  
    /*
   private static void populateStudents(Hall hall){
       
       Student[] students = {
           
           new Student("masud", "Abdulle", 1),
           new Student("masud", "Abdulle", 1),
           new Student("masud", "Abdulle", 1),
           new Student("masud", "Abdulle", 1),
           new Student("masud", "Abdulle", 1),
           new Student("masud", "Abdulle", 1),
           new Student("masud", "Abdulle", 1),
               
       };
       
       for (int i=0; i<students.length; i++)
       {
           hall.addStudent(students[i]);
       }
       
   }
        
           */
     
       
       ObservableList<Student> students = FXCollections.observableArrayList();
       
       
       
       
       
       
       
       
       // objects for one row 
         

         
        
        
        
       
        
        
        
        public ObservableList<Hall> getHalls(){
          ObservableList<Hall> halls = FXCollections.observableArrayList();
       halls.add(new Hall ("Brecon hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 1));
       halls.add(new Hall("Cotswold hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 2));
       halls.add(new Hall ("Quantock hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 3));
        halls.add(new Hall ("Mendip hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 4));
        return halls;
        // TODO
    }    
       
        
        
        
        
       
        
       
        
        
      
        
    public static void main(String[] args) {
        // TODO code application logic here
     
    }

 
    

   
   
   
   
   
   
    
    
    
}