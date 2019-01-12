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
public class Patient extends Users implements IViewRatings{
    
    public Patient(String ID, String password){
        this.ID = ID;
        this.password = password;
    }
    
    public void requestAccountCreation(){
            
    }
    
    public void provideFeedback(){
        
    }
    
    public void requestAppointment(){
        
    }
    
    public void viewHistory(){
        
    }
    
    public void viewAppointment(){
        
    }
    
    public void viewPrescription(){
        
    }
    
    public void requestAccountTermination(){
        
    }

    @Override
    public void viewRatings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
