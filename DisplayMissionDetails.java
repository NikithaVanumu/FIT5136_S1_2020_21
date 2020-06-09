package com.jetbrains;

import java.io.*;

public class DisplayMissionDetails {


    private static String[] list;

    private static String filename;


    //private static String candidateID;

    public static void MissionDetails(String file) throws IOException {


        File f;
        FileInputStream fs = null;
        InputStreamReader in ;

        f = new File(file);
        BufferedReader br ;


        try {
            fs = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assert fs != null;
        in = new InputStreamReader(fs);
        br = new BufferedReader(in);
        System.out.println("Mission ID          Mission Name     ");
        String textLine;
        while ((textLine = br.readLine()) != null) {
        //System.out.println(" in details"+ textLine+"    filename: "+file);
            String[] d = textLine.split(",");

         String missionId = d[0];
         String missionName = d[1];


         System.out.println();
         System.out.println(" "+missionId+"       "+missionName);

            }


        }


    }

