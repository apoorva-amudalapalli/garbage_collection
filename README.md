📌 Garbage Management Feedback System
📖 Overview
This project is a web-based feedback management system that allows users to submit complaints related to garbage management. The application is built using Java, JDBC, HTML, CSS, and MySQL, providing real-time feedback submission and storage in a backend database.

💻 Technologies Used
Java (Core Java, Servlets)

JDBC (Java Database Connectivity)

HTML/CSS

MySQL

Eclipse IDE

⚙️ Features
User-friendly feedback submission form

JDBC-based interaction with MySQL database

Validations for form fields

Stores user complaints with location and description

📂 Project Structure
css
Copy
Edit
garbage-management/
│
├── src/
│   └── com/garbage/feedback/
│       ├── Main.java
│       ├── DBConnection.java
│       └── SubmitFeedback.java
│
├── WebContent/
│   ├── index.html
│   ├── success.jsp
│   └── error.jsp
│
├── .classpath
├── .project
└── README.md
🏁 How to Run
Import the project into Eclipse as an existing project.

Setup MySQL with a database named garbage_feedback.

Run the SQL script to create the required table:

sql
Copy
Edit
CREATE TABLE complaints (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    location VARCHAR(100),
    description TEXT
);
Update DB credentials in DBConnection.java.

Run the project on a local Tomcat server.

Navigate to localhost:8080/garbage-management/index.html.

✍️ Author
Apoorva Amudalapalli
[Your Name]

