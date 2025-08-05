package com.feedback;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComplaintService service = new ComplaintService();

        while (true) {
            System.out.println("\n--- Garbage Feedback System ---");
            System.out.println("1. Submit Complaint");
            System.out.println("2. View All Complaints (Admin)");
            System.out.println("3. Update Complaint Status (Admin)");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter location: ");
                    String loc = sc.nextLine();
                    System.out.print("Enter complaint description: ");
                    String desc = sc.nextLine();

                    Complaint c = new Complaint(name, loc, desc);
                    service.submitComplaint(c);
                    break;

                case 2:
                    service.viewComplaints();
                    break;

                case 3:
                    System.out.print("Enter complaint ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new status (Pending/In Progress/Resolved): ");
                    String status = sc.nextLine();
                    service.updateStatus(id, status);
                    break;

                case 4:
                    System.out.println("Thank you. Bye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}

