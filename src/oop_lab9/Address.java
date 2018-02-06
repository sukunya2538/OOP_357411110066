package oop_lab9;

public class Address {
    private String homeNo;
    private String province;
    private int postCode;
    //con

    public Address(String homeNo, String province, int postCode) {
        this.homeNo = homeNo;
        this.province = province;
        this.postCode = postCode;
    }
    //get and set

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }
    //toString

    @Override
    public String toString() {
        return "Address{" +
                "homeNo='" + homeNo + '\'' +
                ", province='" + province + '\'' +
                ", postCode=" + postCode +
                '}';
    }
}
