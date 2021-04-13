package CollectionsRecursion;

import java.util.List;
import java.util.Objects;

/**
 * @ author Fei Gu
 * @ create 2021-04-13-10.16
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description
 * @ Version
 */
public class Customer implements Comparable{
    String name;
    int age;
    int price;

    public Customer() {
    }

    public Customer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && price == customer.price && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, price);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Customer){
            Customer customer = (Customer) o;
            if(this.age > customer.age){
                return 1;
            }
            else if(this.age < customer.age){
                return -1;
            }
            else {
                return 0;
            }
        }
        throw new RuntimeException("the date is incorrect");
    }


}
