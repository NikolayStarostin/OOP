package HW_1.Task_1.Model;

public class User {
    private String userLogin;
    private String userPassword;
    private Basket userBasket;

    public User(String userLogin, String userPassword) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userBasket = new Basket();
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Basket getUserBasket() {
        return userBasket;
    }
}