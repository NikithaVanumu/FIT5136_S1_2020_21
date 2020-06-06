package com.jetbrains;

import java.io.*;
import java.util.*;

public class StoreCandidate {

    private static List<String> record;
    private static boolean flag;
    private Scanner in;

    // create map to store
    static Map<String, List<String>> CandidateData = new HashMap<String, List<String>>();

    private static String fileName;

    public StoreCandidate(String fileName) {
        this.fileName = fileName;
    }

    public static void main(String[] args) {

        getMapOfAllCandidate();
    }

        public static void getMapOfAllCandidate() {
            try {
                //in = new Scanner(new File(fileName));
                FileInputStream file = new FileInputStream("candidate.txt");

                DataInputStream in = new DataInputStream(file);
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String line;
                while ((line = br.readLine()) != null) {
                    //line = in.nextLine();

                    String[] recordList = line.split(",");



                    String key = recordList[0];

                    System.out.println("key   " + key);
                    record = new ArrayList<String>();
                    Collections.addAll(record, recordList);

                    System.out.println("record collection values" + record);

                    CandidateData.put(key, record);
                }
                    // iterate and display values
                    System.out.println("Fetching Keys and corresponding [Multiple] Values n");
                    for (Map.Entry<String, List<String>> entry : CandidateData.entrySet()) {
                        String keyValue = entry.getKey();
                        List<String> values = entry.getValue();
                        System.out.println("Key = " + keyValue);
                        System.out.println("Values = " + values + "n");
                    }





optionMenu();
            } catch (IOException e) {
                System.out.println("File Not Found! Create a Record.");
            }
        }
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
                                String existingValue = record.get(0);
                                System.out.println("Existing value  "+existingValue );

                                CandidateData.get(existingValue).set(1, name);

                                System.out.println("Updated to new value "+ name);
                                getMapOfAllCandidate();


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
                                String existingValue = record.get(2);

                                CandidateData.get(existingValue).set(2, dob);

                                System.out.println("Updated to new value "+ dob);
                                optionMenu();
                            }
                        }
                        break;

                   /* case 3:

                        while (!flag) {
                            System.out.println("Enter Address");
                            String address = br.readLine();

                            flag = address.matches("[0-9a-zA-Z]*");
                            if (!flag)
                                System.out.println("Enter  Alphabets ,Numbers only AND Please don't give any spaces while entering!");
                            else {
                                String existingValue = list[3];

                                int index = sb.indexOf(list[1]);
                                sb.replace(index, index + existingValue.length(), address);

                                optionMenu();
                            }

                        }


                        break;

                    case 14:
                        System.out.println("sAVE and go back to main menu");
                        fs.close();
                        in.close();
                        FileWriter fstream = new FileWriter(f);
                        BufferedWriter outobj = new BufferedWriter(fstream);
                        outobj.write(sb.toString());
                        outobj.close();
                        Welcome.enterOptionForCand();
*/
                    default:
                        System.out.println("Please enter from given 'MENU OPTIONS' ");

                }

            }


        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
