package hometasks.Chapter13.task3;

import java.util.Formatter;

/**
 * Created by Grisha on 01.03.2016.
 */
//424

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private int[] w = {15,5,10,2,15};
    //                      0,1, 2,3

    public void printTitle(){
        f.format("%-"+w[0]+"s %"+w[1]+"s %"+w[2]+"s\n", "Item", "Qty", "Price");
        f.format("%-"+w[0]+"s %"+w[1]+"s %"+w[2]+"s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price){
        f.format("%-"+w[0]+"."+w[4]+"s %"+w[1]+"d %"+w[2]+"."+w[3]+"f\n", name, qty, price);
        total += price;
    }

    public void printTotal(){
        f.format("%-"+w[0]+"s %-"+w[1]+"s %"+w[2]+"."+w[3]+"f\n", "Tax", "", total*0.06);
        f.format("%-"+w[0]+"s %"+w[1]+"s %"+w[2]+"s\n", "", "", "-----");
        f.format("%-"+w[0]+"s %-"+w[1]+"s %"+w[2]+"."+w[3]+"f\n", "Total", "", total*1.06);
    }

    public void modifyWidth(int width){
        w[0] = width;
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.modifyWidth(20);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
