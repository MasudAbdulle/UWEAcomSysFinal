/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uweacomsys;

import javafx.beans.property.SimpleStringProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
/**
 *
 * @author hoyos
 */
public class Lease {
    
    private String leaseNo;
    private SimpleStringProperty leaseDuration; 
    private String student; 
    
    public Lease(String leaseNo, String leaseDuration, String student){
        this.leaseNo = leaseNo;
        this.leaseDuration = new SimpleStringProperty(leaseDuration);
        this.student= student;    
        
    }
    
    
    public String getStudent(){
        return this.student;
    }
          

    public String getLeaseNo() {
        return leaseNo;
    }
    
        public void addLease(Room r){
        
        r.setRoomStatus("occupied");
       
    }
     

    public void setLeaseNo(String leaseNo) {
        this.leaseNo = leaseNo;
    }

    public String getLeaseDuration() {
        return leaseDuration.get();
    }

    public void setLeaseDuration(String leaseDuration) {
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}