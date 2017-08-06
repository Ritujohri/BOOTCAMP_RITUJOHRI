import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by johrir on 7/24/2017.
 */

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.CONSTRUCTOR)
@interface Company{
    String name() ;
    String loacation() ;

}