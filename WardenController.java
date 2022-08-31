/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uweacomsys;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.cell.TextFieldTableCell;


/**
 * FXML Controller class
 *
 * @author masud
 */
public class WardenController implements Initializable {
    
    private ArrayList<Hall> halls;
    
    @FXML
    private TableView<DataStore>  table1;
    
      private ObservableList<DataStore> tableData = FXCollections.observableArrayList();
     
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        table1.setEditable(true);
      
        
        
 
         
         
       
        // redo this part
     //leaseNo.setCellValueFactory(new PropertyValueFactory<DataStore, String>("leaseNo"));
      hallName.setCellValueFactory(new PropertyValueFactory<DataStore, String>("hallName"));
     // hallNo.setCellValueFactory(new PropertyValueFactory<DataStore, String>("hallNumber"));
      // StudentName.setCellValueFactory(new PropertyValueFactory<DataStore, String>("studentName"));
        roomNO.setCellValueFactory(new PropertyValueFactory<DataStore, String>("roomNo"));
         occupancyStatus.setCellValueFactory(new PropertyValueFactory<DataStore, String>("type"));
        cleaningStatus.setCellValueFactory(new PropertyValueFactory<DataStore, String>("rentalRate"));
        
        
        
        
        
        // TODO
     // make editable
     
     table1.setItems(tableData);
     
