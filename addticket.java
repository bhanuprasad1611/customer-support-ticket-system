public class addticket {
    
    int ticketId;
    String customerName;
    String issue;
    String priority;
    String status;

    addticket(int ticketId, String customerName, String issue, String priority,String status) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.issue = issue;
        this.priority = priority;
        this.status = status;
    }

    public void displayticket(){
         System.out.println("ticket id is:"+this.ticketId);
         System.out.println("customer name is:"+this.customerName);
         System.out.println("issue is:"+this.issue);
         System.out.println("enter your priority:"+this.priority);
         System.out.println("status is:"+this.status);
    }
    
    public int getticketId(){
        return ticketId;
    }
    public void setStatus(String status) {
    this.status = status;
}
}


