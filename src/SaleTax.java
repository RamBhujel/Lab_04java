public class SaleTax {
    public static void main(String[] args)
    {
        //Task1
        double tax = 0.05;
        double itemPrice = 150.0;
        double finalPrice = 0.0;
        double saleTax = 0.0;
        saleTax = itemPrice * tax;
        finalPrice = saleTax + itemPrice;
        System.out.println("The item Price is $ " + itemPrice + " and tax is $ " + saleTax + ", and the total is $ " +finalPrice);
    }
}