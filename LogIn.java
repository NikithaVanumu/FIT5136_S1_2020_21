
package com.jetbrains;
/*// NOT USED, // NO NEED BECAUSE I HAVE DEFINE THIS IN WELCOME CLASS
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LogIn {
    private static int counter;
    static int option;
    private static final String missionIdSeries = "300";
    private static final String missionFile = "mission.txt";
    private static final String candIdSeries = "200";
    private static final String candidateFile = "candidate.txt";

    */
/*public void info() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Entered into login class");
        System.out.println("Username:");
        String username = sc.next();
        System.out.println("Password:");
        String password = sc.next();

        if (username.equals("admin") && password.equals("1234")) {
       /* MissionCoordinator missionCoordinator = new MissionCoordinator();
         missionCoordinator.processOption();*//*

           // System.out.println("Create a mission");
            //CreateMission cm = new CreateMission();
            //cm.details();
           // File file = new File(missionFile);

           // String missionSeries = null;
           // if (file.exists() && !file.isDirectory()) {
                    */
/*if (file.length() > 0) {
                        ReadFile readFile = new ReadFile(candidateFile);
                        missionSeries = readFile.getMaximumMissionId(candidateFile);
                    } else {
                        missionSeries = missionIdSeries + String.valueOf(counter++);
                    }*//*

           // } else {
            //    missionSeries = missionIdSeries + String.valueOf(counter++);
          //  }
           // CreateMission createMission = new CreateMission();

           */
/* createMission.details(missionSeries, missionFile);
        } else if (username.equals("coordinator") && password.equals("1234")) {
            System.out.println("Mission Coordinator has logged in");
        } else if (username.equals("nikki") && password.equals("1234")) {
            enterOptionForCand();

        }else{
            System.out.println(" Please Enter a valid username and password");
        }
    }

    public static void enterOptionForCand() {

        System.out.println("Select an Option");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("1. Edit profile");
        System.out.println("2. Sign Out");
        System.out.println("-------------------------------------------------------------------------");

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            option = Integer.parseInt(reader.readLine());
            if (option > 0 && option < 3)
                processOptionForCand();
            else {

                enterOptionForCand();
            }
        } catch (Exception e) {
            enterOptionForCand();
        }

    }

    private static void processOptionForCand() {
        switch (option) {
            case 1:
                System.out.println("Edit Profile");
                Update updateFile = new Update(candidateFile);
                updateFile.getCandidateIdToUpdate(candIdSeries);
                break;
            case 2:
                System.out.println("Sign out");
                Welcome.enterOption();
                break;
                default:
                System.out.println("Exited out of console successfully(Login Page)");


        }
    }
}*/

