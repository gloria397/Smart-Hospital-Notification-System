package org.example.smarthospitalnotificationsystem.service;


import org.springframework.stereotype.Component;

@Component("emergencyService")
public class EmergencyUrgentNotificationService implements NotificationService {

    @Override
    public void sendNotification(int patientId, String message) {
        System.out.println("am done" +
                " EMERGENCY ICU ALERT");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Message: " + message);
    }
}