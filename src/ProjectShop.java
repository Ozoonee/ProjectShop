import ru.itacademy.DataAndObjects;
import ru.itacademy.equipments.Advertisement;

public class ProjectShop {
    public static void main(String[] args) {
        DataAndObjects.createCollaborators();   // Метод создаёт персонал магазина.
        DataAndObjects.time();                  // Метод информирует о режиме работы магазина.
        Advertisement.ad();                     // Метод включает рекламу в магазине. Работает только когда магазин открыт.
    }
}
