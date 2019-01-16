/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Marti
 */
public class UserPatient extends User{
    
    public Appointment[] appointments;
    public Prescription[] prescriptions;
    
    @Override
    public void ShowUserUi()
    {
        System.out.println("PATIENT SHOW USER UI CALLED!");
        //UserDatabase.GetInstance().TryLogin("", "");
    }
}
