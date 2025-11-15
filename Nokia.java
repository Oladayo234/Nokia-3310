import java.util.Scanner;
public class Nokia{
    public static void main(String[]args){
    
    menu();

    }
    

    public static void menu(){
     Scanner input = new Scanner(System.in);
     System.out.println("""

        NOKIA MENU
        ---------------------------
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
        ----------------------------
    Enter a number to navigate 
"""); 
       
//    System.out.println("Chooose an option ");
    int phoneBook = input.nextInt();

    switch (phoneBook){
    case 1-> {
    System.out.println("""

    1. Search
    2. Service Nos
    3. Add name
    4. Erase
    5. Edit
    6. Assign tone
    7. Send b'card
    8. Options
    9. Speed dials
    10. Voice Tags

""");

 

//    System.out.println("Choose an option ");
        int optionEight = input.nextInt();

    switch (optionEight){
    case 8-> 
    System.out.println("""

    1. Type of view
    2. Memory Status
    

""");
        }
     }
}

    
//    System.out.print("Choose an option");
        int message = input.nextInt();

    switch (message){
    case 2-> {
    System.out.println("""

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



//    System.out.println("Choose an option");
        int messageSettings = input.nextInt();

    switch (messageSettings){
    case 7-> {System.out.println("""

    1. Set
    2. Common

""");
     

//    System.out.println("Choose an option");
        int set = input.nextInt();

    switch (set){
    case 1-> System.out.println("""

    1. Message centre number
    2. Message sent as
    3. Message validity

""");
     }


//    System.out.println("Choose an option");
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

//    System.out.println("Chooose an option");
        int chat = input.nextInt();

    switch (chat){
    case 3-> System.out.println("""

    1. Chat

""");   
     }


//     System.out.println("Chooose an option");
        int callRegister = input.nextInt();

    switch (callRegister){
    case 4-> {System.out.println("""

    1. Missed calls
    2. Recieved calls
    3. Dialled numbers
    4. Erase recent call lists
    5. Show call duration
    6. Show call cost
    7. Call cost settings
    8. Prepaid credit

""");


//    System.out.println("Choose an option");
        int missedCalls = input.nextInt();

    switch (missedCalls){
    case 1-> System.out.println("""
    1. Missed calls

""");
    }

//    System.out.println("Choose an option");
        int recievedCalls = input.nextInt();

    switch (recievedCalls){
    case 2-> System.out.println("""
    1. Recieved calls

""");
    }

//    System.out.println("Choose an option");
        int dialledNumber = input.nextInt();

    switch (dialledNumber){
    case 3-> System.out.println("""
    1. Dialled number

""");
    
    }
//    System.out.println("Choose an option");
        int eraserecent = input.nextInt();

    switch (eraserecent){
    case 4-> System.out.println("""
    1. Erase recent

""");
    }

//    System.out.println("Choose an option");
        int ShowCallDuration = input.nextInt();

    switch (ShowCallDuration){
    case 5-> System.out.println("""

    1. Last call duration
    2. All calls' duration
    3. Recieve calls' duration
    4. Dialled calls' duration
    5. Clear timers

""");
    }
     

//    System.out.println("Choose an option");
        int ShowCallCost = input.nextInt();

    switch (ShowCallCost){
    case 6-> System.out.println("""

    1. Last call cost
    2. All call's cost
    3. clear counter

""");
    }
      
//    System.out.println("Choose an option");
        int callCostSettings = input.nextInt();

    switch (callCostSettings){
    case 7-> System.out.println("""

    1. Call cost limit
    2. show costs in

""");
    }

//    System.out.println("Choose an option");
        int prepaid = input.nextInt();

    switch (prepaid){
    case 8-> System.out.println("""
    1. Erase recent

""");
    }
    }
    }

//    System.out.print("Choose an option");
        int tones = input.nextInt();

    switch (tones){
    case 5-> System.out.println("""

    1. Ringing tones
    2. Ringing Volumes
    3. Incoming call alert
    4. Composer
    5. Message alert tones
    6. Keypad tones
    7. Warning and game tones
    8. vibrating alert
    9. Screen saver

""");
    }


//     System.out.println("Chooose an option");
        int settings = input.nextInt();

    switch (settings){
    case 6-> {System.out.println("""

    1. Call Settings
    2. Phone Setting
    3. Security settings
    4. Restore Factory settings
    
""");

//    System.out.println("Choose an option");
        int callSetting = input.nextInt();

    switch (callSetting){
    case 1-> System.out.println("""
    1. Automatic redial
    2. Speed dialling
    3. Call waiting options
    4. Own number sending
    5. Phone line in use
    6. Automatic answer

"""); 
    }

//    System.out.println("Choose an option");
        int phoneSettings = input.nextInt();

    switch (phoneSettings){
    case 2-> System.out.println("""
    1. Language
    2. Cell info display
    3. Welcome note
    4. Network selection
    5. Lights
    6. Confirm SIM service actions


""");
    }

//    System.out.println("Choose an option");
        int securitySettings = input.nextInt();

    switch (securitySettings){
    case 3-> System.out.println("""
    1. PIN code request
    2. call barring service
    3. Fixed dialling
    4. Closed user group
    5. Phone security
    6. Change access codes

""");
    }

//    System.out.println("Choose an option");
         int restoreFactorySettings = input.nextInt();

    switch (restoreFactorySettings){
    case 4-> System.out.println("""
    1. Restore factory settings

""");
   }
   }
   }


    
//    System.out.println("Choose an option");
         int callDivert = input.nextInt();

    switch (callDivert){
    case 7-> System.out.println("""
    1. Call divert

""");   
    }



//    System.out.println("Choose an option");
         int games = input.nextInt();

    switch (games){
    case 8-> System.out.println("""
    1. Games
""");   
    }


//    System.out.println("Choose an option");
         int calculator = input.nextInt();

    switch (calculator){
    case 9-> System.out.println("""
    1. Calculator
""");   
    }


//    System.out.println("Choose an option");
         int reminder = input.nextInt();

    switch (reminder){
    case 10-> System.out.println("""
    1. reminder
""");   
    }


//    System.out.println("Choose an option");
         int clock = input.nextInt();

    switch (clock){
    case 11-> System.out.println("""
    1. Alarm clock
    2. Clock settings
    3. Date setting
    4. Stopwatch
    5. Countdown time
    6. Auto update of date and time
""");   
    }


//    System.out.println("Choose an option");
         int profiles = input.nextInt();

    switch (profiles){
    case 12-> System.out.println("""
    1. Profiles
""");   
    }

//   System.out.println("Choose an option");
         int simService = input.nextInt();

    switch (simService){
    case 13-> System.out.println("""
    1. SIM services
""");   
    }

}

}
