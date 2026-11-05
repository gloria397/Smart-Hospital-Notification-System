package org.example.smarthospitalnotificationsystem.processor;
import org.example.smarthospitalnotificationsystem.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PatientAlertProcessor {

    // Default notification service
    @Autowired
    private NotificationService notificationService;

    // Specifically selected emergency service
    @Autowired
    @Qualifier("emergencyService")
    private NotificationService emergencyService;
    @Autowired
    @Qualifier("smsService")
    private NotificationService smsService;

    public void processRoutineAlert(int patientId, String message) {
        notificationService.sendNotification(patientId, message);
    }

    public void processEmergencyAlert(int patientId, String message) {
        emergencyService.sendNotification(patientId, message);
    }
    public void processSmsAlert(int patientId, String message) {
        smsService.sendNotification(patientId, message);
    }
}
