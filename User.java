import java.util.Objects;

public class User {

      private String login;
       private String password;
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    public boolean equals(Object obj) {
        if (this == obj) return  true;
        if (obj == null || !getClass().equals(obj.getClass())) return false;
        User other = (User) obj;

        return Objects.equals(login, other.login)
                && Objects.equals(password, other.password);
    }


    public int hashCode() {
        int result = 17;

        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();

        return result;
    }
}
