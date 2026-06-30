
import java.util.*;

public class main1{
    public static void main(String[] args) {
        ArrayList<addticket> ticket=new ArrayList<>();
        Scanner sc=new  Scanner(System.in);
        ticketdetails t=new ticketdetails();
        while(true){
         System.out.println("-------welcome-----");
         System.out.println("1-->Add ticket");
         System.out.println("2-->view ticket");
         System.out.println("3-->search ticket");
         System.out.println("4-->update ticket");
         System.out.println("5-->delete ticket");
         System.out.println("6-->exit");
          System.out.println("select your option");
         int option=sc.nextInt();
         switch (option) {
             case 1:
                System.out.println("please enter your details");
                t.details(ticket, sc);
                 break;
            case 2:
                System.out.println("view  ticket");
                t.viewticket(ticket, sc);
                break;
            case 3:
                System.out.println("search ticket");
                t.searchticket(ticket, sc);
                break;
            case 4:
                System.out.println("update  ticket");
                t.updateTicket(ticket, sc);
                break;
            case 5:
                System.out.println("cancle ticket");
                t.cancleTicket(ticket, sc);
                break;
            case 6:
                System.out.println("exit");
                return;
             default:
                 System.out.println("enter valid option");
                 break;
         }
       
        }
      
    }
}