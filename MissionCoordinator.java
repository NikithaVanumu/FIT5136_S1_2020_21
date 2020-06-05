package com.jetbrains;

import java.io.*;

public class MissionCoordinator {
    private String missionCoordinatorName;
    private String missionCoordinatorContact;
    static int option;
    private static int counter ;



    public MissionCoordinator() {

    }

    public MissionCoordinator(String missionCoordinatorName, String missionCoordinatorContact) {
        this.missionCoordinatorName = missionCoordinatorName;
        this.missionCoordinatorContact = missionCoordinatorContact;
    }

    /**
     * used to retrieve Mission coordinator Name
     */
    public String getMissionCoordinatorName() {
        return missionCoordinatorName + ",";
    }

    /**
     * used to update or setMissionCoordinatorName
     */
    public void setMissionCoordinatorName(String missionCoordinatorName) {
        this.missionCoordinatorName = missionCoordinatorName;
    }

    /**
     * used to retrieve Mission coordinator Contact
     */
    public String getMissionCoordinatorContact() {
        return missionCoordinatorContact + ",";
    }

    /**
     * used to update or setMissionCoordinatorContact
     */
    public void setMissionCoordinatorContact(String missionCoordinatorContact) {
        this.missionCoordinatorContact = missionCoordinatorContact;
    }

    /*public static void enterOption() {

        System.out.println("Select an Option");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("1. Create a Mission");
        System.out.println("2. Edit a Mission");
        System.out.println("3. Log Out");
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

    public static void processOption() {
        switch (option) {
            case 1:
                System.out.println("Create a mission");

                enterOption();
                break;

            case 2:
                System.out.println("Edit a mission");
                enterOption();
                break;

            default:
                System.out.println("Exited out of console successfully");


        }

    }*/
}
