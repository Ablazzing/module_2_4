package org.javaacademy.homework.homework5.ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
        //Запрещено изменять модификаторы доступа!
        //Практически все будет через рефлексию
        //Создать банк с 1500 денег
        //Создать вора
        //Дописать метод stealMoney у вора так, чтобы он крал все деньги из банка себе
        //(увеличивал у себя деньги и обнулял деньги банка)
        //Вызвать здесь метод stealMoney
        //Распечатать вора и банк

        //Итог:
        //Вор - 1500 денег
        //Банк - 0 денег

        Bank bank = createInstance(Bank.class, new Class[]{BigDecimal.class}, BigDecimal.valueOf(1500));
        Thief thief = createInstance(Thief.class, new Class[]{});
        stealMoney(thief, bank);
        System.out.println(bank);
        System.out.println(thief);
    }

    private static void stealMoney(Thief thief, Bank bank) {
        try {
            Method stealMoneyMethod = Thief.class.getDeclaredMethod("stealMoney", Bank.class);
            stealMoneyMethod.setAccessible(true);
            stealMoneyMethod.invoke(thief, bank);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static <T> T createInstance(Class<T> tClass, Class[] argumentType, Object... argumentValues) {
        try {
            Constructor<T> constructor = tClass.getDeclaredConstructor(argumentType);
            constructor.setAccessible(true);
            return constructor.newInstance(argumentValues);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Bank createBank(BigDecimal money) {
        try {
            Constructor<Bank> bankConstructor = Bank.class.getDeclaredConstructor(BigDecimal.class);
            bankConstructor.setAccessible(true);
            return bankConstructor.newInstance(money);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Thief createThief() {
        try {
            Constructor<Thief> thiefConstructor = Thief.class.getDeclaredConstructor();
            thiefConstructor.setAccessible(true);
            return thiefConstructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
