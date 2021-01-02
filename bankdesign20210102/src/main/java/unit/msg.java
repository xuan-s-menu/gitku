package unit;

import java.util.Date;

public class msg {
    private String cardid1;
    private String cardid2;
    private double money;
    private Date time;
    private String msgid;

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public msg(){

    }
    public msg(String cardid1, String cardid2, double money, Date time,String msgid) {
        this.cardid1 = cardid1;
        this.cardid2 = cardid2;
        this.money = money;
        this.time = time;
        this.msgid=msgid;
    }

    public String getCardid1() {
        return cardid1;
    }

    public void setCardid1(String cardid1) {
        this.cardid1 = cardid1;
    }

    public String getCardid2() {
        return cardid2;
    }

    public void setCardid2(String cardid2) {
        this.cardid2 = cardid2;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
