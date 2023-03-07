package sales;

public class Shop {
    private String name;
    private String address;
    private final long reg_no;

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public long getReg_no() {
        return this.reg_no;
    }

    public String setName(String name) {
        this.name = name;
        System.out.println("*********************Shop name has been set*********************");
        return this.name;
    }

    public String setAddress(String address) {
        this.address = address;
        System.out.println("*********************Shop address has been set*********************");
        return this.address;
    }

    public String changeName(String name) {
        this.name = name;
        System.out.println("*********************Shop name changed successfully!*********************");
        return this.name;
    }

    public String changeAddress(String address) {
        this.address = address;
        System.out.println("*********************Shop Address changed successfully!*********************");
        return this.address;
    }

    public void displayShopDetails() {
        System.out.println("Shop name: " + this.name);
        System.out.println("Shop address: " + this.address);
        System.out.println("Shop Registration Number: " + this.reg_no);
    }

    public Shop(long reg_no) {
        this.reg_no = reg_no;
    }

    public Shop(String address, long reg_no) {
        this.address = address;
        this.reg_no = reg_no;
    }

    public Shop(long reg_no, String name) {
        this.reg_no = reg_no;
        this.name = name;
    }

    public Shop(String name, String address, long reg_no) {
        this.name = name;
        this.address = address;
        this.reg_no = reg_no;
    }
}