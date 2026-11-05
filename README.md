# Smart Hospital Notification System

## Project Description

A Spring Boot application that manages hospital notifications using different notification services. It demonstrates dependency injection, bean selection, and external configuration.

## Technologies Used

* Java 17
* Spring Boot
* Maven
* IntelliJ IDEA

## Features

* Email notifications for routine patient alerts.
* SMS notifications for patient updates.
* Emergency notifications for urgent ICU alerts.
* Dependency injection using `@Autowired`.
* Bean selection using `@Primary` and `@Qualifier`.
* External configuration using `@Value` and environment variables.

## Project Structure

* `config` – Hospital configuration.
* `processor` – Processes patient alerts.
* `service` – Notification interface and implementations.

## Configuration

Create a `.env` file or configure these environment variables in your IDE:

```env
HOSPITAL_API_SECRET=your_secret_key_here
HOSPITAL_NAME=General City Hospital
```

Never commit your actual `.env` file or API secret to GitHub.

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Configure the required environment variables.
4. Run `SmartHospitalNotificationSystemApplication`.

## Author

Smart Hospital Notification System Project
