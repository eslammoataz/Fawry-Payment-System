package Demo.Users;

public class Admin implements User {
    public String email;
    public String username;
    public String password;

    public Admin(String _email, String _userName, String _password) {
        this.email = _email;
        this.username = _userName;
        this.password = _password;
    }



}
