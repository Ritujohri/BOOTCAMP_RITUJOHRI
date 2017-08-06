package exceptionhandling;

/**
 * Created by johrir on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args)  {
        User user = new User(110, "Ritu",1,100);
       try {
           MovieService.buy(user, 200);

       } catch (InvalidPriceException e) {
           System.out.println(e.getMessage());
       }
       try {
           MovieService.watch(user);
       } catch (InvalidAgeException e) {
           System.out.println(e.getMessage());
       } catch (RatingBelowStandardException e) {
           System.out.println(e.getMessage());
       }
    }
}
