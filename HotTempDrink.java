  public class HotTempDrink extends HotDrink {
    private int value;

    public HotTempDrink(String name, int temp){
        super(name, temp);  
    }

    
    public HotTempDrink(String name, int value, int temp){
        super(name, temp);
        this.value = value;  
    }

    public int getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return String.format("Напиток %s, Объем %d, Температура %d", name, value, temp);
    }
}


