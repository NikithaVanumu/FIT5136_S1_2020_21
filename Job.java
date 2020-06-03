package com.jetbrains;

public class Job {
    private String jobName;
    private String jobDescription;

    public Job(String jobName, String jobDescription) {
        this.jobName = jobName;
        this.jobDescription = jobDescription;
    }

    /**
     *used to retrieve job name
     */
    public String getJobName() {
        return jobName;
    }
    /**
     *used to update or set job name
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    /**
     *used to retrieve job description
     */

    public String getJobDescription() {
        return jobDescription;
    }

    /**
     *used to update or set job description
     */

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}

