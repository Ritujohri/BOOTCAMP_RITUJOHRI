package assignment2;

class Company {
    String companyName;
    int strength;
    City city;

    Company() {
        this.companyName = "CDK";
        this.strength = 1400;
        this.city = City.PUNE;
    }

    void display() {
        System.out.println("companyName :" + this.companyName);
        System.out.println("strength :" + this.strength);
        System.out.println("city :" + this.city);
    }

}

