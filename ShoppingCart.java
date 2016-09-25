package oopPackage;

import java.util.ArrayList;

public class ShoppingCart {
    
//1..................
    ArrayList<String> itemNames = new ArrayList();
    public void addItem(String itmName)
    {
        itemNames.add(itmName);
    }
    public void removeItem(String itmName)
    {
        int index = itemNames.indexOf(itmName);
        System.out.println("You are removing item number \""+ index + "\" from your cart.");
        if(index!=-1)
        {
            itemNames.remove(index);
        }
//      }  for(String itm : itemNames)
//        {
//            if(itm.equalsIgnoreCase(itmName))
//            {
//                itemNames.remove(itm);
//            }
//        }    
    }
    public void clearCart(){
        itemNames.clear();
    }
    public void payCart(){
        System.out.println("Thank you.");
    }
    public void showCart()
    {
        System.out.println("\n.............");
        for(int i=0;i<itemNames.size();i++)
        {
            System.out.println("There is (are) some : "+itemNames.get(i)+"(s) into your cart.");
        }
        System.out.println("\n.............");
    }
}
