package com.jetbrains;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SignUp {
    private boolean flag;
    private Candidate candidate = new Candidate();
    public static List<Candidate> candList = new ArrayList<Candidate>();
    private static FileWriter fileWriter;
    private static BufferedWriter buffer;


    public void details(String counter, String filename) {
        System.out.println("Please Enter the following Details");

        try {
            System.out.println("ID : " + counter);
            candidate.setCandId(counter);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*
Used to take Name input from the user
*/
            while (!flag) {
                System.out.println("Enter your Name: ");
                String name = br.readLine();

                flag = name.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    candidate.setName(name + ",");
            }
            flag = false;
/*
Used to take Date of birth input from the user
*/
            while (!flag) {
                System.out.println("Enter Date of birth (DD-MM-YYYY):");
                String dob = br.readLine();

                flag = dob.matches("[0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]*");
                if (!flag)
                    System.out.println("Please Enter in DD-MM-YYYY format");
                else
                    candidate.setDob(dob + ",");
            }
            flag = false;
/*
Used to take address input from the user
*/
            while (!flag) {
                System.out.println("Enter Address");
                String address = br.readLine();

                flag = address.matches("[0-9A-Za-z+,]*");
                if (!flag)
                    System.out.println("Enter  Alphabets ,Number and , only!");
                else
                    candidate.setAddress(address + ",");
            }
            flag = false;
/*
Used to take nationality input from the user
*/
            while (!flag) {
                System.out.println("Enter nationality");
                String nationality = br.readLine();

                flag = nationality.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    candidate.setAddress(nationality + ",");
            }
            flag = false;
/*
Used to take identificationNumber input from the user
*/
            while (!flag) {
                System.out.println("Enter identificationNumber");
                String identificationNumber = br.readLine();

                flag = identificationNumber.matches("([0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9])");
                if (!flag)
                    System.out.println("Enter only Number");
                else
                    candidate.setIdentificationNumber(identificationNumber + ",");
            }
            flag = false;
/*
Used to take gender input from the user
*/
            while (!flag) {
                System.out.println("Enter Gender");
                String gender = br.readLine();

                flag = gender.matches("Male|Female|male|female");
                if (!flag)
                    System.out.println("Enter 'male','female','Male','Female' ");
                else
                    candidate.setGender(gender + ",");
            }
            flag = false;

            /*
            Used to take allergies input from the user
            */
            while (!flag) {
                System.out.println("Enter allergies");
                String allergies = br.readLine();

                flag = allergies.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    candidate.setAddress(allergies + ",");
            }
            flag = false;

/*
Used to take foodPreferences input from the user
*/
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

/*
Used to take qualification input from the user
*/
            while (!flag) {
                System.out.println("Enter qualification(s):");
                String qualification = br.readLine();

                flag = qualification.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    candidate.setQualification(qualification + ",");
            }
            flag = false;
/*
Used to take workExperience input from the user
*/
            while (!flag) {
                System.out.println("Enter workExperience");
                String workExperience = br.readLine();

                flag = workExperience.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    candidate.setWorkExperience(workExperience + ",");
            }
            flag = false;
/*
Used to take occupation input from the user
*/
            while (!flag) {
                System.out.println("Enter occupation");
                String occupation = br.readLine();

                flag = occupation.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    candidate.setOccupation(occupation + ",");
            }
            flag = false;

/*
Used to take computerSkills input from the user
*/
            while (!flag) {
                System.out.println("Enter computerSkills:");
                String computerSkills = br.readLine();

                flag = computerSkills.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    candidate.setComputerSkills(computerSkills + ",");
            }
            flag = false;
/*
Used to take languageSpoken input from the user
*/
            while (!flag) {
                System.out.println("Enter languageSpoken:");
                String languageSpoken = br.readLine();

                flag = languageSpoken.matches("[A-Za-z]*");
                if (!flag)
                    System.out.println("Enter only Alphabets!");
                else
                    candidate.setLanguageSpoken(languageSpoken + ",");
            }
            flag = false;


            File file = new File(filename);

            System.out.println(" ID : " + counter);
            candidate.setCandId(counter);

            if (file.exists() && !file.isDirectory()) {
                fileWriter = new FileWriter(file, true);
                buffer = new BufferedWriter(fileWriter);
            } else {
                file.createNewFile();
                fileWriter = new FileWriter(file);
                buffer = new BufferedWriter(fileWriter);
            }

            buffer.write(candidate.getCandId() + candidate.getName() + candidate.getDob()
                    + candidate.getAddress() + candidate.getNationality() + candidate.getIdentificationNumber() + candidate.getAllergies()
                    + candidate.getGender() + candidate.getFoodPreferences() + candidate.getQualification() + candidate.getWorkExperience()
                    + candidate.getOccupation() + candidate.getComputerSkills() + candidate.getLanguageSpoken());

            if (buffer != null || fileWriter != null) {
                buffer.close();
                fileWriter.close();
            }

            System.out.println("Congratulations!! You have Successfully registered!! " + candidate.getName());


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}


