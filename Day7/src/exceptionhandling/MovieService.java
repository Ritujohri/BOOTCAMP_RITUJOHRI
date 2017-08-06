package exceptionhandling;

/**
 * Created by johrir on 7/26/2017.
 */
public class MovieService {
    public static void watch(User user) throws InvalidAgeException, RatingBelowStandardException {
        if (user.getAge()< 10){
            throw (new InvalidAgeException("User age less than 10"));
        }
        else if (user.getAge() < 20){
            throw (new InvalidAgeException("USer age less than 20"));
        }
        else if (user.getAge()<=0) {
            throw (new InvalidAgeException("User age is invalid"));
        }
        if (user.getRating()<3){
            throw new RatingBelowStandardException("User rating is below 3");
        }
    }
    public static void buy(User user, double price) throws InvalidPriceException {

        if (price < 2000){
            throw (new InvalidPriceException("Price is below 2000"));
        }
        else if (price <= 0){
            throw new InvalidPriceException("Price is invalid");
        }
        System.out.println("Enjoy your movie !!!!");
    }

}
