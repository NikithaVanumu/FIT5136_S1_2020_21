package com.jetbrains;

import java.io.*;
import java.util.Scanner;

public class Welcome {
    static int option;
    private static int counter ;
    private static final String missionIdSeries = "700";
    private static final String missionFile = "mission.txt";
    private static final String candIdSeries = "200";
    static String candidateSeries;
    static String username;
    private static Scanner s;
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
                logIn();
                enterOption();
                break;

            case 2:
                System.out.println("SignUp");
                /*SignUp s = new SignUp();
                s.details(1000,);

                enterOption();*/
                File file = new File(candidateFile);
                candidateSeries = null;
                if (file.exists() && !file.isDirectory()) {
                   if (file.length() > 0) {
                        com.jetbrains.ReadFile readFile = new com.jetbrains.ReadFile(candidateFile);
                        candidateSeries = readFile.getMaximumCandId(candidateFile);
                    } else {
                        candidateSeries = candIdSeries + String.valueOf(counter++);
                    }
                } else {
                    candidateSeries = candIdSeries + String.valueOf(counter++);
                }
                com.jetbrains.SignUp createCandidate = new com.jetbrains.SignUp();

                createCandidate.details(candidateSeries, candidateFile);
                enterOption();
                break;
                case 3:
                System.out.println("Successfully terminated the program.");
                System.out.println("You can close the console now.");

                System.exit(0);
                break;

            default:
                System.exit(0);
                break;



        }

    }
    public static void logIn() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Username:");
         username = sc.next();
        System.out.println("Password:");
        String password = sc.next();

       /* Console c=System.console();
        char[] ch=c.readPassword();
        String password=String.valueOf(ch);*/


        if (username.equals("coordinator") && password.equals("coordinator")) {
            enterOptionForCoordinator();


        } else if (username.equals("admin") && password.equals("admin")) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("WELCOME MISSION ADMINISTRATOR TO MISSION MARS !!!");
            System.out.println("-------------------------------------------------------------------------");
            com.jetbrains.MissionAdministrator ma = new com.jetbrains.MissionAdministrator();
            ma.enterOption();
        } else if (validate(username,password)) {
            enterOptionForCand();

        }else{
            System.out.println(" Please Enter a valid username and password");
            logIn();
        }
    }

    private static boolean validate(String vUsername, String vPassword) {
        boolean authentication = false;

        try {

            FileInputStream file = new FileInputStream(candidateFile);

            DataInputStream in = new DataInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            String UserID;
            String FilePassword;
            String lastLine = null;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {

                String[] d = strLine.split(",");
                 UserID = d[0];
                 FilePassword = d[2];
                 if(UserID.equals(vUsername))
                 {
                     if(FilePassword.equals(vPassword))
                       return  authentication = true;
                 }

              }
            //Close the input stream
            in.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }


        return authentication;
    }

    public static void enterOptionForCand() {

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("WELCOME CANDIDATE TO MISSION MARS !!!");
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Select an Option");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("1. Edit profile");
        System.out.println("2. Sign Out");
        System.out.println("-------------------------------------------------------------------------");

        try {

            //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            //option = Integer.parseInt(reader.readLine());
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
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

                /*EditCandidate edit = new EditCandidate();
                try {
                    edit.editCandidate(username, candidateFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
*/
                /*Update updateFile = new Update(candidateFile);
                String cand = username;
                System.out.println("Candidate ID"+ cand);
                updateFile.getCandidateIdToUpdate(username);
*/


                try {
                    UpdateCandidate.setFileCandidate(candidateFile, username);
                } catch (IOException e) {
                    e.printStackTrace();
                }


                break;
            case 2:
                System.out.println("Sign out");
                Welcome.enterOption();
                break;
            default:
                System.exit(0);
                break;



        }
    }
    public static void enterOptionForCoordinator() {

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("WELCOME COORDINATOR TO MISSION MARS !!!");
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Select an Option");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("1. Create a Mission");
        System.out.println("2. View Missions ");
        System.out.println("3. Edit a Mission");
        System.out.println("4. Log Out");
        System.out.println("-------------------------------------------------------------------------");

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            option = Integer.parseInt(reader.readLine());
            if (option > 0 && option < 5)
                processOptionForCoordinator();
            else {

                enterOptionForCoordinator();
            }
        } catch (Exception e) {
            enterOptionForCoordinator();
        }

    }

    public static void processOptionForCoordinator() {
        switch (option) {
            case 1:
                System.out.println("Create a mission");

                //CreateMission cm = new CreateMission();
                //cm.details();
                File file = new File(missionFile);

                String missionSeries = null;
                if (file.exists() && !file.isDirectory()) {
                    if (file.length() > 0) {
                        ReadFile readFile = new ReadFile(missionFile);
                        missionSeries = readFile.getMaximumMissionId(missionFile);
                    } else {
                        missionSeries = missionIdSeries + String.valueOf(counter++);
                    }
                } else {
                    missionSeries = missionIdSeries + String.valueOf(counter++);
                }
                com.jetbrains.CreateMission createMission = new com.jetbrains.CreateMission();

                createMission.details(missionSeries, missionFile);

                enterOptionForCoordinator();
                break;

            case 2:
                System.out.println("Select to view missions");
                try {
                    DisplayMissionDetails.MissionDetails(missionFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // EditMission.setFileMission(missionFile, missionSeries);
                enterOptionForCoordinator();
                break;



            case 3:
                System.out.println("Edit a mission");
                try {
                    DisplayMissionDetails.MissionDetails(missionFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("Enter Mission ID to edit....");
                s= new Scanner(System.in);
                String value = s.nextLine();


                try {
                    EditMission.setFileMission(missionFile, value);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                enterOptionForCoordinator();

                break;




            case 4:
                System.out.println("Sign out");
                enterOption();
                break;
            default:
                System.exit(0);
                break;


        }

    }

    public static String getCandId() {
        return candidateSeries;
    }
    /**
     *used to update or setCandId
     */
    public void setCandId(String candId) {
        candidateSeries = candId;
    }
}


