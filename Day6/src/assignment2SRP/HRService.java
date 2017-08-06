package assignment2SRP;

public class HRService {
    private final EmployeeService employeeService;

    public HRService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    void changeDesignation(int experience) {
        if (experience > 2) {
            employeeService.setDesig("senior member Technical");
        } else if (experience > 5) {
            employeeService.setDesig("Team lead");
        }

    }

    void changeProject(String desig) {
        if (desig.equalsIgnoreCase("senior member Techincal")) {
            System.out.println("Project changed");
        }

    }

    void eligibleForPromotion(int experience) {
        if (experience > 3) {
            System.out.println("Promoted");
        }
    }
}