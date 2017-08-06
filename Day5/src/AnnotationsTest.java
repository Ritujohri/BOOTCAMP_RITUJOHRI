/**
 * Created by johrir on 7/24/2017.
 */

public class AnnotationsTest {
    @Company(name = "CDK Global", loacation = "Pune")
    public AnnotationsTest() {
        System.out.println("Using company annotation at constructor level");
    }

    @TimeStamp(day = Day.MONDAY, month = Month.AUG, year = Year.YEAR_2017)
    void display(){
        System.out.println("using timestamp annotations");
    }

    public static void main(String[] args) {
        AnnotationsTest annotationsTest=new AnnotationsTest();
        annotationsTest.display();
    }
}
