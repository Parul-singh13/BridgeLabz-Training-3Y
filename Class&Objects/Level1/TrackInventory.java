public class TrackInventory{
    String[] code;
    String[] Name;
    double[] price;

    TrackInventory(String[] code,String[] Name,double [] price) {
            this.code=code;
            this.Name=Name;
            this.price=price;
        }

    
    }
public void displayItems(int i){
    System.out.println("itemCode: " +code[i]);
    System.out.println("itemName: " + Name[i]);
    System.out.println("Price: "+ price[i]);
}
public static void main(String[] args) {
    String[] Name={"Pen","Notebook","Cup"};
    String[] code={"23","67","7"};
    double[] price={30,70,120};
    TrackInventory item1= new TrackInventory(code,Name,price);
}