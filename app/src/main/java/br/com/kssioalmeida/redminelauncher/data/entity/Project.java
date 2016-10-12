package br.com.kssioalmeida.redminelauncher.data.entity;

/**
 * Created by calmeida on 10/2/16.
 */
public class Project {

    private int id;

    public String name;

    private String identifier;

    private String description;

    private int status;

    private boolean isPublic;

    private String createdOn;

    private String updatedOn;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public int getStatus() {
        return status;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    @Override
    public String toString() {
        return "id: " + id + " - name: " + name + " - identifier: " + identifier + " - description: " + description + " - " +
                "status " + status + " - is_public: " + isPublic + " created_on: " + createdOn + " - updatedOn: " + updatedOn;
    }
}
