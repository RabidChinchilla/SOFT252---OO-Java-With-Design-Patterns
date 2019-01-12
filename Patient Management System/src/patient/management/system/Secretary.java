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
public class Secretary extends Users implements ICreateAppointments{
    
    public Secretary(String ID, String password){
        this.ID = ID;
        this.password = password;
    }
    
    public void approvePatientAccount(){
        
    }
    
    public void recieveAppointmentRequests(){
        
    }
    
    public void giveMedicines(){
        
    }
    
    public void orderMedicine(){
        
    }
    
    public void removePatient(){
        
    }
    
    public void approvePatientAccountRemoval(){
        
    }

    @Override
    public void createAppointment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
