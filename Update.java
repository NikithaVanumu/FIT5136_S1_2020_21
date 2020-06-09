package com.jetbrains;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Map;


public class Update {
    private boolean isUpdateName;
    private boolean isUpdateDob;
    private boolean isUpdateAddress;
    private boolean isUpdateNationality;
    private boolean isUpdateIdentificationNumber;
    private boolean isUpdateGender;
    private boolean isUpdateAllergies;
    private boolean isUpdateFoodPreferences;
    private boolean isUpdateQualification;
    private boolean isUpdateWorkExperience;
    private boolean isUpdateOccupation;
    private boolean isUpdateComputerSkills;
    private boolean isUpdateLanguageSpoken;
    private boolean flag;
    private int option;
    private String filename;
    private Candidate candidate = new Candidate();

    public Update(String filename) {

        System.out.println("In File" + filename);
        this.filename = filename;
    }

    /**
     * This method has the attributes of Candidate
     * After entering the new value the record gets updated into the file
     */
    private void updateRecord(String newString, String candId, Map<String, Candidate> candidateMap) {

        if (!candidateMap.isEmpty()) {
            if (candidateMap.containsKey(candId)) {
                if (isUpdateName) {
                    String newName = candidateMap.get(candId).getName()
                            .replace(candidateMap.get(candId).getName(), newString);
                    candidateMap.get(candId).setName(newName);
                } else if (isUpdateDob) {
                    String newDob = candidateMap.get(candId).getDob().replace(candidateMap.get(candId).getDob(),
                            newString);
                    candidateMap.get(candId).setDob(newDob);
                } else if (isUpdateAddress) {
                    String newAddress = candidateMap.get(candId).getAddress()
                            .replace(candidateMap.get(candId).getAddress(), newString);
                    candidateMap.get(candId).setAddress(newAddress);
                } else if (isUpdateNationality) {
                    String newNationality = candidateMap.get(candId).getNationality().replace(candidateMap.get(candId).getNationality(), newString);
                    candidateMap.get(candId).setNationality(newNationality);
                } else if (isUpdateIdentificationNumber) {
                    String newIdentificationNumber = candidateMap.get(candId).getIdentificationNumber().replace(candidateMap.get(candId).getIdentificationNumber(),
                            newString);
                    candidateMap.get(candId).setIdentificationNumber(newIdentificationNumber);
                } else if (isUpdateGender) {
                    String newGender = candidateMap.get(candId).getGender().replace(candidateMap.get(candId).getGender(),
                            newString);
                    candidateMap.get(candId).setGender(newGender);
                } else if (isUpdateAllergies) {
                    String newAllergies = candidateMap.get(candId).getAllergies().replace(candidateMap.get(candId).getAllergies(),
                            newString);
                    candidateMap.get(candId).setAllergies(newAllergies);
                } else if (isUpdateFoodPreferences) {
                    String newFoodPreferences = candidateMap.get(candId).getFoodPreferences().replace(candidateMap.get(candId).getFoodPreferences(),
                            newString);
                    candidateMap.get(candId).setFoodPreferences(newFoodPreferences);
                } else if (isUpdateQualification) {
                    String newQualification = candidateMap.get(candId).getQualification().replace(candidateMap.get(candId).getQualification(),
                            newString);
                    candidateMap.get(candId).setQualification(newQualification);
                } else if (isUpdateWorkExperience) {
                    String newWorkExperience = candidateMap.get(candId).getWorkExperience()
                            .replace(candidateMap.get(candId).getWorkExperience(), newString);
                    candidateMap.get(candId).setWorkExperience(newWorkExperience);
                } else if (isUpdateOccupation) {
                    String newOccupation = candidateMap.get(candId).getOccupation().replace(candidateMap.get(candId).getOccupation(),
                            newString);
                    candidateMap.get(candId).setOccupation(newOccupation);
                } else if (isUpdateComputerSkills) {
                    String newComputerSkills = candidateMap.get(candId).getComputerSkills().replace(candidateMap.get(candId).getComputerSkills(),
                            newString);
                    candidateMap.get(candId).setComputerSkills(newComputerSkills);
                } else if (isUpdateLanguageSpoken) {
                    String newLanguageSpoken = candidateMap.get(candId).getLanguageSpoken().replace(candidateMap.get(candId).getLanguageSpoken(),
                            newString);
                    candidateMap.get(candId).setOccupation(newLanguageSpoken);
                }
            }
        }

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File("filename"));
            writer.print("");
            for (String id : candidateMap.keySet()) {

                writer.write(candidateMap.get(id).getCandId() + candidateMap.get(id).getName() + ","
                        + candidateMap.get(id).getDob() + "," + candidateMap.get(id).getAddress() + ","
                        + candidateMap.get(id).getNationality() + "," + candidateMap.get(id).getIdentificationNumber() + ","
                        + candidateMap.get(id).getGender() + "," + candidateMap.get(id).getAllergies() + ","
                        + candidateMap.get(id).getFoodPreferences() + "," + candidateMap.get(id).getWorkExperience() + ","
                        + candidateMap.get(id).getOccupation() + "," + candidateMap.get(id).getComputerSkills() + ","
                        + candidateMap.get(id).getLanguageSpoken() + ";");
            }

            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer.print("");
        writer.close();

    }

    /**
     * Used to take user inputs for respective attributes
     * all the validations are given to the user input
     */
    public void getCandidateIdToUpdate(String candId) {
        ReadFile readFile = new ReadFile(filename);
        System.out.println("In Get-  "+ candId);
        readFile.getCandidateRecord(candId);
        Map<String, Candidate> map = readFile.readFileFor(candId);
        enterOption();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            option = Integer.parseInt(br.readLine());
            while (option < 1 || option > 14) {
                System.out.println("Enter options between 1 and 13 : ");
                enterOption();
                if (br != null)
                    br = new BufferedReader(new InputStreamReader(System.in));
            }
            switch (option) {

                case 1:
                    isUpdateName = true;
                    while (!flag) {
                        System.out.println("Enter your Name: ");
                        String newName = br.readLine();

                        flag = newName.matches("[A-Za-z]*");
                        if (!flag)
                            System.out.println("Enter only Alphabets!");
                        else
                            candidate.setName(newName + ",");

                    }
                    flag = false;
                    isUpdateName = false;
                    break;

                case 2:
                    isUpdateDob = true;
                    while (!flag) {
                        System.out.println("Enter the new Middle Name :");
                        String newDob = br.readLine();

                        flag = newDob.matches("[A-Za-z]*");
                        if (!flag)
                            System.out.println("Enter a valid input!");
                        else
                             candidate.setDob(newDob + ",");

                    }
                    flag = false;
                    isUpdateDob = false;
                    break;

                case 3:
                    isUpdateAddress = true;
                    while (!flag) {
                        System.out.println("Enter Address");
                        String newAddress = br.readLine();

                        flag = newAddress.matches("[0-9 A-Z a-z+,]*");
                        if (!flag)
                            System.out.println("Enter  Alphabets ,Number and , only!");
                        else
                         candidate.setAddress(newAddress + ",");

                    }
                    flag = false;
                    isUpdateAddress = false;
                    break;

                case 4:
                    isUpdateNationality = true;
                    while (!flag) {
                        System.out.println("Enter nationality");
                        String newNationality = br.readLine();

                        flag = newNationality.matches("[A-Za-z]*");
                        if (!flag)
                            System.out.println("Enter only Alphabets!");
                        else
                         candidate.setNationality(newNationality + ",");


                    }
                    flag = false;
                    isUpdateNationality = false;
                    break;

                case 5:
                    isUpdateIdentificationNumber = true;
                    while (!flag) {
                        System.out.println("Enter IdentificationType");
                        String newIdentificationNumber = br.readLine();

                        flag = newIdentificationNumber.matches("PAN|SSN|ABN|ADHAAR|TFN");
                        if (!flag)
                            System.out.println("Enter 'PAN' or 'SSN' or 'ADHAAR' or 'TFN' or 'ABN' ");
                        else
                         candidate.setIdentificationNumber(newIdentificationNumber + ",");

                    }
                    flag = false;
                    isUpdateIdentificationNumber = false;
                    break;

                case 6:
                    isUpdateGender = true;
                    while (!flag) {
                        System.out.println("Enter gender");
                        String newGender = br.readLine();

                        flag = newGender.matches("Male|Female|male|female");
                        if (!flag)
                            System.out.println("Enter a valid input!");
                        else
                        candidate.setGender(newGender + ",");

                    }
                    flag = false;
                    isUpdateGender = false;
                    break;

                case 7:
                    isUpdateAllergies = true;
                    while (!flag) {
                        System.out.println("Enter allergies");
                        String newAllergies = br.readLine();

                        flag = newAllergies.matches("[A-Za-z]*");
                        if (!flag)
                            System.out.println("Enter only Alphabets!");
                        else
                        candidate.setAllergies(newAllergies + ",");

                    }
                    flag = false;
                    isUpdateAllergies = false;
                    break;

                case 8:
                    isUpdateFoodPreferences = true;
                    while (!flag) {
                        System.out.println("Enter foodPreferences");
                        String newFoodPreferences = br.readLine();

                        flag = newFoodPreferences.matches("[A-Za-z]*");
                        if (!flag)
                            System.out.println("Enter only Alphabets!");
                        else
                         candidate.setFoodPreferences(newFoodPreferences + ",");

                    }
                    flag = false;
                    isUpdateFoodPreferences = false;
                    break;

                case 9:
                    isUpdateQualification = true;
                    while (!flag) {
                        System.out.println("Enter qualification(s):");
                        String newQualification = br.readLine();

                        flag = newQualification.matches("[A-Za-z]*");
                        if (!flag)
                            System.out.println("Enter only Alphabets!");
                        else
                       candidate.setQualification(newQualification + ",");

                    }
                    flag = false;
                    isUpdateQualification = false;
                    break;

                case 10:
                    isUpdateWorkExperience = true;
                    while (!flag) {
                        System.out.println("Enter workExperience");
                        String newWorkExperience = br.readLine();

                        flag = newWorkExperience.matches("[A-Za-z]*");
                        if (!flag)
                            System.out.println("Enter only Alphabets!");
                        else
                         candidate.setWorkExperience(newWorkExperience + ",");

                    }
                    flag = false;
                    isUpdateWorkExperience = false;

                    break;

                case 11:
                    isUpdateOccupation = true;
                    while (!flag) {
                        System.out.println("Enter occupation");
                        String newOccupation = br.readLine();

                        flag = newOccupation.matches("[A-Za-z]*");
                        if (!flag)
                            System.out.println("Enter only Alphabets!");
                        else
                         candidate.setOccupation(newOccupation + ",");

                    }
                    flag = false;
                    isUpdateOccupation = false;

                    break;

                case 12:
                    isUpdateComputerSkills = true;
                    while (!flag) {
                        System.out.println("Enter computerSkills:");
                        String newComputerSkills = br.readLine();

                        flag = newComputerSkills.matches("[A-Za-z]*");
                        if (!flag)
                            System.out.println("Enter only Alphabets!");
                        else
                           candidate.setComputerSkills(newComputerSkills + ",");

                    }
                    flag = false;
                    isUpdateComputerSkills = false;
                    break;

                case 13:
                    isUpdateLanguageSpoken = true;
                    while (!flag) {
                        System.out.println("Enter languageSpoken:");
                        String newLanguageSpoken = br.readLine();

                        flag = newLanguageSpoken.matches("[A-Za-z]*");
                        if (!flag)
                            System.out.println("Enter only Alphabets!");
                        else
                          candidate.setLanguageSpoken(newLanguageSpoken + ",");

                    }
                    flag = false;
                    isUpdateLanguageSpoken = false;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

      /**
         *This method is used to select the attribute which user wants to Update
         */
        private void enterOption () {
            System.out.println("---------------------------");
            System.out.println("1. Name");
            System.out.println("2. Date of birth");
            System.out.println("3. Address");
            System.out.println("4. Nationality");
            System.out.println("5. Identification Number");
            System.out.println("6. Gender");
            System.out.println("7. Allergies");
            System.out.println("8. Food Preferences");
            System.out.println("9. Qualification");
            System.out.println("10. Work Experience");
            System.out.println("11. Occupation");
            System.out.println("12. Computer skills");
            System.out.println("13. Language Spoken");
        }
    }



