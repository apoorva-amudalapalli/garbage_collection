package com.feedback;

import java.sql.*;
import java.util.*;

public class ComplaintService {

    public void submitComplaint(Complaint c) {
        Connection conn = DBConnection.getConnection();
        try {
            String query = "INSERT INTO complaints (name, location, description) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, c.name);
            ps.setString(2, c.location);
            ps.setString(3, c.description);
            ps.executeUpdate();
            System.out.println("Complaint submitted successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void viewComplaints() {
        Connection conn = DBConnection.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM complaints");

            System.out.println("\n--- All Complaints ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Location: " + rs.getString("location"));
                System.out.println("Description: " + rs.getString("description"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("-----------------------------");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void updateStatus(int id, String newStatus) {
        Connection conn = DBConnection.getConnection();
        try {
            String query = "UPDATE complaints SET status = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, newStatus);
            ps.setInt(2, id);
            int updated = ps.executeUpdate();
            if (updated > 0) {
                System.out.println("Status updated successfully.");
            } else {
                System.out.println("No such complaint ID found.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
