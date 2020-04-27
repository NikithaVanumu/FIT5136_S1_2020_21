package com.jetbrains;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;


public class Welcome {
    static int option;
    private static int counter;
    private static final String candIdSeries = "200";
    private static final String candidateFile = "candidate.txt";

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("WELCOME TO MISSION MARS !!!");
        System.out.println("-------------------------------------------------------------------------");
        enterOption();
    }

    public static void enterOption() {

        System.out.println("Select an Option");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("1. LogIn");
        System.out.println("2. Sign up");
        System.out.println("3. Exit");
        System.out.println("-------------------------------------------------------------------------");

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            option = Integer.parseInt(reader.readLine());
            if (option > 0 && option < 4)
                processOption();
            else {

                enterOption();
            }
        } catch (Exception e) {
            enterOption();
        }

    }

    private static void processOption() {
        switch (option) {
            case 1:
                System.out.println("LogIN");
                LogIn l = new LogIn();
                l.info();
                enterOption();
                break;

            case 2:
                System.out.println("SignUp");
                /*SignUp s = new SignUp();
                s.details(1000,);

                enterOption();*/
                File file = new File(candidateFile);

                String candidateSeries = null;
                if (file.exists() && !file.isDirectory()) {
                    /*if (file.length() > 0) {
                        ReadFile readFile = new ReadFile(candidateFile);
                        candidateSeries = readFile.getMaximumCandId(candidateFile);
                    } else {
                        candidateSeries = candIdSeries + String.valueOf(counter++);
                    }*/
                } else {
                    candidateSeries = candIdSeries + String.valueOf(counter++);
                }
                SignUp createCandidate = new SignUp();

                createCandidate.details(candidateSeries, candidateFile);
                enterOption();
                break;

            default:
                System.out.println("Exited out of console successfully");


        }

    }

}
