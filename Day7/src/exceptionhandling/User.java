package exceptionhandling;

/**
 * Created by johrir on 7/26/2017.
 */
public class User {
    int uid;
    String name;
    int age;
    int rating;

    public User(int uid, String name, int age, int rating) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    public int getUid() {
        return uid;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
