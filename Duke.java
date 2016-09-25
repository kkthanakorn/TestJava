
package oopPackage;

import java.util.Scanner;

public class Duke {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
     
        ShoppingCart cart = new ShoppingCart();
        
        for(int j=0; j<4; j++)
        {
            System.out.println("Input item: ");
            String itmn = input.nextLine();
            cart.addItem(itmn);
        }
        cart.showCart();
        String itmn = "ss";
        //String x;
        while ( itmn != "x")
        {
            if(!cart.itemNames.isEmpty())
            {
                System.out.println("Input item that you need to remove: ");
                itmn = input.nextLine();
                System.out.println(itmn);
                if(itmn != "x")
                {
                    cart.removeItem(itmn);
                }
                else continue;
            }
        };
        
        cart.showCart();
        cart.payCart();
    }
}
