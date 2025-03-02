// 1. Calculate CGST and SGST for a product and print the total price to pay {CGST=9%, SGST=11%}
public class pay {

    public static double TotalPrice(double product_price){
        double cgst= (product_price/100)*9;
        double sgst=(product_price/100)*11;
        double total_price=product_price+cgst+sgst;
        return total_price;
    }
    public static void main(String[] args) {
        double product_price=100;
        System.out.println("price of the produt without CGST & SGST is:- "+product_price);
        System.out.println("total price of the produt is:- "+TotalPrice(product_price));
    }
}