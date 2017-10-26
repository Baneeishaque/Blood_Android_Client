package bank.blood.ndk.user;


public class Donor {
    String blood_group;
    String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Donor(String name, String address, String mobile_number, String blood_group) {
        this.address = address;
        this.mobile_number =mobile_number;
        this.blood_group =blood_group;
        this.name=name;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    String mobile_number;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

}
