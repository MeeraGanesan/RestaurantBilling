import java.util.*;
public class Main
{
    public void main()
    {
        Scanner SC=new Scanner(System.in);
        Item[] pl=new Item[10];
        pl[0]=new Item("F1","Pasta",40);
        pl[1]=new Item("F2","Noodles",20);
        pl[2]=new Item("F3","Sandwich",35);
        pl[3]=new Item("F4","Pizza",100);
        pl[4]=new Item("F5","Burger",25);
        pl[5]=new Item("D1","Water",10);
        pl[6]=new Item("D2","Tea",25);
        pl[7]=new Item("D3","Coffee",35);
        pl[8]=new Item("D4","Juice",40);
        pl[9]=new Item("D5","Cold water",25);
        Payment[] tables=new Payment[50];
        for (Item p:pl)
        {
            System.out.println(p.toString());
        }
        
                tables[0] = new Payment();
        while(true)
        {
        System.out.println("Enter the choice 1)Food Item 2)Drink Item 3)Bill 4)Quit");
        int choice=SC.nextInt();

        
        if (choice==4)
        {
            break;
        }
        else
        {
            switch(choice)
            {
                case 1:
                System.out.println("Enter the code and quantity");
                String s=SC.next();
                int quant=SC.nextInt();
                tables[0].addFoodItem(new FoodItem(s,quant));
                break;
                case 2:
                System.out.println("Enter the code and quantity");
                String d=SC.next();
                int quan=SC.nextInt();
                tables[0].addDrinkItem(new DrinkItem(d,quan));
                break;
                case 3:
                double total=tables[0].calculateBill(pl);
                System.out.println("Total with tax="+total);
                break;
            }
        }
    }
    }
}