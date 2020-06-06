package com.jetbrains;
public class Employment {
    private String title;
    private String count;

    public Employment() {
    }

    public Employment(String title, String count) {
        this.title = title;
        this.count = count;
    }
    /**
     *used to retrieve title
     */

    public String getTitle() {
        return title;
    }
    /**
     *used to update or set title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     *used to retrieve count
     * @return
     */

    public String getCount() {
        return count;
    }
    /**
     *used to update or set count
     * @param count
     */
    public void setCount(String count) {
        this.count = count;
    }
}