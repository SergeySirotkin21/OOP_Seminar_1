/**
 * * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать 
перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт 
соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
 воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
 */
import java.util.List;

public class Main {

    public static void main(String[] args) {

        HotTempDrink drink1 = new HotTempDrink("Чай черный", 200, 95);
        HotTempDrink drink2 = new HotTempDrink("Чай зеленый", 200, 80);
        HotTempDrink drink3 = new HotTempDrink("Кофе черный", 100, 90);
        HotTempDrink drink4 = new HotTempDrink("Кофе экспресо", 200, 89);
        HotTempDrink drink5 = new HotTempDrink("Кофе черный", 90);
        HotTempDrink drink6 = new HotTempDrink("Кофе экспресо",89);

       

        HotDrinkMashine drinks1 = new HotDrinkMashine();
        HotDrinkMashine drinks2 = new HotDrinkMashine();

        drinks1.initDrinks(List.of(drink1, drink2, drink3, drink4));
        drinks2.initDrinks(List.of(drink5, drink6));
        drinks1.getProduct("Кофе черный");

        System.out.println(drinks1.getProduct("Кофе черный"));
        System.out.println(drinks1.getList());
    }
}

