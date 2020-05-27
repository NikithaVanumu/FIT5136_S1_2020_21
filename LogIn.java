package com.jetbrains;

import java.util.Scanner;

public class LogIn {

    public void info() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entered into login class");
        System.out.println("Username:");
        String username = sc.next();
        System.out.println("Password:");
        String password = sc.next();


    }
}
