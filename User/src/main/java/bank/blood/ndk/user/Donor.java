package bank.blood.ndk.user;


public class Donor {
    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    String blood_group;
    String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    int sno;

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

    public Donor(String blood_group, String address, int sno, String mobile_number, String name) {
        this.blood_group = blood_group;
        this.address = address;
        this.sno = sno;
        this.mobile_number = mobile_number;
        this.name = name;
    }
}
