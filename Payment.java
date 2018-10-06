import java.util.*;
public class Payment
{
    private FoodItem[] fi;
    private  int fiCount;
    private static double foodTax=0.2;
    
    private DrinkItem[] di=new DrinkItem[100];
    private int diCount;
    private static double drinkTax=0.1;
    
    public Payment()
    {
        fiCount=0;
        diCount=0;
        fi =new FoodItem[100];
    }
    public DrinkItem getDi(int x)
    {
        return di[x];
    }
    public FoodItem getFi(int x)
    {
        return fi[x];
    }
    public void addFoodItem(FoodItem f)
    {
       
        fi[fiCount] = new FoodItem(f.getCode(),f.getQuantity());
        System.out.println(fi[0].getCode() + " " + fi[0].getQuantity());
        fiCount++;
    }
    public void addDrinkItem(DrinkItem d)
    {
        di[diCount]=new DrinkItem(d.getCode(),d.getQuantity());
        diCount++;
    }
    public static double findPrice(Item[] pl, String c)
    {
        for(Item i:pl)
        {
            if(i.getCode().equals(c))
            {
                return i.getPrice();
            }
        }
        return 0;
    }
    public double calculateBill(Item[] pl )
    {
        double ftotal=0;
        double dtotal=0;

        for (int i=0;i<fiCount;i++)
        {

            ftotal= ftotal+findPrice(pl,fi[i].getCode())*fi[i].getQuantity();
            
            
        }
        ftotal=ftotal*(1+foodTax);
        
        for (int i=0;i<diCount;i++)
        {
   
            dtotal=dtotal+(findPrice(pl,di[i].getCode())*di[i].getQuantity());
            
        }
        dtotal=dtotal*(1+drinkTax);
        
        return (ftotal+dtotal);

     }
}
            