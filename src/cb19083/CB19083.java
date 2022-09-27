


package cb19083;

import java.util.Scanner;

public class CB19083 {

    public static void main(String[] args) {
        
        int choice,select;
        Scanner scan = new Scanner(System.in);
        TestdbConnectionClass test = new TestdbConnectionClass();
        test.openConnection();
        
        QueryFromdb query = new QueryFromdb();
        InsertTodbclass insert = new InsertTodbclass();
        
        System.out.println("\n1. View Data:"); 
        System.out.println("\n2. Enter New Data :"); 
        System.out.println("\nYour Option :"); 
        select= scan.nextInt();
        
        switch(select)
        {
            case 1 : query.open();
                     break;
            case 2 :
                    System.out.println("\nHow many item want to key in :"); 
                    choice= scan.nextInt();
           
                        for (int i=0; i<choice; i++)
                           {
                             insert.insertData();
                           }
        }
        
        
         
           
           
           
           
           
              
               
         
        
        
        
    }
    
}
