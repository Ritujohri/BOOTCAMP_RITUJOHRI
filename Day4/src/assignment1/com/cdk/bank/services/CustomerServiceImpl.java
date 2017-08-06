package assignment1.com.cdk.bank.services;

class CustomerServiceImpl implements CustomerService {
    String name;
    String address;
    long mobileNo;

    CustomerServiceImpl() {
        this.name = "jaggu";
        this.address = "pune";
        this.mobileNo = 6256768;
    }

    public void details() {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Name : " + mobileNo);
    }

    public void updateAddress(String address) {
        this.address = address;
    }

    public void updateMobile(long mobileNo) {
        this.mobileNo = mobileNo;
    }
}
