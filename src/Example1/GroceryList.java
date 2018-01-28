package Example1;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> grocerList=new ArrayList<String>();

    public void addGroceryItem(String item){
        grocerList.add(item);
    }

    public void printGroceryList(){
        System.out.println("you have "+grocerList.size()+"items in your list");
        for(int i=0;i<grocerList.size();i++){
            System.out.println((i+1)+"."+grocerList.get(i));
        }
    }

    public void modifyGroceryItem(int postion,String newItem){
        grocerList.set(postion,newItem);
        System.out.println("Grocery item "+(postion)+"has been modified .");
    }
    public void removeGroceryItem(int position){
        String theItem=grocerList.get(position-1);
        grocerList.remove(position);
    }
    public String findItem(String seachItem){
        //boolean exits=grocerList.contains(seachItem);
        int postion=grocerList.indexOf(seachItem);
        if(postion>=0){
            return grocerList.get(postion);
        }
        return null;
    }
}
