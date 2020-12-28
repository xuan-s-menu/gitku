package unit;

public class admin {
    private String adminid;
    private String adminpassword;
    public  admin(){

    }
    public admin(String adminid, String adminpassword) {
        this.adminid = adminid;
        this.adminpassword = adminpassword;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }
}
