package com.jetbrains;

import java.io.*;
import java.util.Scanner;

public class EditCandidate {
    private static Scanner s;
    private static FileWriter fileWriter;
    private static BufferedWriter buffer;
    private com.jetbrains.Candidate candidate = new com.jetbrains.Candidate();

    public void editCandidate(String CandidateID, String filename) throws IOException {

        com.jetbrains.SignUp createCandidate = new com.jetbrains.SignUp();

        createCandidate.details(CandidateID, filename);

        edit(CandidateID, filename);


    }

    private void edit(String candidateID, String filename) throws IOException {
        System.out.println(" In Edit");
        String tempFile = "temp.txt";

        File file = new File(tempFile);

        if (!file.exists() && file.isDirectory()) {
            System.out.println("Temp file created");
            try {
                file.createNewFile();


                fileWriter = new FileWriter(file);
                buffer = new BufferedWriter(fileWriter);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            File oldFile = new File(filename);
            File newFile = new File(tempFile);

            String ID = "";
            String Name = "";
            String DOB = "";
            String Address = "";
            String Nationality = "";
            String IDType = "";
            String Gender = "";
            String Allergies = "";
            String FOODPref = "";
            String Qualification = "";
            String Experience = "";
            String Occupation = "";
            String ComputerSkills = "";
            String LanguagesKnown = "";


            try {

                FileWriter fw = new FileWriter(tempFile, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                s = new Scanner(new File(filename));
                s.useDelimiter("[,\n]");

                while (s.hasNext()) {

                    ID = s.next();
                    Name = s.next();
                    DOB = s.next();
                    Address = s.next();
                    Nationality = s.next();
                    IDType = s.next();
                    Gender = s.next();
                    Allergies = s.next();
                    FOODPref = s.next();
                    Qualification = s.next();
                    Experience = s.next();
                    Occupation = s.next();
                    ComputerSkills = s.next();
                    LanguagesKnown = s.next();


                    if (ID.equals(candidateID)) {
                        System.out.println("In if clause");
                        pw.println(candidate.getCandId() + "," + candidate.getName() + "," + candidate.getDob()
                                + "," + candidate.getAddress() + "," + candidate.getNationality() + "," + candidate.getIdentificationNumber() + "," + candidate.getAllergies()
                                + "," + candidate.getGender() + "," + candidate.getFoodPreferences() + "," + candidate.getQualification() + "," + candidate.getWorkExperience()
                                + "," + candidate.getOccupation() + "," + candidate.getComputerSkills() + "," + candidate.getLanguageSpoken());
                    } else {

                        System.out.println("In else clause    ");
                        pw.println(ID + "," + Name + "," + DOB
                                + "," + Address + "," + Nationality + "," + IDType + "," + Allergies
                                + "," + Gender + "," + FOODPref + "," + Qualification + "," + Experience
                                + "," + Occupation + "," + ComputerSkills + "," + LanguagesKnown);
                    }
                }
                s.close();
                pw.flush();
                pw.close();
                oldFile.delete();
                File dump = new File(filename);
                newFile.renameTo(dump);


                System.out.println("You successfully edited your profile. Redirecting to Main Menu.... ");

                Welcome.enterOptionForCand();


            } catch (IOException e) {
                e.printStackTrace();
            }



    }
}

