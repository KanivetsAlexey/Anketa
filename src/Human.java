/**
 * Created by Alexey on 01.03.2017
 */
public class Human {

    private String firstName;
    private String lastName;
    private int age;
    private static int quantity = 0;
    private boolean answQuestion1;
    private boolean answQuestion2;


    public Human() {
    }

    public Human(String firstName, String lastName, int age, boolean answQuestion1, boolean answQuestion2) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.answQuestion1 = answQuestion1;
        this.answQuestion2 = answQuestion2;
        synchronized (this)
        {
            quantity++;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static int getQuantity() {
        return quantity;
    }

    public boolean getAnswQuestion1() {
        return answQuestion1;
    }

    public boolean getAnswQuestion2() {
        return answQuestion2;
    }
}
