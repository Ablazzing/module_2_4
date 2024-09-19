package org.javaacademy.lesson7.call_center;

public class Runner {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();
        CallScript sellCreditCard = new CallScript() {
            @Override
            public void readScript() {
                System.out.println("Меня зовут Петр из Альфа банка!");
                System.out.println("предлагаю вам оформить кредитную карту!");
            }
        };
        callCenter.call(sellCreditCard);

        System.out.println("___________________________________________");
        CallScript changeTelephoneCompany = () -> System.out.println("Не хотите ли вы сменить оператора на мтс?");

        for (int i = 0; i < 3; i++) {
            callCenter.call(changeTelephoneCompany);
        }

    }
}
