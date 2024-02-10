package seminar3;

public class Employee {

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //    Задача: Создать класс ”Сотрудник” с полями: ФИО, должность, телефон, зарплата, возраст;
    //    Задача: Написать функцию выводящую всю доступную информацию об объекте
    //    Задача: Создать массив из 5 сотрудников. Массив должен быть сразу инициализирован и
    //    не должно быть создано дополнительных переменных.
    public String name;
    public String post;
    public int age;
    public double salary;
    public int number;

    public Employee(String name, int age, double salary, int number) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name: " + name +
                ", age: " + age +
                ", salary: " + salary +
                ", number: " + number + "\n";
    }
}
