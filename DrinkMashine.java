import java.util.List;

public interface DrinkMashine {

    
    public void initDrinks (List<HotDrink> listDrinks);
    public HotDrink getProduct(String name);
    public HotDrink getProduct(int temp);
    public List<HotDrink> getList();
}



