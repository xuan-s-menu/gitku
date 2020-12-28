package unit;

public class card {
    private String cardid;
    private String cardname;
    private double cardmoney;
    private String userid;
    public card(){

    }
    public card(String cardid, String cardname, double cardmoney, String userid) {
        this.cardid = cardid;
        this.cardname = cardname;
        this.cardmoney = cardmoney;
        this.userid = userid;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public double getCardmoney() {
        return cardmoney;
    }

    public void setCardmoney(double cardmoney) {
        this.cardmoney = cardmoney;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
