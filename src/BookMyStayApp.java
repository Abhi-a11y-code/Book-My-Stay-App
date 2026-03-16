public class BookMyStayApp {

    public static void main(String[] args){
        showWelcomeMessage();
        checkRoomInitialization();
    }

    public static void showWelcomeMessage(){
        System.out.println("=================================");
        System.out.println("   Welcome to Hotel Booking App  ");
        System.out.println("=================================");

        System.out.println("Application: Hotel Booking System");
        System.out.println("Version: 1.0");

        System.out.println("System initialized successfully.");
        System.out.println("Thank you for using the application.");
    }

    public static void checkRoomInitialization(){
        System.out.println("=================================");
        System.out.println("Hotel Booking System - Version 2.1");
        System.out.println("Room Types & Availability");
        System.out.println("=================================");

        // Polymorphism
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + singleAvailable);
        System.out.println();

        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleAvailable);
        System.out.println();

        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteAvailable);
    }
}
