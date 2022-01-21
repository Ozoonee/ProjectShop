import ru.itacademy.DataAndObjects;
import ru.itacademy.equipments.Advertisement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectShop {
    public static void main(String[] args) throws InterruptedException  {
        DataAndObjects.createCollaborators();   // Метод создаёт персонал магазина.
        DataAndObjects.time();                  // Метод информирует о режиме работы магазина.
        Advertisement.ad();                     // Метод включает рекламу в магазине(delay 5s). Работает только когда магазин открыт.
    }
}
