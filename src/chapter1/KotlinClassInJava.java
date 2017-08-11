package chapter1;

import java.math.BigDecimal;

public class KotlinClassInJava {

    public void createAndPrintPersonNameFromKotlinClass() {
        Person person = new Person("venkata", true);
        System.out.println(person.getName());


        Rectangle rectangle = new Rectangle(new BigDecimal("23.03"),new BigDecimal("15.02"));

        rectangle.getArea();

    }



}
