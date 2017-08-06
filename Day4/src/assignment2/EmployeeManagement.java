package assignment2;

enum Month {
	JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
}

enum Year {
	YEAR2015,YEAR2016,YEAR2017,YEAR2018,YEAR2019,YEAR2020;
}

enum City {
	DELHI,BHOPAL,PUNE,HYDERABAD,KOLKATA;
}

class EmployeeManagement {
	public static void main(String[] args){
		Employee emp1 = new Employee(1022, "archna", Month.JULY, Year.YEAR2016);
		emp1.display();
	}
}