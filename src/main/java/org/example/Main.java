package org.example;

import java.lang.reflect.InvocationTargetException;


public class Main {
    private static final RandomClass randomClass = new RandomClass();

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Account randomAccount1 = randomClass.<Account>fullRandomObjectGenerate(Account.class);
        Account man = new Account();
        man.setFirstName("MAN");
        Account randomAccount2 = randomClass.<Account>nullFieldsRandomObjectGenerate(man, Account.class);
        System.out.println(randomAccount2.toString());
    }
}