package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write a java program to search the email ID entered by a user.
        ArrayList ar = new ArrayList<String>();
        Boolean isFound = false;

        ar.add("ff.gmail");
        ar.add("yh@hotmail");
        ar.add("uj@outlook.sa");
        ar.add("jk@outlook.com");
        ar.add("hj@icloud.com");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ID email :");
        String searcElement =input.next();
        for(int i=0; i<ar.size(); i++) {
            if(searcElement.equals(ar.get(i))) {
                isFound = true;
                break;
            }
        }
        if (isFound == true){
            System.out.println("\n");
            System.out.println("email is found in Id employees :"+searcElement);
        }else{
            System.out.println("\n");
            System.out.println("email is not found in Id employees :"+searcElement);
        }

    }
}
