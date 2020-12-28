package unit;

public class article {
    private  String userid;
    private String adminid;
    private String message;
    private String answer;
    private String articleid;

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid;
    }

    public article(){

    }
    public article(String userid, String adminid, String message, String answer,String articleid) {
        this.userid = userid;
        this.adminid = adminid;
        this.message = message;
        this.answer = answer;
        this.articleid=articleid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
