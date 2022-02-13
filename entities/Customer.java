public class Customer implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private int dateOfbirthYear;
    private long nationalityId;

    public Customer() {

    }

    public Customer(int id, String firstName, String lastName, int dateOfbirthYear, long nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfbirthYear = dateOfbirthYear;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateOfbirthYear() {
        return dateOfbirthYear;
    }

    public void setDateOfbirthYear(int dateOfbirthYear) {
        this.dateOfbirthYear = dateOfbirthYear;
    }

    public long getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(long nationalityId) {
        this.nationalityId = nationalityId;
    }
}
