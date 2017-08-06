package assignment2;

class Employee extends Company {
    int id;
    String name;
    Month joiningMonth;
    Year joiningYear;

    Employee(int id, String name, Month joiningMonth, Year joiningYear) {
        this.id = id;
        this.name = name;
        this.joiningMonth = joiningMonth;
        this.joiningYear = joiningYear;
    }

    void display() {
        super.display();
        System.out.println("ID :" + this.id);
        System.out.println("Name :" + this.name);
        System.out.println("joiningMonth :" + this.joiningMonth);
        System.out.println("joiningYear :" + this.joiningYear);
    }
}

