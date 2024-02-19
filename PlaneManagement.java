import java.util.*;
public class PlaneManagement{

    //creating instance variables
    private static final Ticket [] tickets=new Ticket[52];
    private static int ticketCount=0;
    private static final int[][] seats = new int[4][];





    public static boolean emailchecker(String email){
        if(email.contains("@")&&email.contains(".")){
            return true;
        }else{
            return false;
        }
    }
    public static int user_menu(){
        //printing the menu and getting a response from the user
        System.out.println("\n\n");
        System.out.print("""
                *******************************************************
                *                     Menu Options                    *
                *******************************************************
                \t1) Buy a seat
                \t2) Cancel a seat
                \t3) Find first available seat
                \t4) Show seating plan
                \t5) Print tickets information and total sales
                \t6) Search ticket
                \t0) Quit
                
                *******************************************************
                """);
        System.out.print("Please select an option: ");

        int response= 10;
        try {
            response = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter a Integer \nError code:"+e);
        }
        System.out.println();
        return response;
    }

    public static void cancel_seat(int[][] seats){
        System.out.print("Please Enter the row letter: ");
        String row_letter=new Scanner(System.in).next().toLowerCase();
        int seat_number;
        switch (row_letter){
            case "a":
                try {
                    System.out.print("Enter the Seat number: ");
                    seat_number=new Scanner(System.in).nextInt();
                    if(seat_number>0 && seat_number<15){
                        if(seats[0][seat_number-1]==1){
                            seats[0][seat_number-1]=0;
                            for (int i = 0; i < ticketCount; i++) {
                                Ticket ticket = tickets[i];
                                if (Objects.equals(ticket.getRow(), "A") && ticket.getSeat()+1 == seat_number) {
                                    for (int j = i; j < ticketCount; j++) {
                                        tickets[j] = tickets[j + 1];
                                    }
                                    tickets[ticketCount - 1] = null;
                                    ticketCount--;
                                    System.out.println("Ticket canceled successfully!");

                                }
                            }
                        }else{
                            System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is available already.");

                        }
                    }else{
                        System.out.println("Enter a correct Seat number.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Incorrect input \nError code:"+e);
                }catch (Exception e) {
                    System.out.println("Some error occurred \nError code:"+e);
                }
                break;
            case "b":
                try {
                    System.out.print("Enter the Seat number: ");
                    seat_number=new Scanner(System.in).nextInt();
                    if(seat_number>0 && seat_number<13){
                        if(seats[1][seat_number-1]==1){
                            seats[1][seat_number-1]=0;
                            for (int i = 0; i < ticketCount; i++) {
                                Ticket ticket = tickets[i];
                                if (Objects.equals(ticket.getRow(), "B") && ticket.getSeat()+1 == seat_number) {
                                    for (int j = i; j < ticketCount - 1; j++) {
                                        tickets[j] = tickets[j + 1];
                                    }
                                    tickets[ticketCount - 1] = null;
                                    ticketCount--;
                                    System.out.println("Ticket canceled successfully!");

                                }
                            }
                        }else{
                            System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is available already.");

                        }
                    }else{
                        System.out.println("Enter a correct Seat number.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Incorrect input \nError code:"+e);
                }catch (Exception e) {
                    System.out.println("Some error occurred \nError code:"+e);
                }
                break;
            case "c":
                try {
                    System.out.print("Enter the Seat number: ");
                    seat_number=new Scanner(System.in).nextInt();
                    if(seat_number>0 && seat_number<13){
                        if(seats[2][seat_number-1]==1){
                            seats[2][seat_number-1]=0;
                            for (int i = 0; i < ticketCount; i++) {
                                Ticket ticket = tickets[i];
                                if (Objects.equals(ticket.getRow(), "C") && ticket.getSeat()+1 == seat_number) {
                                    for (int j = i; j < ticketCount - 1; j++) {
                                        tickets[j] = tickets[j + 1];
                                    }
                                    tickets[ticketCount - 1] = null;
                                    ticketCount--;
                                    System.out.println("Ticket canceled successfully!");

                                }
                            }
                        }else{
                            System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is available already.");

                        }
                    }else{
                        System.out.println("Enter a correct Seat number.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Incorrect input \nError code:"+e);
                }catch (Exception e) {
                    System.out.println("Some error occurred \nError code:"+e);
                }
                break;
            case "d":
                try {
                    System.out.print("Enter the Seat number: ");
                    seat_number=new Scanner(System.in).nextInt();
                    if(seat_number>0 && seat_number<15){
                        if(seats[3][seat_number-1]==1){
                            seats[3][seat_number-1]=0;
                            for (int i = 0; i < ticketCount; i++) {
                                Ticket ticket = tickets[i];
                                if (Objects.equals(ticket.getRow(), "D") && ticket.getSeat()+1 == seat_number) {
                                    for (int j = i; j < ticketCount - 1; j++) {
                                        tickets[j] = tickets[j + 1];
                                    }
                                    tickets[ticketCount - 1] = null;
                                    ticketCount--;
                                    System.out.println("Ticket canceled successfully!");

                                }
                            }
                        }else{
                            System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is available already.");

                        }
                    }else{
                        System.out.println("Enter a correct Seat number.");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Incorrect input \nError code:"+e);
                }catch (Exception e) {
                    System.out.println("Some error occurred \nError code:"+e);
                }
            default:
                System.out.println(row_letter.toUpperCase()+" row doesn't Exist!");
        }


    }

    public static double price_check(int seat_number){
        if(seat_number>0&&seat_number<6){
            return 200;
        } else if (seat_number>5&&seat_number<10) {
            return 150;
        }else{
            return 180;
        }
    }
    public static void buy_seat(int[][] seats){
        String name= null;
        String surname= null;
        String email= null;
        String row_letter= null;
        int seat_number= 0;
        boolean state=false;
        try {

            System.out.print("Please Enter your name: ");
            name = new Scanner(System.in).next();
            System.out.print("Please Enter your surname: ");
            surname = new Scanner(System.in).next();
            while(!state){
                System.out.print("Please Enter your email: ");
                email = new Scanner(System.in).next();
                if(emailchecker(email)){
                    state=true;
                }else{
                    System.out.println("Invalid email please enter a valid email.");

                }

            }

            System.out.print("Please Enter the row letter: ");
            row_letter = new Scanner(System.in).next().toLowerCase();
            System.out.print("Enter the Seat number: ");
            seat_number = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input \nError code:"+e);
        }catch (Exception e) {
            System.out.println("Some error occurred \nError code:"+e);
        }

        double price=price_check(seat_number);
        switch (row_letter){
            case "a":
                if(seat_number>0 && seat_number<15){
                    if(seats[0][seat_number-1]==0){
                        seats[0][seat_number-1]=1;
                        Person person = new Person(name, surname, email);
                        Ticket ticket = new Ticket("A", seat_number-1, price, person);
                        if (ticketCount < 52) {
                            tickets[ticketCount] = ticket;
                            ticketCount++;
                            ticket.save();
                            System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" Ticket bought successfully!");
                        }
                    }else{
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is not available.");

                    }
                }else{
                    System.out.println("Enter a correct Seat number.");
                }
                break;
            case "b":
                if(seat_number>0 && seat_number<13){
                    if(seats[1][seat_number-1]==0){
                        seats[1][seat_number-1]=1;
                        Person person = new Person(name, surname, email);
                        Ticket ticket = new Ticket("B", seat_number-1, price, person);
                        if (ticketCount < 52) {
                            tickets[ticketCount] = ticket;
                            ticketCount++;
                            ticket.save();
                            System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" Ticket bought successfully!");
                        }

                    }else{
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is not available.");

                    }
                }else{
                    System.out.println("Enter a correct Seat number.");
                }
                break;
            case "c":
                if(seat_number>0 && seat_number<13){
                    if(seats[2][seat_number-1]==0){
                        seats[2][seat_number-1]=1;
                        Person person = new Person(name, surname, email);
                        Ticket ticket = new Ticket("C", seat_number-1, price, person);
                        if (ticketCount < 52) {
                            tickets[ticketCount] = ticket;
                            ticketCount++;
                            ticket.save();
                            System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" Ticket bought successfully!");
                        }
                    }else{
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is not available.");

                    }
                }else{
                    System.out.println("Enter a correct Seat number.");
                }
                break;
            case "d":
                if(seat_number>0 && seat_number<15){
                    if(seats[3][seat_number-1]==0){
                        seats[3][seat_number-1]=1;
                        Person person = new Person(name, surname, email);
                        Ticket ticket = new Ticket("D", seat_number-1, price, person);
                        if (ticketCount < 52) {
                            tickets[ticketCount] = ticket;
                            ticketCount++;
                            ticket.save();
                            System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" Ticket bought successfully!");
                        }
                    }else{
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is not available.");

                    }
                }else{
                    System.out.println("Enter a correct Seat number.");
                }
                break;
            default:
                System.out.println(row_letter.toUpperCase()+" row doesn't Exist!");
        }

    }

