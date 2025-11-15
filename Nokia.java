import java.util.Scanner;
public class Nokia{
    public static void main(String[]args){
    
    menu();

    }
    

    public static void menu(){
     Scanner input = new Scanner(System.in);
     System.out.println("""

    
        1. Phonebook
        2. Messages
        3. Chats
        4. Call register
        5. Tones
        6. Settings
        7. Call divert
        8. Games
        9. Calculator
        10. Reminder
        11. Clock
        12. Profiles
        13. SIM services

"""); 
       



    System.out.println("Chooose an option ");
    int phoneBook = input.nextInt();

    switch (phoneBook){
    case 1-> {System.out.println("""

    1. Search
    2. Service Nos
    3. Add name
    4. Erase
    5. Edit
    6. Assign tone
    7. Send b'card
    8. Options
    9. Speed dials
    10. VOice Tags

""");

 





    System.out.println("Choose an option ");
    int optionEight = input.nextInt();

    switch (optionEight){
    case 8-> System.out.println("""

    1. Type of view
    2. Memory Status
    

""");
        }
     }
}





    System.out.print("Choose an option");
    int message = input.nextInt();

    switch (message){
    case 2-> {System.out.println("""

    1. Write message
    2. Inbox
    3. Outbox
    4. Picture messages
    5. Templates
    6. Smileys
    7. Message settings
    8. info service
    9. Voice mailbox number
    10. Service command editor

""");



    System.out.println("Choose an option");
    int messageSettings = input.nextInt();

    switch (messageSettings){
    case 7-> {System.out.println("""

    1. Set
    2. Common

""");
     

    System.out.println("Choose an option");
    int set = input.nextInt();

    switch (set){
    case 1-> System.out.println("""

    1. Message centre number
    2. Message sent as
    3. Message validity

""");
        }


    System.out.println("Choose an option");
    int common = input.nextInt();

    switch (common){
    case 2-> System.out.println("""

    1. Delivery Reports
    2. Reply via same Centre
    3. Character Support

""");
        }
    }
    }
  }
}

//    System.out.print("Chooose an option");
//    int chat = input.nextInt();
//
//    switch (chat){
//    case 3-> System.out.println("""
//
//    1. Chat
//
//""");
//
//     }
//    
//
//
//
//
//
//
//
//
//
//
//
//
//     System.out.print("Chooose an option");
//        int callRegister = input.nextInt();
//
//    switch (callRegister){
//    case 4-> System.out.println("""
//
//    1. Missed calls
//    2. Recieved calls
//    3. Dialled numbers
//    4. Erase recent call lists
//    5. Show call duration
//    6. Show call cost
//    7. Call cost settings
//    8. Prepaid credit
//
//""");
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//    System.out.print("Choose an option");
//    int ShowCallDuration = input.nextInt();
//
//    switch (ShowCallDuration){
//    case 5-> System.out.println("""
//
//    1. Last call duration
//    2. All calls' duration
//    3. Recieve calls' duration
//    4. Dialled calls' duration
//    5. Clear timers
//
//""");
//     }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    System.out.print("Choose an option");
//    int ShowCallCost = input.nextInt();
//
//    switch (ShowCallCost){
//    case 5-> System.out.println("""
//
//    1. Last call cost
//    2. All call's cost
//    3. clear counter
//
//""");
//     }
//
//
//
//
//
//
//
//
//
//
//
//
//    System.out.print("Choose an option");
//    int callCostSettings = input.nextInt();
//
//    switch (callCostSettings){
//    case 5-> System.out.println("""
//
//    1. Call cost limit
//    2. show costs in
//
//""");
//     }
//
//
//
//
//
//
//
//
//
//
//



}

}
