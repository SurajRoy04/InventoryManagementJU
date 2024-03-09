package entities;

public class Seller {

    private int sid;
    private String seller_name;
    private int pid;

    public Seller(int sid, String seller_name, int pid) {
        this.sid = sid;
        this.seller_name = seller_name;
        this.pid = pid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
