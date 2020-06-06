package com.jetbrains;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Country {
    private String countriesAllowedList;

    public Country()
    {
        this.countriesAllowedList = countriesAllowedList;
    }
    /**
     *used to retrieve countries allowed list
     */

    public String getCountriesAllowedList() {
        return countriesAllowedList;
    }
    /**
     *used to update or set countries allowed list
     */
    public void setCountriesAllowedList(String countriesAllowedList) {
        this.countriesAllowedList = countriesAllowedList;
    }

        public static void list(){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Please Select a country from the following list");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\n a. India \n b. Australia  \n c. China \n d. Afghanistan \n e. Austria \n f. Belgium \n g. Bangladesh \n h. Bhutan ");
        System.out.println("\n i. Brazil \n j. Canada  \n k. Colombia \n l. Denmark \n m. Egypt \n n. United Kingdom \n o. Finland \n p. France ");
        System.out.println("\n q. Germany \n r. United States  \n s. Italy \n t. Japan \n u. Kyrgyzstan \n v. Pakistan \n w. Malaysia \n x. Mexico ");
        System.out.println("\n y. Russia \n z. Sri Lanka ");


    }
}
