package unit;

public class user {
    private String userid;
    private String username;
    private String  userpassword;
    private int userphone;

    public user(){

    }
    public user(String userid, String username, String userpassword, int userphone) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
        this.userphone = userphone;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getUserphone() {
        return userphone;
    }

    public void setUserphone(int userphone) {
        this.userphone = userphone;
    }

}
