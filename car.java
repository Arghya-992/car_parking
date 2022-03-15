import java.util.*;
public class car {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = 5;
while(true){
System.out.println("Welcome to the parking lot. Press 1 to park your vehicle. Press 2 to leave. Press 3 to check how many vehicles are there. Press 4 to exit the menu.");
int user = sc.nextInt();

switch(user){
    case 1: 
    System.out.println("The number of slots left are:"+a);
    if (a <= 5 & a > 0){
        a=a-1;
        System.out.println("Your car has been parked successfully");
    }
    break;
    case 2: 
    if (a == 0 || a > 0){
    System.out.println("You have left the parking lot. ");
    } 
    break;
    case 3: 
    System.out.println("Please enter how many vehicles you have parked:");
    int carno = sc.nextInt();
    if (carno == 0){
        System.out.println("There are 5 lots left. Press 1 to park your vehicle.");
    } else if (carno == 1){
        System.out.println("There are 4 lots left. Press 1 to park your vehicle.");
    } else if (carno == 2){
        System.out.println("There are 3 lots left. Press 1 to park your vehicle.");
    } else if (carno == 3){
        System.out.println("There are 2 lots left. Press 1 to park your vehicle.");
    } else if (carno == 4){
        System.out.println("There is 1 lot left. Press 1 to park your vehicle.");
    } else if (carno == 5){
        System.out.println("There are no lots left. You shall be unavailable to park your vehicle.");
    } else if(carno > 5){
        System.out.println("Please enter a valid number of how many times you have parked your vehicle.");
    }
    break;
    case 4:
    System.exit(0);
    default:
    System.out.println("Please enter a valid number");
}}}}