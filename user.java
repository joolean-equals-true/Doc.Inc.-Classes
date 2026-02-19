public class user {
    public String first_name;
    public String last_name;
    public String email;
    public String address;
    public String phone_number;
    public String identifier;
    public Boolean is_active;
    public String username;
    public String password;
    public String account_number;
    public String ssn;
    public Integer id;
    

    user(){
        this.first_name = "";
        this.last_name = "";
        this.email = "";
        this.address = "";
        this.phone_number = "";
        this.is_active = "";
        this.username = "";
        this.password = "";
        this.account_number = "";
        this.ssn ="";
        this.id = null;
    }
    user(String first_name, String last_name, String email, String address, String phone_number, 
         Boolean is_active, String username, String password, String account_number,
        String ssn, int id)
        {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.address = address;
        this.phone_number = phone_number;
        this.is_active = is_active;
        this.username = username;
        this.password = password;
        this.account_number = account_number;
        this.ssn = ssn;
        this.id = id;
        }
}
