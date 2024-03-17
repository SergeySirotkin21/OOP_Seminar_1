
public abstract class HotDrink {
    protected String name;
    protected  int temp;

    public HotDrink (String name, int temp){
        this.name = name;
        this.temp = temp;
    } 

    public HotDrink() {
    }

    public String getName(){
        return name;
    }

    public int getTemp(){
        return temp;
    }

    @Override
    public String toString(){
        return String.format("Напиток %s, Температура %d", name, temp);
    }
}




