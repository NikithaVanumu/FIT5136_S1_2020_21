
package com.jetbrains;
public class Criteria {
    private int range_of_age;
    private String qualification;
    private String years_of_work_experience;
    private String occupation;
    private String health_records;
    private String criminal_records;
    private String computer_skills;
    private String languages_spoken;


    public Criteria() {
    }

    public Criteria(int range_of_age , String qualification, String years_of_work_experience, String occupation, String health_records, String criminal_records, String computer_skills, String languages_spoken) {
        this.range_of_age = range_of_age;
        this.qualification = qualification;
        this.years_of_work_experience = years_of_work_experience;
        this.occupation = occupation;
        this.health_records = health_records;
        this.criminal_records = criminal_records;
        this.computer_skills = computer_skills;
        this.languages_spoken = languages_spoken;
    }

    /**
     *used to retrieve range of age
     */
    public int getRange_of_age() {
        return range_of_age;
    }

    /**
     *used to update or set range of age
     */
    public void setRange_of_age(int range_of_age) {
        this.range_of_age = range_of_age;
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
     *used to retrieve years of work experience
     */
    public String getYears_of_work_experience() {
        return years_of_work_experience;
    }

    /**
     *used to update or set years of work experience
     */
    public void setYears_of_work_experience(String years_of_work_experience) {
        this.years_of_work_experience = years_of_work_experience;
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
     *used to retrieve health records
     */
    public String getHealth_records() {
        return health_records;
    }

    /**
     *used to update or set occupation
     */
    public void setHealth_records(String health_records) {
        this.health_records = health_records;
    }

    /**
     *used to retrieve criminal records
     */
    public String getCriminal_records() {
        return criminal_records;
    }

    /**
     *used to update or set criminal records
     */
    public void setCriminal_records(String criminal_records) {
        this.criminal_records = criminal_records;
    }

    /**
     *used to retrieve computer skills
     */
    public String getComputer_skills() {
        return computer_skills;
    }

    /**
     *used to update or set computer skills
     */
    public void setComputer_skills(String computer_skills) {
        this.computer_skills = computer_skills;
    }

    /**
     *used to retrieve languages spoken
     */
    public String getLanguages_spoken() {
        return languages_spoken;
    }

    /**
     *used to update or set languages spoken
     */
    public void setLanguages_spoken(String languages_spoken) {
        this.languages_spoken = languages_spoken;
    }
}