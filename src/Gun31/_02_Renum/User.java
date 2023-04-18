package Gun31._02_Renum;

public class User {
    String username;
    Soru.Role role; // kullanıcının rolü öbür tarafta tanımladığımız rol cinsinden olmalı.
    Soru.Statu statü;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", statü=" + statü +
                '}';
    }

    public User(String username, Soru.Role role, Soru.Statu statü) {
        this.username = username;
        this.role = role;
        this.statü = statü;
    }
}
