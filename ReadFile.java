package com.jetbrains;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *This class is used to view the data present in the file of a candidate
 */
public class ReadFile {
    private Scanner in;
    private Map<String, Candidate> candidateMap = new HashMap<String, Candidate>();
    private String fileName;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }
    /**
     *This class is used to view get map of details of Candidate
     */
    public void readFileToViewAll() {
        getMapOfAllCandidate();

        if (!candidateMap.isEmpty()) {
            System.out.println("--------------------------------------------------------");
            for (String candId : candidateMap.keySet()) {
                printCandidateInformation(candId);
            }
            System.out.println("--------------------------------------------------------");
        } else {
            System.out.println("There are no records in the file!");
        }
    }

    /**
     *This method is used to view all the records of an candidate
     *@throws IOException
     */
    private void getMapOfAllCandidate() {
        try {
            in = new Scanner(new File(fileName));
            String line;
            while (in.hasNext()) {
                line = in.next();

                String[] recordList = line.split(";");
                for (String stringInRecordList : recordList) {
                    String[] StringList = stringInRecordList.split(",");

                    String cId = StringList[0];

                    String name = StringList[1];

                    String dob = StringList[2];

                    String address = StringList[3];

                    String nationality = StringList[4];

                    String identificationNumber = StringList[5];

                    String gender = StringList[6];

                    String allergies = StringList[7];

                    String foodPreferences = StringList[8];

                    String qualification = StringList[9];

                    String workExperience = StringList[10];

                    String occupation = StringList[11];

                    String computerSkills = StringList[12];

                    String languageSpoken = StringList[13];

                    Candidate cand = new Candidate(cId, name, dob, address, nationality, identificationNumber, gender, allergies, foodPreferences, qualification,
                            workExperience, occupation, computerSkills, languageSpoken);

                    if (!candidateMap.containsKey(cId)) {
                        candidateMap.put(cId, cand);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("File Not Found! Create a Record.");
        } finally {
            in.close();
        }
    }

    public Map<String, Candidate> readFileFor(String candId) {
        getMapOfAllCandidate();
        getCandidateRecord(candId);
        return candidateMap;
    }
    /**
     *This method is used to get all the details of Candidate Record
     */
    public void getCandidateRecord(String candId) {
        System.out.println("In getCandRecord - "+ candId);

        if (!candidateMap.isEmpty()) {
            System.out.println("Inside CandidateMap   ");
            if (candidateMap.get(candId) != null) {
                System.out.println("Here is the Candidate information");
                System.out.println("--------------------------------------------------------");
                System.out.println("ID, Name, Date of birth, Address, Nationality, Identification Number, Gender, Allergies, Food Preferences, Qualification, Work Experience, Occupation,Computer skills, Language Spoken;");
                printCandidateInformation(candId);

                System.out.println("--------------------------------------------------------");
            } else {
                System.out.println("The Candidate ID not found in the file.Please try again by selecting option 3");
                Welcome.enterOption();// We need to call the admin class over here but I haven't declare class so I'm calling welcome class
            }
        }
       else
            System.out.println("Else ");
    }

    public String getMaximumCandId(String fileName) {
        String maxCandidateID = null;
        List<Integer> listOfCandIDs = new ArrayList<Integer>();
        try {
            in = new Scanner(new File(fileName));
            String line;

            while (in.hasNext()) {
                line = in.next();

                String[] recordList = line.split(";");
                for (String stringInRecordList : recordList) {
                    String StringList[] = stringInRecordList.split(",");
                    listOfCandIDs.add(Integer.parseInt(StringList[0]));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
        if (listOfCandIDs.size() > 0) {
            Collections.sort(listOfCandIDs, Collections.reverseOrder());
            maxCandidateID = String.valueOf(new Integer(listOfCandIDs.get(0) + 1));
        }

        return maxCandidateID;
    }
    /**
     *This method is used print the Candidate information
     */
    private void printCandidateInformation(String candId) {
        System.out.println(candidateMap.get(candId).getCandId() + candidateMap.get(candId).getName() + " "
                + candidateMap.get(candId).getDob() + " " + candidateMap.get(candId).getAddress() + ","
                + candidateMap.get(candId).getNationality() + "," + candidateMap.get(candId).getIdentificationNumber() + ","
                + candidateMap.get(candId).getGender() + "," + candidateMap.get(candId).getAllergies() + ","
                + candidateMap.get(candId).getFoodPreferences() + "," + candidateMap.get(candId).getQualification() + ","
                + candidateMap.get(candId).getWorkExperience() + "," + candidateMap.get(candId).getOccupation() + ","
                + candidateMap.get(candId).getComputerSkills() + "," + candidateMap.get(candId).getLanguageSpoken() + ";");
    }

    public String getMaximumMissionId(String fileName) {
        String maxMissionID = null;
        List<Integer> listOfMissionIDs = new ArrayList<Integer>();
        try {
            in = new Scanner(new File(fileName));
            String line;

            while (in.hasNext()) {
                line = in.next();

                String[] recordList = line.split(";");
                for (String stringInRecordList : recordList) {
                    String StringList[] = stringInRecordList.split(",");
                    listOfMissionIDs.add(Integer.parseInt(StringList[0]));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
        if (listOfMissionIDs.size() > 0) {
            Collections.sort(listOfMissionIDs, Collections.reverseOrder());
            maxMissionID = String.valueOf(new Integer(listOfMissionIDs.get(0) + 1));
        }

        return maxMissionID;
    }
}

