

public class Main
{
	public static void main(String[] args) {
    Cars myCar = new Cars("Audi", 2017, "Mark", "12345");
    myCar.displayBrand();//норм, метод public
    myCar.displayYear();//норм, метод имеет модификатор по умолчанию
    //myCar.displayName();//! Ошибка, метод private
    myCar.displayLiscense();//норм, метод protected
    
    System.out.println(myCar.brand);// норм, модификатор по умолчанию
    System.out.println(myCar.year); // норм, модификатор public
    System.out.println(myCar.name);// норм, модификатор protected
    //System.out.println(myCar.liscense);// ! Ошибка, модификатор private
    
  }
}
class Cars{
    String brand;
    protected int year;
    public String name;
    private String liscense;
    public Cars(String brand, int year, String name, String liscense){
        this.brand = brand;
        this.year = year;
        this.name = name;
        this.liscense = liscense;
    }
    public void displayBrand(){
        System.out.printf("Brand: %s \n", brand);
    }
    void displayYear(){
        System.out.printf("Year: %d \n", year);
    }
    private void displayName(){
        System.out.printf("Name: %s \n", name);
    }
    protected void displayLiscense(){
        System.out.printf("Liscense: %s\n", liscense);
    }
}