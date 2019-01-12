/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.management.system;

/**
 *
 * @author Ben G
 */
public class Users {
    
    protected userType userType;
    protected String ID = "";
    protected String password = "";
    
    public user(String ID, String password){
        
    }
    
    public userType getUserType(){
        return userType;
    }
    
    
}
