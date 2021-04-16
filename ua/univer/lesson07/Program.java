package ua.univer.lesson07;

import ua.univer.lesson07.market.Currency;
import ua.univer.lesson07.market.Product;
import ua.univer.lesson07.market.ProductList;
import ua.univer.lesson07.people.*;

public class Program {
    public static void main(String[] args) {
        Currency.usd =28.00;
        Student st1 = new Student("Tom",1,20);
        System.out.println(st1);
        Doctor doc1 = new Doctor("Haus",66,60);
        System.out.println(doc1);
        Fighter fight1 = new Fighter("Conan",30,75,60);
        System.out.println(fight1);

        Person p = new Student("Bob",2,22);

        Person [] personList = new Person[3];
        personList[0] = st1;
        personList[1] = doc1;
        personList[2] = fight1;

        PersonList pList = new PersonList(personList);

        int max_age = pList.getMaxAge();
        System.out.println(max_age);

        Person maxAgePerson = pList.getMaxAgePerson();
        System.out.println(maxAgePerson);

        for (Person person : personList) {
            System.out.println(person);
            System.out.println("discount ="+person.getDiscount());
        }

        ProductList productList = new ProductList();
        productList.add(new Product("Apple",20,1));
        productList.add(new Product("Banana",30,1));
        productList.add(new Product("Potato",10,1));
        Currency.usd =29.00;
        System.out.println(
                productList.getTotalCostWithDiscount(doc1)
        );
    }



}
