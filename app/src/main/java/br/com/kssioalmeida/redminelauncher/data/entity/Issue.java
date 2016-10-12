package br.com.kssioalmeida.redminelauncher.data.entity;

/**
 * Created by calmeida on 10/2/16.
 */

public class Issue {

    private int id;

    private String subject;

    private String description;

    private String startDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
