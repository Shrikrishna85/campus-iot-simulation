# 🛰️ NEXUS | Smart Campus IoT Simulation Platform

NEXUS is a professional-grade Full-Stack IoT monitoring system. It bridges the gap between hardware telemetry and software analytics by simulating real-time sensor data, persisting it in a relational database, and serving it through a modern, responsive web dashboard.

## 🏗️ System Architecture
The project follows a modular Spring Boot architecture:
1. **Simulation Layer:** A background service that models environmental sensor behavior.
2. **Persistence Layer:** Uses **Spring Data JPA** and **Hibernate** for automated ORM with a **MySQL** database.
3. **API Layer:** A RESTful interface providing high-speed JSON data access.
4. **Presentation Layer:** A "Glassmorphism" styled frontend built with **JavaScript (Fetch API)** and **Bootstrap 5**.



## 🛠️ Technology Stack
* **Backend:** Java 17, Spring Boot 4.x
* **Database:** MySQL 8.0+
* **ORM:** Hibernate / Spring Data JPA
* **Frontend:** HTML5, CSS3, JavaScript (ES6+), Bootstrap 5
* **Version Control:** Git & GitHub

## 🚀 Key Features
* **Real-time Data Streaming:** Background scheduling triggers sensor updates every 5 seconds.
* **Live Dashboard:** Auto-refreshing UI with high-visibility system specifications (Node ID, Data Protocols).
* **Hardware Abstraction:** Software-based simulation of hardware Node `NX-SMVITM-085`.
* **RESTful Service:** Clean separation of concerns between data provider and data consumer.

## 📸 Dashboard Preview
The dashboard features a modern dark theme with "Glassmorphism" cards, providing live temperature readings and historical log tracking.



[Image of modern dashboard UI design]


## 💻 How to Run
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/Shrikrishna85/campus-iot-simulation.git](https://github.com/Shrikrishna85/campus-iot-simulation.git)
    ```
2.  **Database Setup:** Create a MySQL database named `campus_db`.
3.  **Configuration:** Update `src/main/resources/application.properties` with your MySQL username and password.
4.  **Launch:** Run `CampusSimApplication.java` from your IDE.
5.  **Access:** Open `http://localhost:8081` in your browser.

---
Developed by **Shrikrishna Hebbar** | Electronics & Communication Engineer
