package seminar4;

public class Buyer {
    private String name;
    private int age;
    private String paymentMethod;


    public Buyer(String name, int age, String paymentMethod) {
        this.name = name;
        this.age = age;
        this.paymentMethod = paymentMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
