package com.jetbrains;

import java.io.*;

public class EditMission {



        private static String[] list;
        private static boolean flag = false;
        private  static StringBuffer sb = new StringBuffer();
        private static String filename;
        private static File f;
        private static FileInputStream fs = null;
        private static InputStreamReader in = null;

    private Job job = new Job();
    private Employment employment = new Employment();
    private Country country = new Country();


        //private static String candidateID;

        public static void setFileMission(String file, String missionID) throws IOException {




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

                if (missionID.equals(d[0])) {

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
            String address;
            System.out.println("---------------------------");
            System.out.println("1. Mission Name");
            System.out.println("2. Mission Description");
            System.out.println("3. Country of origin");
            System.out.println("4. Countries allowed");
            System.out.println("5. Mission Coordinator name");
            System.out.println("6. Mission Coordinator contact");
            System.out.println("7. Job");
            System.out.println("8. Job description");
            System.out.println("9. Employment requirements Title(s)");
            System.out.println("10. Employment requirements no. of employees required for each job");
            System.out.println("11. Cargo : \n a. For the Journey \n b. For the mission \n c. For other missions");
            System.out.println("12. Mission launch date");
            System.out.println("13.  mission destination");
            System.out.println("14.  mission duration");
            System.out.println("15. To go back to main menu.....");


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {

                System.out.println("Enter value");
                option = Integer.parseInt(br.readLine());
                if (option < 1 || option > 16)
                    System.out.println("Enter only between 1 and 14 : ");
                else {


                    switch (option) {

                        case 1:

                            while (!flag) {
                                System.out.println("Enter your Mission Name: ");
                                String missionName = br.readLine();

                                flag = missionName.matches("[A-Za-z]*");
                                if (!flag)
                                    System.out.println("Enter only Alphabets!");
                                else {
                                    String existingValue = list[1];
                                    System.out.println("Existing value  "+existingValue );

                                    int index = sb.indexOf(list[1]);

                                    sb.replace(index,index+existingValue.length(), missionName);

                                    //System.out.println("Updated to new value "+ missionName);
                                    optionMenu();




                                }
                            }

                            break;

                        case 2:
                            while (!flag) {
                                System.out.println("Enter your Mission Description: ");
                                String missionDescription = br.readLine();

                                flag = missionDescription.matches("[A-Za-z]*");
                                if (!flag)
                                    System.out.println("Enter only Alphabets!");
                                else {
                                    String existingValue = list[2];

                                    int index = sb.indexOf(list[2]);
                                    sb.replace(index, index + existingValue.length(), missionDescription);

                                    optionMenu();
                                }
                            }
                            break;

                        case 3:

                            while (!flag) {
                                System.out.println("Enter your Country of origin: ");
                                String originCountry = br.readLine();

                                flag = originCountry.matches("[A-Za-z]*");
                                if (!flag)
                                    System.out.println("Enter only Alphabets!");
                                else {
                                    String existingValue = list[3];

                                    int index = sb.indexOf(list[3]);
                                    sb.replace(index, index + existingValue.length(), originCountry);

                                    optionMenu();
                                }
                            }

                            break;


                            case 4:

                                while (!flag) {
                                 //country.List();

                                    String countriesAllowedList = br.readLine();

                                    flag = countriesAllowedList.matches("[A-Za-z]*");
                                    if (!flag)
                                        System.out.println("Enter only Alphabets!");
                                    else {
                                        String existingValue = list[4];

                                        int index = sb.indexOf(list[4]);
                                        sb.replace(index, index + existingValue.length(), countriesAllowedList);

                                        optionMenu();
                                    }

                        }

                        break;


                        case 5:

                            while (!flag) {
                                System.out.println("Enter Mission Coordinator name : ");
                                String missionCoordinatorName = br.readLine();

                                flag = missionCoordinatorName.matches("[A-Za-z]*");
                                if (!flag)
                                    System.out.println("Enter only Alphabets!");
                                else {
                                    String existingValue = list[5];


                                    int index = sb.indexOf(list[5]);

                                    sb.replace(index, index + existingValue.length(),missionCoordinatorName);


                                    optionMenu();
                                }
                            }

                            break;


                        case 6:

                            while (!flag) {
                                System.out.println("Enter Mission Coordinator contact : ");
                                String missionCoordinatorContact = br.readLine();

                                if (missionCoordinatorContact.matches("[0]{1}[0-9]{9}"))
                                    flag = true;
                                else if (missionCoordinatorContact.matches("[0]{1}[0-9]{9}"))
                                    flag = true;
                                if (!flag)
                                    System.out.println("Enter 10 Mobile Number starting with 0");
                                else {
                                    String existingValue = list[6];


                                    int index = sb.indexOf(list[6]);

                                    sb.replace(index, index + existingValue.length(),missionCoordinatorContact);


                                    optionMenu();
                                }
                            }

                            break;
                        case 7:


                                while (!flag) {
                                    System.out.println("Enter your job:");
                                    String jobName = br.readLine();

                                    flag = jobName.matches("[A-Za-z]*");
                                    if (!flag)
                                        System.out.println("Enter only Alphabets!");
                                else {
                                    String existingValue = list[7];


                                    int index = sb.indexOf(list[7]);

                                    sb.replace(index, index + existingValue.length(),jobName);


                                    optionMenu();
                                }
                            }

                                break;


                                case 8:

                                    while (!flag) {
                                        System.out.println("Enter your job description:");
                                        String jobDescription = br.readLine();

                                        flag = jobDescription.matches("[A-Za-z]*");
                                        if (!flag)
                                            System.out.println("Enter only Alphabets!");
                                        else{
                                                String existingValue = list[8];


                                                int index = sb.indexOf(list[8]);

                                                sb.replace(index, index + existingValue.length(),jobDescription);


                                                optionMenu();
                                            }
                                        }break;
                                case 9:

                                    while (!flag) {
                                    System.out.println("Enter Employment requirements");
                                    System.out.println("a. Title(s):");
                                    String title= br.readLine();

                                    flag = title.matches("[A-Za-z]*");
                                    if (!flag)
                                        System.out.println("Enter only Alphabets!");
                                    else{
                                            String existingValue = list[9];


                                            int index = sb.indexOf(list[9]);

                                            sb.replace(index, index + existingValue.length(),title);


                                            optionMenu();
                                        }
                                    }break;
                                case 10:

                                    while (!flag) {

                                        System.out.println("b. No. of employee required for each job:");
                                        String count= br.readLine();

                                        flag = count.matches("[0-9]*");
                                        if (!flag)
                                            System.out.println("Enter only Numbers!");
                                        else{
                                            String existingValue = list[10];


                                            int index = sb.indexOf(list[10]);

                                            sb.replace(index, index + existingValue.length(),count);


                                            optionMenu();
                                        }
                                    }break;
                                case 11:

                                    while (!flag) {
                                        System.out.println("Enter your Cargo : \n a. For the Journey \n b. For the mission \n c. For other missions  ");
                                        String cargoType = br.readLine();

                                        flag = cargoType.matches("a|b|c|A|B|C");
                                        if (!flag)
                                            System.out.println("Enter 'a' or 'A' or 'b' or 'B' or 'c' or 'C' ");
                                        else{
                                            String existingValue = list[11];


                                            int index = sb.indexOf(list[11]);

                                            sb.replace(index, index + existingValue.length(),cargoType);


                                            optionMenu();
                                        }
                                    }break;
                                case 12:

                                    while (!flag) {
                                        System.out.println("Enter Mission launch date");
                                        String missionLaunchDate = br.readLine();

                                        flag = missionLaunchDate.matches("[0-9][0-9]-[0-9][0-9]-[1-2][0-9][0-9][0-9]*");
                                        if (!flag)
                                            System.out.println("Please Enter mission launch date in DD-MM-YYYY format");

                                        else{
                                            String existingValue = list[12];


                                            int index = sb.indexOf(list[12]);

                                            sb.replace(index, index + existingValue.length(),missionLaunchDate);


                                            optionMenu();
                                        }
                                    }break;

                                case 13:

                                    while (!flag) {
                                        System.out.println("Enter mission destination");
                                        String missionDestination = br.readLine();

                                        flag = missionDestination.matches("[A-Za-z]*");
                                        if (!flag)
                                            System.out.println("Enter only Alphabets!");
                                        else
                                            {
                                            String existingValue = list[13];


                                            int index = sb.indexOf(list[13]);

                                            sb.replace(index, index + existingValue.length(),missionDestination);


                                            optionMenu();
                                        }
                                    }break;

                                case 14:

                                    while (!flag) {
                                        System.out.println("Enter mission duration");
                                        String missionDuration = br.readLine();

                                        flag = missionDuration.matches("[A-Za-z]*");
                                        if (!flag)
                                            System.out.println("Enter only Alphabets!");

                                        else{
                                            String existingValue = list[14];


                                            int index = sb.indexOf(list[14]);

                                            sb.replace(index, index + existingValue.length(),missionDuration);


                                            optionMenu();
                                        }
                                    }break;
                             case 15:
                            System.out.println("sAVE and go back to main menu");
                            fs.close();
                            in.close();
                            FileWriter fstream = new FileWriter(f);
                            BufferedWriter outobj = new BufferedWriter(fstream);
                            outobj.write(sb.toString());
                            outobj.close();
                            MissionAdministrator.enterOption();

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


