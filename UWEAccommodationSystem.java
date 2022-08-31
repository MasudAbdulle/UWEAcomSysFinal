/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uweacomsys;

import java.util.ArrayList;

/**
 *
 * @author masud
 */
public class UWEAccommodationSystem 
{
    
    private static UWEAccommodationSystem uweAccommodationSystem = null;
    
    public static UWEAccommodationSystem getIntsance()
    {
        if (uweAccommodationSystem == null)
        {
            uweAccommodationSystem = new UWEAccommodationSystem();
            uweAccommodationSystem.initializeData();
      
        }
        
        return uweAccommodationSystem;
    }
    
    private ArrayList<Hall> halls;
    
    public ArrayList<Hall> getHalls()
    {
        return this.halls;
    }
    
    public static UWEAccommodationSystem getIntsance1()
    {
        if (uweAccommodationSystem == null)
        {
            uweAccommodationSystem = new UWEAccommodationSystem();
            uweAccommodationSystem.initializeWardenData();
      
        }
        
        return uweAccommodationSystem;
    }
    
   
    
 
    
    private ArrayList<Room> getRooms()
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
            
            Room room = new Room( roomNo+1 , "Unoccupied","Single","Null", rentalRate);
            
             rooms.add(room);
        
        }
     
        return rooms;
        
        
    }
      
    public void initializeData()
    {
        ArrayList<Hall> halls = getAllHalls();
        
        for (Hall hall : halls)
        {
           ArrayList<Room> rooms = getRooms();
           for (Room room : rooms)
           {
               hall.addRoom(room);
           }
        }
        
        this.halls = halls;

    }

    
      public void initializeWardenData()
    {
        ArrayList<Hall> halls = getOneHall();
        
        for (Hall hall : halls)
        {
           ArrayList<Room> rooms = getRooms();
           for (Room room : rooms)
           {
               hall.addRoom(room);
           }
        }
        
        this.halls = halls;

    }

        
      public ArrayList<Hall> getAllHalls(){
          ArrayList<Hall> halls = new ArrayList<Hall>();
       halls.add(new Hall ("Brecon hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 1));
       halls.add(new Hall("Cotswold hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 2));
       halls.add(new Hall ("Quantock hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 3));
        halls.add(new Hall ("Mendip hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 4));
        return halls;
        
      }
      
      
      
      
      public ArrayList<Hall> getOneHall(){
          ArrayList<Hall> halls = new ArrayList<Hall>();
       halls.add(new Hall ("Brecon hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 1));
  
        return halls;
        
      }
    
    
    
    
}
