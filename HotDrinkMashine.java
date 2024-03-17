
import java.util.ArrayList;
import java.util.List;

public class HotDrinkMashine implements DrinkMashine {

    List<HotDrink> listDrinks = new ArrayList<HotDrink>();

    public void initDrinks (List<HotDrink> listDrinks){
        this.listDrinks = listDrinks;
    }
    public HotDrink getProduct(String name){
        for (HotDrink drink : listDrinks) {
            if (drink.getName().equals(name)){
                return drink;
            }
            
        }
        return null;
    }

    public HotDrink getProduct(int temp) {
        for (HotDrink drink : listDrinks) {
            if (drink.getTemp() == temp){
                return drink;
            }
        }
        return null;

    }

    


    public List<HotDrink> getList(){
        return listDrinks;
     }
}



