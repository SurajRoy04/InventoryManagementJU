package entities;

public class Customer {

    private int cust_id;
    private String cust_name;
    private int sid;
    private int pid;

    public Customer(int cust_id, String cust_name, int sid, int pid) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.sid = sid;
        this.pid = pid;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
