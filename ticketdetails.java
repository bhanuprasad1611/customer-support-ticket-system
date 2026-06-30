
import java.util.*;

public class ticketdetails {
    public void details(ArrayList<addticket>  ticket,Scanner sc){
    System.out.print("Enter Ticket ID: ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Customer Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Issue: ");
    String issue = sc.nextLine();
    System.out.print("Enter Priority (High/Medium/Low): ");
    String priority = sc.nextLine();
    System.out.println("enter the status of your issue (Open/In Progress/Resolved/Closed): ");
    String  status =sc.nextLine();
    ticket.add(new addticket(id, name, issue, priority,status));
    System.out.println("Ticket Added Successfully.");
}
public  void viewticket(ArrayList<addticket>  ticket,Scanner sc){
    if(ticket.isEmpty()){
     System.out.println("no  tickets available");
    }
    for(addticket  t:ticket){
        t.displayticket();
    }
}
public void searchticket(ArrayList<addticket>  ticket,Scanner sc){
     System.out.println("enter the id:");
        int ticketId=sc.nextInt();
        boolean found=false;
        for(addticket  t:ticket){
            if(ticketId==t.getticketId()){
                t.displayticket();
                found=true;
                System.out.println("ticket found!........");
            }
        }
        if(found==false){
            System.out.println("No ticket found...");
        }

}
public void updateTicket(ArrayList<addticket> ticket, Scanner sc) {

    System.out.print("Enter Ticket ID: ");
    int ticketId = sc.nextInt();
    sc.nextLine();

    boolean found = false;

    for (addticket t : ticket) {
        if (t.getticketId() == ticketId) {

            System.out.println("Current Ticket Details:");
            t.displayticket();

            System.out.print("Enter New Status (Open/In Progress/Resolved/Closed): ");
            String status = sc.nextLine();

            t.setStatus(status);

            System.out.println("Ticket Updated Successfully.");

            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Ticket Not Found.");
    }
}
public void cancleTicket(ArrayList<addticket> ticket, Scanner sc) {

    System.out.print("Enter Ticket ID to cancle: ");
    int ticketId = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < ticket.size(); i++) {
        if (ticket.get(i).getticketId() == ticketId) {
            ticket.remove(i);
            System.out.println("Ticket cancled  Successfully.");
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Ticket Not Found.");
    }
}
}