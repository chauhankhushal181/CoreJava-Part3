import java.util.Scanner;

public class votingSystem {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        age =sc.nextInt();
        if (age>=18){
            System.out.println("you are  eligible");

        }else {
            System.out.println("you are eligible");
        }
    }
}



//import java.util.Scanner;

//public class votingSystem {
//    public static void main(String[] args) {
//        int age;
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Please Enter you Age: ");
//        age = sc.nextInt();
//
//        if (age >= 18) {
//            System.out.println("You are eligible to Vote."); //St1
//            System.out.println("Please carry Your Voter ID to Polling booth");//St2
//        }
//        else  {
//            System.out.println("You are Not eligible to Vote.");//St3
//            System.out.println("We are Sorry for that");//St4
//        }
//        System.out.println("This Message is coming from Outside the IF ELSE STATEMENT");
//    }
//}