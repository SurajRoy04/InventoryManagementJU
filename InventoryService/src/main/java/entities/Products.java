package entities;

public class Products {

    private int pid;
    private String product_name;

    private int quntity;

    private double price;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Products(int pid, String product_name, int quntity, double price) {
        this.pid = pid;
        this.product_name = product_name;
        this.quntity = quntity;
        this.price = price;
    }
}
