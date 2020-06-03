
package com.jetbrains;
public class Employment {
    private String title;
    private int count;

    public Employment() {
    }

    public Employment(String title, int count) {
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
     */

    public int getCount() {
        return count;
    }
    /**
     *used to update or set count
     */
    public void setCount(int count) {
        this.count = count;
    }
}