     populateTable();
     
    
      
    
    }
      
       


    
    private ArrayList<Room> rooms;

    /**
     * Initializes the controller class.
     *
     */
        @FXML
    private TableColumn<DataStore, String> StudentName;

    @FXML
    private TableColumn<DataStore, String> cleaningStatus;

    @FXML
    private TableColumn<DataStore, String> hallName;

    @FXML
    private TextField hallNameText;

    @FXML
    private TableColumn<DataStore, String> hallNo;

    @FXML
    private TextField hallNoText;

    

    @FXML
    private TableColumn<DataStore, String> leaseNo;

    @FXML
    private TextField leaseNotext;

    @FXML
    private TableColumn<DataStore, String> occupancyStatus;
    
        @FXML
    private TextField occupancyText;

    @FXML
    private TableColumn<DataStore, String> roomNO;

    @FXML
    private TextField roomNoText;

    @FXML
    private TextField studentNameText;
    
    
        @FXML
    private TextField cleaningStatusText;
            @FXML
    private TextField leaseDurationText;
            
              @FXML
    private TextField studentTextField;
              
        @FXML
    private Button updateCleaning;
            
        @FXML
    private Label noOfRooms;
   
               

    
    
    /*  public void changeRoomStatusCellEvent(CellEditEvent editedCell){
    
    DataStore selectedrows= (DataStore) table1.getSelectionModel().getSelectedItem();
    selectedrows.setRoomStatus(editedCell.getNewValue().toString());
    
    }
*/
    
        

    

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
            
            Room room = new Room( roomNo+1 , "Unoccupied","Single","Clean", rentalRate);
            
             rooms.add(room);
        
        }
     
        return rooms;
        
        
    }
      
     public void initializeWardenData()
    {
        ArrayList<Hall> halls = getHalls();
        
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
     
     

        
      public ArrayList<Hall> getHalls(){
          ArrayList<Hall> halls = new ArrayList<Hall>();
       halls.add(new Hall ("Brecon hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 1));
       halls.add(new Hall("Cotswold hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 2));
       halls.add(new Hall ("Quantock hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 3));
        halls.add(new Hall ("Mendip hall" , "Coldharbour Lane Frenchay Bristol BS16 1ZG", "0117 32 83601", 4));
        return halls;
        
      }
      
       
    public void Selected(){
        
    //    selects rows and put the data inside the cells into appropriate text boxes
           DataStore selected= (DataStore) table1.getSelectionModel().getSelectedItem();
           
           Room room = selected.getRoom();
           
      hallNameText.setText(selected.getHallName());
      
     
      // gets occupancystatus into box
     //occupancyText.setText(selected.getType());
    
    // gets cleaningf  status 
    
     //cleaningStatusText.setText(selected.getRoomCleaningStatus());
    
// 
      
   hallNoText.setText(String.valueOf(selected.getType()));
     
     cleaningStatusText.setText(String.valueOf(selected.getRoomStatus()));
    roomNoText.setText(String.valueOf(selected.getRoomNo()));
    
    CleaningStatus cleaningStatus = room.getCleaningStatus();
  
    if (cleaningStatus != null)
    {
      //  String studentName = lease.getStudent();
        //String leaseNo = lease.getLeaseNo();
        //String leaseDuration = lease.getLeaseDuration();
        String cleaningStatusS = cleaningStatus.getCleaningStatus();
        cleaningStatusText.setText(cleaningStatusS);
    
        
        
    }
    else
    {
      //   leaseNotext.setText("");
        //leaseDurationText.setText("");
        //studentNameText.setText(""); 
        cleaningStatusText.setText("");
    }
    
    }
    
    // change method so that it changes only one rooms cleaning status 
    public void updatecleaningStatus(){
    
    DataStore selected= (DataStore) table1.getSelectionModel().getSelectedItem();
    
    
    Room room = selected.getRoom();
    
    
    
   CleaningStatus newCleaningStatus = new CleaningStatus(cleaningStatusText.getText());
    
    room.addCleaningStatus(newCleaningStatus);
    
    
    
    populateTable();
    
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Cleaning Status");
    alert.setContentText("Cleaning Status Updated!");
    alert.show();
    
  
    }
    
    
    public static boolean TextAlphabet(TextField input, Label inputLabel, String validationText){
        boolean isAlpha = true;
       String validationString = null;
       
       if (!input.getText().matches("[a-z A-Z]+")){
       isAlpha = false;
       validationString = validationText;
       
       }
       inputLabel.setText(validationText);
       
       System.out.println(input.getText().matches("[a-z A-Z]+"));
       return isAlpha;
    }
    
    public void deleteLease()
    {
         DataStore selected= (DataStore) table1.getSelectionModel().getSelectedItem();
        
    Room room = selected.getRoom();
    
    room.deleteLease();
    
    
    leaseNotext.setText("");
    leaseDurationText.setText("");
    studentNameText.setText(""); 
        
        
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Lease Status");
    alert.setContentText("Lease Deleted!");
    alert.show();
   
    }
    
    
    public void deleteCleaningStatus()
    {
         DataStore selected= (DataStore) table1.getSelectionModel().getSelectedItem();
    
    Room room = selected.getRoom();
    
    room.deleteCleaningStatus();
    
    cleaningStatusText.setText("");
    
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Cleaning Status");
    alert.setContentText("Cleaning Status Deleted!");
    alert.show();
    }
public void updateLeasePushed(){ 
    DataStore selected= (DataStore) table1.getSelectionModel().getSelectedItem();
    
    Room room = selected.getRoom();
    
    
    
    
    Lease newLease = new Lease(leaseNotext.getText(),
                               leaseDurationText.getText(),
                               studentNameText.getText());
    
    room.addLease(newLease);
    
    populateTable();
    
    
    // selected.addLease(newLease);
    
    // table1.refresh();
    
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Lease Status");
    alert.setContentText("Lease Updated!");
    alert.show();
 
    
    }
    
    
    
    
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
     
    
      
      
      
         private ArrayList<Room> getAllRooms()
    {
        ArrayList<Room> rooms = new ArrayList<Room>();
        
         
        
        
                  
        for (int roomNo = 0; roomNo<30; roomNo++)
        {
            String roomType = "Single";
         
            
            float rentalRate = 550.0f;
            
            if (roomNo>=0 && roomNo<10)
            {
                roomType = "Single";
                
            }
            else if (roomNo>=10 && roomNo< 25)
            {
                roomType = "Double";
                rentalRate = 650.0f;
                
            }
            else
            {
                rentalRate = 800.0f;
                roomType = "Studio";
                
            }
            
            Room room = new Room(   roomNo,
                                    "Unoccupied",
                                    
                                    "single",
                    
                   
                                    "NULL",
                                    rentalRate
                                 );

            rooms.add(room);
        }
    
        return rooms;
    }
    
     
      private void populateTable() 
      {
          UWEAccommodationSystem uweAccommodationSystem = UWEAccommodationSystem.getIntsance1();
          
              
              ArrayList<Hall> halls = uweAccommodationSystem.getHalls();
              
              
              for (Hall hall :halls){
                  
              int totalNumberofRooms = 0;
               ArrayList<Room> rooms = hall.getRooms();
              
                for (Room room : rooms) {
              
            tableData.add(new DataStore (
                    
                    room.getRoomNo(),
                    hall.getName(),
                    hall.getHallNumber(),
                    room.getRoomStatus(), 
                    room.getType(),
                    room.getRoomCleaningStatus(),
                    (room.getRentalRate()
                            ),
                    room
                    
                    ));
            
 
     
        // Repopulate the GUI table
         table1.setItems(tableData);
        
        totalNumberofRooms++;
     



    }
    
           
    System.out.println(totalNumberofRooms);
   

noOfRooms.setText("Number of rooms "+String.valueOf(totalNumberofRooms));

              }
              
      }
}
