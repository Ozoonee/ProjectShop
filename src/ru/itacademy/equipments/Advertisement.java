package ru.itacademy.equipments;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Advertisement {

    private static String ad1 = "Только сегодня! Тушёная свинина бренда \"Рога и Копыта\" со скидкой 90%!!!";
    private static String ad2 = "Алкоголь и сигареты не продаём ни детям, ни беременным, никому не продаём.";
    private static String ad3 = "Вытирайте ноги.";
    private static String ad4 = "Вторая касса не работает.";
    private static String ad5 = "Используя карту \"Десяточка\" Вы имеете шанс выйграть необитаемый остров в центре Тихого океана!";

    private static String[] advertisement = {ad1, ad2, ad3, ad4, ad5};

    public static void ad() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM, EEEE HH:mm");
        Date date = new Date();
        if (date.getHours() <= 21 && date.getHours() >= 8) {
            for (int i = 0; i < advertisement.length; i++) {
                System.out.println(advertisement[i]);
            }
        }
    }
}
