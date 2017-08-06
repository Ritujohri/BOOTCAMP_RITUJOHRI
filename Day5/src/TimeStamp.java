import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by johrir on 7/24/2017.
 */
enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY
}

enum Month{
    JAN,FEB,MARCH,APRIL,MAY,JUNE,JULY,AUG,SEP,OCT,NOV,DEC
}

enum Year{
    YEAR_2015,YEAR_2016,YEAR_2017,YEAR_2018,YEAR_2019,YEAR_2020
}

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@interface TimeStamp {

    Day day();
    Month month();
    Year year();
}
