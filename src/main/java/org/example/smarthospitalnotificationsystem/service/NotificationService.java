package org.example.smarthospitalnotificationsystem.service;

public interface NotificationService {
    void sendNotification(int patientId, String message);
}
