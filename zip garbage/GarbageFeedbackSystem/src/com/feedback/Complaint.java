package com.feedback;

public class Complaint {
    int id;
    String name;
    String location;
    String description;
    String status;

    public Complaint(String name, String location, String description) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.status = "Pending";
    }

    public Complaint(int id, String name, String location, String description, String status) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.status = status;
    }
}