    public static void find_first_available(int[][] seats){
        int x=0;
        int n=1;
        boolean state=false;
        String row_letter=" ";
        for(int[] row :seats){
            switch(x){
                case 0:
                    row_letter="A";
                    break;
                case 1:
                    row_letter="B";
                    break;
                case 2:
                    row_letter="C";
                    break;
                case 3:
                    row_letter="D";
                    break;
                default:
                    System.out.println("Error Row letter ");

            }

            for(int seat:row){
                if(seat==0){

                    System.out.println("Seat in row "+row_letter+" with seat number "+n+" is available" );
                    state=true;
                    break;
                }
                n++;
            }
            if(state){
                break;
            }
            x++;
        }
    }

    public static void show_seating_plan(int[][] seats){
        int x=0;
        for (int[] row :seats){
            if(x==2){
                System.out.println();
            }
            for(int n:row){
                if(n==0){
                    System.out.print("O");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
            x++;
        }
    }

    public static void print_tickets_info() {
        double totalAmount = 0;

        System.out.print("\nTickets Sold During Session: \n");
        for (int i = 0; i < ticketCount; i++) {
            Ticket ticket = tickets[i];
            System.out.println("\nTicket " + (i + 1) + ":");
            ticket.printInfo();
            totalAmount += ticket.getPrice();
        }
        System.out.println("\nTotal Sales: £"+(int) totalAmount);
    }

    public static void search_ticket() {
        String rowLetter = null;
        int seatNumber = 0;
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the row letter: ");
            rowLetter = scanner.next().toUpperCase();
            System.out.print("Enter the seat number: ");
            seatNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input \nError code:"+e);
        }catch (Exception e) {
            System.out.println("Some error occurred \nError code:"+e);
        }

        boolean found = false;

        // Check if the seat is available in the seats array
        switch (rowLetter) {
            case "A":
                if (seatNumber > 0 && seatNumber < 15 && seats[0][seatNumber - 1] == 0) {
                    System.out.println("This seat is available.");
                    found = true;
                }
                break;
            case "B":
                if (seatNumber > 0 && seatNumber < 13 && seats[1][seatNumber - 1] == 0) {
                    System.out.println("This seat is available.");
                    found = true;
                }
                break;
            case "C":
                if (seatNumber > 0 && seatNumber < 13 && seats[2][seatNumber - 1] == 0) {
                    System.out.println("This seat is available.");
                    found = true;
                }
                break;
            case "D":
                if (seatNumber > 0 && seatNumber < 15 && seats[3][seatNumber - 1] == 0) {
                    System.out.println("This seat is available.");
                    found = true;
                }
                break;
            default:
                System.out.println("Invalid row letter.");
        }

        // If the seat is not found in the seats array, check the tickets array
        if (!found) {
            String row;
            int seatno;
            for (int i = 0; i < ticketCount; i++) {
                Ticket ticket = tickets[i];
                row= ticket.getRow();
                seatno=ticket.getSeat();

                if(Objects.equals(row, rowLetter) && seatno==seatNumber-1){
                    ticket.printInfo();
                }

            }

        }


    }


    public static void main(String[] args) {

        System.out.println("Welcome to the Plane Management System");
        seats[0] = new int[14];
        seats[1] = new int[12];
        seats[2] = new int[12];
        seats[3] = new int[14];



        int response;

        do{
            response=user_menu();
            switch(response){
                case 0: System.out.println("Thank you for using Plane Management.");break;
                case 1: buy_seat(seats); break;
                case 2: cancel_seat(seats); break;
                case 3: find_first_available(seats); break;
                case 4: show_seating_plan(seats); break;
                case 5: print_tickets_info(); break;
                case 6: search_ticket(); break;
                default: System.out.println("Invalid Option,Try again..");break;
            }
        }while (response!=0);



    }
}