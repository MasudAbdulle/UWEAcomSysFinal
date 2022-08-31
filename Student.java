/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uweacomsys;

import java.util.ArrayList;

/**
 *
 * @author zacchooi
 */
public class Student {
    
    String firstName;
    String lastName;
    int idNumber;
    private ArrayList<Student> students;
    

public Student(String firstName, String lastName, int idNumber){

this.firstName = firstName;
this.lastName = lastName;
this.idNumber = idNumber;

}

public String getfirstName(){
    return firstName;
}

public String getlastName(){
    return lastName;
}

public int getidNumber(){
    return idNumber;
}

public void setfirstName(String firstName){
    this.firstName = firstName;
}

public void setlastName(String lastName){
    this.lastName = lastName;
}

public void setidNumber(int idNumber){
    this.idNumber = idNumber;
}


}