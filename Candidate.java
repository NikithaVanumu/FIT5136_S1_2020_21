package com.jetbrains;

public class Candidate {

    private String candId;
    private String name;
    private String dob;
    private String address;
    private String nationality;
    private String identificationNumber;
    private String gender;
    private String allergies;
    private String foodPreferences;
    private String qualification;
    private String workExperience;
    private String occupation;
    private String computerSkills;
    private String languageSpoken;

    public Candidate(){

    }

    public Candidate(String candId, String name,String dob, String address,
                     String nationality, String identificationNumber, String gender, String allergies, String foodPreferences, String qualification,
                     String workExperience, String occupation, String computerSkills, String languageSpoken){
        this.candId = candId;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.nationality = nationality;
        this.identificationNumber = identificationNumber;
        this.gender = gender;
        this.allergies = allergies;
        this.foodPreferences = foodPreferences;
        this.qualification = qualification;
        this.workExperience= workExperience;
        this.occupation = occupation;
        this.computerSkills = computerSkills;
        this.languageSpoken = languageSpoken;
    }

    /**
     *used to retrieve candId
     */
    public String getCandId() {
        return candId+",";
    }
    /**
     *used to update or setCandId
     */
    public void setCandId(String candId) {
        this.candId = candId;
    }
    /**
     *used to retrieve name
     */
    public String getName() {
        return name;
    }
    /**
     *used to update or set name
     */

    public void setName(String name) {
        this.name = name;
    }
    /**
     *used to retrieve Date of birth
     */
    public String getDob() {
        return dob;
    }

    /**
     *used to update or set Date of birth
     */

    public void setDob(String dob) {
        this.dob = dob;
    }
    /**
     *used to retrieve address
     */
    public String getAddress() {
        return address;
    }
    /**
     *used to update or set address
     */

    public void setAddress(String address) {
        this.address = address;
    }
    /**
     *used to retrieve nationality
     */
    public String getNationality() {
        return nationality;
    }
    /**
     *used to update or set nationality
     */

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     *used to retrieve identificationNumber
     */
    public String getIdentificationNumber() {
        return identificationNumber;
    }
    /**
     *used to update or set identificationNumber
     */

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
    /**
     *used to retrieve Gender
     */
    public String getGender() {
        return gender;
    }
    /**
     *used to update or set Gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *used to retrieve allergies
     */
    public String getAllergies() {
        return allergies;
    }
    /**
     *used to update or set allergies
     */

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    /**
     *used to retrieve foodPreferences
     */
    public String getFoodPreferences() {
        return foodPreferences;
    }
    /**
     *used to update or set foodPreferences
     */

    public void setFoodPreferences(String foodPreferences) {
        this.foodPreferences = foodPreferences;
    }
    /**
     *used to retrieve qualification
     */
    public String getQualification() {
        return qualification;
    }
    /**
     *used to update or set qualification
     */

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    /**
     *used to retrieve workExperience
     */
    public String getWorkExperience() {
        return workExperience;
    }
    /**
     *used to update or set workExperience
     */

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    /**
     *used to retrieve occupation
     */
    public String getOccupation() {
        return occupation;
    }
    /**
     *used to update or set occupation
     */

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     *used to retrieve computerSkills
     */
    public String getComputerSkills() {
        return computerSkills;
    }
    /**
     *used to update or set computerSkills
     */
    public void setComputerSkills(String computerSkills) {
        this.computerSkills = computerSkills;
    }

    /**
     *used to retrieve languageSpoken
     */
    public String getLanguageSpoken() {
        return languageSpoken;
    }
    /**
     *used to update or set languageSpoken
     */
    public void setLanguageSpoken(String languageSpoken) {
        this.languageSpoken = languageSpoken;
    }

}


