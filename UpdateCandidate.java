package com.jetbrains;

import javax.swing.*;
import java.io.*;

public class UpdateCandidate {
    private static String[] list;
    private static boolean flag = false;
    private  static StringBuffer sb = new StringBuffer();
    private static String filename;
    private static File f;
   private static FileInputStream fs = null;
    private static InputStreamReader in = null;

    //private static String candidateID;

    public static void setFileCandidate(String file, String CandidateID) throws IOException {




         f = new File(file);
        BufferedReader br = null;

        String textLine;


        try {
            fs = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        in = new InputStreamReader(fs);
        br = new BufferedReader(in);

        while ((textLine = br.readLine()) != null) {

            String[] d = textLine.split(",");

            if (CandidateID.equals(d[0])) {

                list = textLine.split(",");
                sb.append(textLine);
                optionMenu();

            }

        }
        fs.close();
        in.close();
        br.close();

    }

    /**
     * This method is used to select the attribute which user wants to Update
     */
    private static void optionMenu() throws IOException {
        int option;

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
        System.out.println("14. To go back to main menu.....");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println("Enter value");
            option = Integer.parseInt(br.readLine());
            if (option < 1 || option > 15)
                System.out.println("Enter only between 1 and 13 : ");
            else {


                switch (option) {

                    case 1:

                        while (!flag) {
                            System.out.println("Enter your Name: ");
                            String name = br.readLine();

                            flag = name.matches("[A-Za-z]*");
                            if (!flag)
                                System.out.println("Enter only Alphabets!");
                            else {
                                String existingValue = list[1];
                                System.out.println("Existing value  "+existingValue );

                                int index = sb.indexOf(list[1]);

                                sb.replace(index,index+existingValue.length(), name);

                                System.out.println("Updated to new value "+ name);
                                optionMenu();


                            }
                        }

                        break;

                    case 2:
                        while (!flag) {
                            System.out.println("Enter Date of birth (DD-MM-YYYY):");
                            String dob = br.readLine();

                            flag = dob.matches("[0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]*");
                            if (!flag)
                                System.out.println("Please Enter in DD-MM-YYYY format");
                            else {
                                String existingValue = list[2];

                                int index = sb.indexOf(list[2]);
                                sb.replace(index, index + existingValue.length(), dob);

                                optionMenu();
                            }
                        }
                        break;

                    case 3:

                        while (!flag) {
                            System.out.println("Enter Address");
                            String address = br.readLine();

                            flag = address.matches("[0-9a-zA-Z]*");
                            if (!flag)
                                System.out.println("Enter  Alphabets ,Numbers only AND Please don't give any spaces while entering!");
                            else {
                               String existingValue = list[3];

                                int index = sb.indexOf(list[3]);
                                sb.replace(index, index + existingValue.length(), address);

                                optionMenu();
                            }

                        }


                        break;

                    case 4:

                        while (!flag) {
                            System.out.println("Enter Nationality");
                            String nationality = br.readLine();

                            flag = nationality.matches("[A-Za-z]*");
                            if (!flag)
                                System.out.println("Enter  Alphabets only!");
                            else {
                                String existingValue = list[4];

                                int index = sb.indexOf(list[4]);
                                sb.replace(index, index + existingValue.length(), nationality);

                                optionMenu();
                            }

                        }
                        break;

                    case 5:

                        while (!flag) {
                            System.out.println("Enter IdentificationType");
                            String IdentificationType = br.readLine();

                            flag = IdentificationType.matches("PAN|SSN|ABN|ADHAAR|TFN");
                            if (!flag)
                                System.out.println("Enter 'PAN' or 'SSN' or 'ADHAAR' or 'TFN' or 'ABN' ");
                            else {
                                String existingValue = list[5];

                                int index = sb.indexOf(list[5]);
                                sb.replace(index, index + existingValue.length(), IdentificationType);

                                optionMenu();
                            }

                        }
                        break;

                    case 6:

                        while (!flag) {

                            System.out.println("Enter Gender");
                            String gender = br.readLine();

                            flag = gender.matches("Male|Female|male|female");
                            if (!flag)
                                System.out.println("Enter 'male','female','Male','Female' ");
                            else {
                                String existingValue = list[6];

                                int index = sb.indexOf(list[6]);
                                sb.replace(index, index + existingValue.length(), gender);

                                optionMenu();
                            }

                        }
                        break;

                    case 7:

                        while (!flag) {

                            System.out.println("Enter allergies");
                            String allergies = br.readLine();

                            flag = allergies.matches("[A-Za-z]*");
                            if (!flag)
                                System.out.println("Enter only Alphabets!");
                            else {
                                String existingValue = list[7];

                                int index = sb.indexOf(list[7]);
                                sb.replace(index, index + existingValue.length(), allergies);

                                optionMenu();
                            }

                        }
                        break;

                    case 8:

                        while (!flag) {

                            System.out.println("Enter foodPreferences");
                            String foodPreferences = br.readLine();

                            flag = foodPreferences.matches("[A-Za-z]*");
                            if (!flag)
                                System.out.println("Enter only Alphabets!");
                            else {
                                String existingValue = list[8];

                                int index = sb.indexOf(list[8]);
                                sb.replace(index, index + existingValue.length(), foodPreferences);

                                optionMenu();
                            }

                        }
                        break;


                    case 9:

                        while (!flag) {

                            System.out.println("Enter qualification(s):");
                            String qualification = br.readLine();

                            flag = qualification.matches("[A-Za-z]*");
                            if (!flag)
                                System.out.println("Enter only Alphabets!");
                            else {
                                String existingValue = list[9];

                                int index = sb.indexOf(list[9]);
                                sb.replace(index, index + existingValue.length(), qualification);

                                optionMenu();
                            }

                        }
                        break;


                    case 10:

                        while (!flag) {

                            System.out.println("Enter workExperience");
                            String workExperience = br.readLine();

                            flag = workExperience.matches("[A-Za-z]*");
                            if (!flag)
                                System.out.println("Enter only Alphabets!");
                            else {
                                String existingValue = list[10];

                                int index = sb.indexOf(list[10]);
                                sb.replace(index, index + existingValue.length(), workExperience);

                                optionMenu();
                            }

                        }
                        break;

                    case 11:

                        while (!flag) {

                            System.out.println("Enter occupation");
                            String occupation = br.readLine();

                            flag = occupation.matches("[A-Za-z]*");
                            if (!flag)
                                System.out.println("Enter only Alphabets!");
                            else {
                                String existingValue = list[11];

                                int index = sb.indexOf(list[11]);
                                sb.replace(index, index + existingValue.length(), occupation);

                                optionMenu();
                            }

                        }
                        break;


                    case 12:

                        while (!flag) {

                            System.out.println("Enter computerSkills:");
                            String computerSkills = br.readLine();

                            flag = computerSkills.matches("[A-Za-z]*");
                            if (!flag)
                                System.out.println("Enter only Alphabets!");
                            else {
                                String existingValue = list[12];

                                int index = sb.indexOf(list[12]);
                                sb.replace(index, index + existingValue.length(), computerSkills);

                                optionMenu();
                            }

                        }
                        break;


                    case 13:

                        while (!flag) {

                            System.out.println("Enter languageSpoken:");
                            String languageSpoken = br.readLine();

                            flag = languageSpoken.matches("[A-Za-z]*");
                            if (!flag)
                                System.out.println("Enter only Alphabets!");
                            else {
                                String existingValue = list[13];

                                int index = sb.indexOf(list[13]);
                                sb.replace(index, index + existingValue.length(), languageSpoken);

                                optionMenu();
                            }

                        }
                        break;



                    case 14:
                        System.out.println("Saving.... Going back to main menu");
                        fs.close();
                        in.close();
                        FileWriter fstream = new FileWriter(f);
                        BufferedWriter outobj = new BufferedWriter(fstream);
                        outobj.write(sb.toString());
                        outobj.close();
                        Welcome.enterOptionForCand();

                    default:
                    System.out.println("Please enter from given 'MENU OPTIONS' ");
                    optionMenu();

                }

            }


        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
