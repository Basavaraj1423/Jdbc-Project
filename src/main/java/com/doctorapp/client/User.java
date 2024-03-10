package com.doctorapp.client;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.exceptions.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

import java.util.List;

public class User {
    public static void main(String[] args) throws IdNotFoundException {
        IDoctorService service = new DoctorServiceImpl();
        //String doctorName, String speciality, double fees, int ratings, int experience
//        Doctor doctor = new Doctor("Robert","Arthropadician",900,4,25);
//        service.addDoctor(doctor);
        //service.updateDoctor(1,1000);
        //service.deleteDoctor(2);
//        try {
//            System.out.println(service.getById(1));
//        } catch (IdNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        List<Doctor> doctors = service.getAll();
//        for (Doctor doctorList : doctors){
//            System.out.println(doctorList +"   ");
//        }
//        try {
//            System.out.println(service.getBySpeciality("Oncologiest"));
//        } catch (DoctorNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            List<Doctor> doctors = service.getBySpecialityAndExperience("Oncologiest",24);
//            for (Doctor doctor : doctors){
//                System.out.println(doctor + " ");
//            }
//        } catch (DoctorNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            System.out.println(service.getBySpecialityAndLessFees("Arthropadician",900));
//        } catch (DoctorNotFoundException e) {
//            throw new RuntimeException(e);

//        }
//        try {
//            System.out.println(service.getBySpecialityAndRatings("Arthropadician",4));
//        } catch (DoctorNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        try {
            System.out.println(service.getBySpecialityAndNameContainsWith("Cardiologiest","A"));
        } catch (DoctorNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
