public class User
{
    String id;
    String firstName;
    String lastName;
    String email;
    String password;
    boolean isHost;
    String intro;

    public User(String id, String firstName, String lastName, String email, String password, boolean isHost, String intro)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isHost = isHost;
        this.intro = intro;
    }
}
