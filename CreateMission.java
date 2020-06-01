package com.jetbrains;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CreateMission {
    private boolean flag;
    private Mission mission = new Mission();
    private MissionCoordinator missionCoordinator = new MissionCoordinator();
    public static List<Mission> MissionList = new ArrayList<Mission>();
    private static FileWriter fileWriter;
    private static BufferedWriter buffer;


    public void details(String counter, String filename) {
        System.out.println("Please Enter the following Details");

        try {
            System.out.println("ID : " + counter);
            mission.setMissionId(counter);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*
Used to take Mission Name input from the user
*/
            while (!flag) {
                System.out.println("Enter your Mission Name: ");
                String missionName = br.readLine();

                flag = missionName.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    mission.setMissionName(missionName + ",");
            }
            flag = false;
/*
Used to take Mission Description input from the user
*/
            while (!flag) {
                System.out.println("Enter your Mission Description: ");
                String missionDescription = br.readLine();

                flag = missionDescription.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    mission.setMissionDescription(missionDescription + ",");
            }
            flag = false;
/*
Used to take Country of origin input from the user
*/
            while (!flag) {
                System.out.println("Enter your Country of origin: ");
                String originCountry = br.readLine();

                flag = originCountry.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    mission.setOriginCountry(originCountry + ",");
            }
            flag = false;
/*
Used to take Countries allowed input from the user

                while (!flag) {
                    System.out.println("Enter  Countries allowed: ");
                    String originCountry = br.readLine();

                    flag = originCountry.matches("[A-Za-z]*");
                    if (!flag)
                        System.out.println("Enter only Alphabets!");
                    else
                        mission.setOriginCountry(originCountry + ",");
                }
                flag = false;
 */
/*
Used to take Mission Coordinator name input from the user
*/
            while (!flag) {
                System.out.println("Enter Mission Coordinator name : ");
                String missionCoordinatorName = br.readLine();

                flag = missionCoordinatorName.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    missionCoordinator.setMissionCoordinatorName(missionCoordinatorName + ",");
            }
            flag = false;
/*
Used to take Mission Coordinator Contact input from the user
*/
            while (!flag) {
                System.out.println("Enter Mission Coordinator contact : ");
                String missionCoordinatorContact = br.readLine();

                if (missionCoordinatorContact.matches("[0]{1}[0-9]{9}"))
                    flag = true;
                else if (missionCoordinatorContact.matches("[0]{1}[0-9]{9}"))
                    flag = true;
                if (!flag)
                    System.out.println("Enter 10 Mobile Number starting with 0");
                else
                    missionCoordinator.setMissionCoordinatorContact(missionCoordinatorContact + ",");
            }
            flag = false;

 /*
Used to take Job from the user

                while (!flag) {
                    System.out.println("Enter your job:");
                    String originCountry = br.readLine();

                    flag = originCountry.matches("[A-Za-z]*");
                    if (!flag)
                        System.out.println("Enter only Alphabets!");
                    else
                        mission.setOriginCountry(originCountry + ",");
                }
                flag = false;
 */

/*
Used to take employment requirements from the user

                while (!flag) {
                    System.out.println("Enter foodPreferences");
                    String foodPreferences = br.readLine();

                    flag = foodPreferences.matches("[A-Za-z]*");
                    if (!flag)
                        System.out.println("Enter only Alphabets!");
                    else
                        candidate.setFoodPreferences(foodPreferences + ",");
                }
                flag = false;
 */

/*
Used to take cargo requirements
*/
            while (!flag) {
                System.out.println("Enter your Cargo : \n a. For the Journey \n b. For the mission \n c. For other missions  ");
                String cargoType = br.readLine();

                flag = cargoType.matches("a|b|c|A|B|C");
                if (!flag)
                    System.out.println("Enter 'a' or 'A' or 'b' or 'B' or 'c' or 'C' ");
                else
                    mission.setCargoType(cargoType + ",");
            }
            flag = false;
/*
Used to take mission launch date input from the user
*/
            while (!flag) {
                System.out.println("Enter Mission launch date");
                String missionLaunchDate = br.readLine();

                flag = missionLaunchDate.matches("[0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]*");
                if (!flag)
                    System.out.println("Please Enter mission launch date in DD-MM-YYYY format");
                else
                    mission.setMissionLaunchDate(missionLaunchDate + ",");
            }
            flag = false;
                /*
Used to take mission destination input from the user
*/
            while (!flag) {
                System.out.println("Enter mission destination");
                String missionDestination = br.readLine();

                flag = missionDestination.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    mission.setMissionDestination(missionDestination + ",");
            }
            flag = false;
/*
Used to take mission duration input from the user
*/
            while (!flag) {
                System.out.println("Enter mission duration");
                String missionDuration = br.readLine();

                flag = missionDuration.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    mission.setMissionDuration(missionDuration + ",");
            }
            flag = false;




            File file = new File(filename);

            System.out.println(" ID : " + counter);
            mission.setMissionId(counter);

            if (file.exists() && !file.isDirectory()) {
                fileWriter = new FileWriter(file, true);
                buffer = new BufferedWriter(fileWriter);
            } else {
                file.createNewFile();
                fileWriter = new FileWriter(file);
                buffer = new BufferedWriter(fileWriter);
            }

            buffer.write(mission.getMissionId() + mission.getMissionName() + mission.getMissionDescription()
                    + mission.getOriginCountry() + missionCoordinator.getMissionCoordinatorName() + missionCoordinator.getMissionCoordinatorContact() + mission.getCargoType()
                    + mission.getMissionLaunchDate() + mission.getMissionDestination() + mission.getMissionDuration());

            if (buffer != null || fileWriter != null) {
                buffer.close();
                fileWriter.close();
            }

            System.out.println("Congratulations!! You have Successfully registered!! " + mission.getMissionId());


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
