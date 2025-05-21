
package Config;

public class Session {
     private static Session instance;
    
    // User session variables
    private String id;
    private String first_name;
    private String last_name;
    private String gender;
    private String contact;
    private String password;
    private String status;
    
    // Database credentials per session
    private String dbUser;
    private String dbPassword;

    private Session() {
        // Private constructor to prevent direct instantiation
    }

    public static synchronized Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public static boolean isInstance() {
        return instance == null;
    }

    // Method to set user and database credentials
    public void setUserData(String id, String first_name, String last_name, String gender, 
                            String contact, String password, String status, String dbUser, String dbPassword) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.contact = contact;
        this.password = password;
        this.status = status;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
    }

    // Getters for user session details
    public String getID() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getGender() {
        return gender;
    }

    public String getContact() {
        return contact;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    // Getters for database credentials
    public String getDbUser() {
        return dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    // Individual setters if needed
    public void setID(String id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
    
    
}
