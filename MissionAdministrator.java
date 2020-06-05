package com.jetbrains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MissionAdministrator {
    private String missionAdministratorName;
    private String missionAdministratorContact;
    static int option;

    public MissionAdministrator() {

    }

    public MissionAdministrator(String missionAdministratorName, String missionAdministratorContact) {
        this.missionAdministratorName = missionAdministratorName;
        this.missionAdministratorContact = missionAdministratorContact;
    }

    /**
     * used to retrieve mission Administrator Name
     */
    public String getMissionAdministratorName() {
        return missionAdministratorName + ",";
    }

    /**
     * used to update or setMissionAdministratorName
     */
    public void setMissionAdministratorName(String missionAdministratorName) {
        this.missionAdministratorName = missionAdministratorName;
    }

    /**
     * used to retrieve mission Administrator Contact
     */
    public String getMissionAdministratorContact() {
        return missionAdministratorContact + ",";
    }

    /**
     * used to update or setMissionAdministratorContact
     */
    public void setMissionAdministratorContact(String missionAdministratorContact) {
        this.missionAdministratorContact = missionAdministratorContact;
    }

    public static void enterOption() {

        System.out.println("Select an Option");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("1. View Shuttle properties");
        System.out.println("2. Edit a Mission");
        System.out.println("3. List out candidate");
        System.out.println("4. Log Out");
        System.out.println("-------------------------------------------------------------------------");

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            option = Integer.parseInt(reader.readLine());
            if (option > 0 && option < 5)
                processOption();
            else {

                enterOption();
            }
        } catch (Exception e) {
            enterOption();
        }


    }
    public static void processOption() throws IOException {
        com.jetbrains.ReadingFile rf = new com.jetbrains.ReadingFile();
        switch (option) {
            case 1:
                System.out.println("The following are the properties of shuttle");

                rf.readFile();
                System.out.println("Please enter ShuttleId to select a shuttle:");
                Scanner sc = new Scanner(System.in);
                String x = sc.next();
                System.out.println("You have successfully selected space shuttle ,\nShuttleId: ");
                System.out.println(x);
                enterOption();
                break;

            case 2:
                System.out.println("Edit a mission");
                enterOption();
                break;

            case 3:
                System.out.println("List of N best candidate");
                rf.readFileCand();
                System.out.println("Once the Criteria is created then N best candidate are selected");
                enterOption();
                break;

            case 4:
                System.out.println("Sign out");
                Welcome.enterOption();
                break;
            default:
                System.exit(0);
                break;


        }

    }
}
