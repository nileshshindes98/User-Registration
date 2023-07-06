package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
public void validFirstName(){
   Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
   System.out.print("Enter First Name : ");
   Scanner sc = new Scanner(System.in);
   String firstName = sc.nextLine();

    Matcher matcher = pattern.matcher(firstName);
    if(matcher.matches()){
        System.out.println("First name is valid");
    }else{
        System.out.println("Not valid");
    }
    System.out.println();
    }
    public void validLastName(){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        System.out.print("Enter Last Name : ");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();

        Matcher matcher = pattern.matcher(firstName);
        if(matcher.matches()){
            System.out.println("Last name is valid");
        }else{
            System.out.println("Not valid");
        }

    }
}
