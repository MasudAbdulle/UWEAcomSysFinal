/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uweacomsys;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author masud
 */
public class LoginController implements Initializable {
    
 
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
    }    
    
    
    
    
     public void managerView(ActionEvent event) throws Exception{
    Parent managerViewParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    
    Scene managerViewScene = new Scene(managerViewParent);
    
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(managerViewScene);
    window.show();
    
    
    
    
        
    
    }
    
     public void wardenView(ActionEvent event) throws Exception{
    Parent wardenViewParent = FXMLLoader.load(getClass().getResource("warden.fxml"));
    
    Scene wardenViewScene = new Scene(wardenViewParent);
    
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(wardenViewScene);
    window.show();
    
    
    
    
        
    
    }
     
     
     public void SuperView(ActionEvent event) throws Exception{
    Parent wardenViewParent = FXMLLoader.load(getClass().getResource("superuser.fxml"));
    
    Scene wardenViewScene = new Scene(wardenViewParent);
    
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(wardenViewScene);
    window.show();
    
    
    
    
        
    
    }
    
    
    
}

