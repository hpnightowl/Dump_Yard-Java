import java.util.Scanner;

public class Invoice 
{
    private String num;
    private String name;
    private int quantity;
    private double price;
    private double invoice_amount;
    
    public Invoice(String number, String nam, int quan, double pri)
    {
        num = number;
        name = nam;
        quantity = quan;
        price = pri;
        invoice_amount = 0;
    }
    
    public String getnum()
    {
        return num;
    }
    public String getname()
    {
        return name;
    }
    public int getquantity()
    {
        return quantity;
    }
    public double getprice()
    {
        return price;
    }
    public double getinvoice_amount()
    {
        return invoice_amount;
    }  
        
    public void setnum( String item_n)
    {
        num = item_n;
    }
    public void setname(String n)
    {
        name = n;
    }
    public void setquantity(int quan)
    {
        if (quantity>=0){
            quantity = quan;
        }
        else{
            quantity =0;
        }
        total();
    }
    public void setprice(double pri)
    {
        if (price>=0){
            price = pri;
        }
        else{
            price=0.0;
        }
        total();
    }
    public void total()
    {
        invoice_amount = price * quantity;
    } 
    public void displayLine()
    {
        System.out.println("Item Number: "+num);
        System.out.println("Name: "+name);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+price);
        System.out.println("Total Cost: "+invoice_amount);
    } 


    /**
     * InvoiceTest
     */
    public static class InvoiceTest {
    
        public static void main(String[] args) {
        
            Invoice checkout = new Invoice("11AB", "Cheese", 2, 80.76);
            
            items(checkout);
          }
          
          public static void items(Invoice test)
          {
              Scanner in = new Scanner(System.in);
              //-----------------------------------------------------------
              System.out.println("Please enter Item Number: ");
              test.setnum(in.next());
              
              System.out.println("Please enter Item Name: ");
              test.setname(in.next());
              
              System.out.println("Please enter quantity: ");
              test.setquantity(in.nextInt());
              
              System.out.println("Please enter price: ");
              test.setprice(in.nextDouble());

              test.displayLine();

          }
          
       
    }
}
