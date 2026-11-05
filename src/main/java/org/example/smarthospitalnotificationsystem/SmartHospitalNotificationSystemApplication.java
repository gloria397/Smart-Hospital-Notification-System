package org.example.smarthospitalnotificationsystem;

import org.example.smarthospitalnotificationsystem.config.HospitalConfiguration;
import org.example.smarthospitalnotificationsystem.processor.PatientAlertProcessor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SmartHospitalNotificationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                SmartHospitalNotificationSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner run(PatientAlertProcessor processor,
                          HospitalConfiguration hospital) {

        return args -> {

            System.out.println("HOSPITAL NOTIFICATION SYSTEM");
            System.out.println("Hospital: " + hospital.getHospitalName());

            processor.processRoutineAlert(
                    101, "Appointment reminder");

            System.out.println();

            processor.processEmergencyAlert(
                    102, "Critical ICU alert");

            System.out.println();

            processor.processSmsAlert(
                    103, "Your appointment is confirmed");

            System.out.println();
            System.out.println("All notifications processed successfully!");
        };
    }
}

