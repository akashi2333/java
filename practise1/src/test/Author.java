package test;

public class Author {
	private String lastname;
    private String firstname;
    private String email;
    private String work;

    Author(String lastname,String firstname,String email,String work){
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.work = work;
    }

    Author(){}
    Author(String firstname,String lastname){
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
