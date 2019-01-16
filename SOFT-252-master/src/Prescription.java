/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marti
 */
public class Prescription {
    public String prescriptionCode;
    public User patientInfo;
    public User doctorInfo;
    public String notes;
    public PrescribedMedicine[] medicines;
}
