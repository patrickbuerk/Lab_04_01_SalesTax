public class Main
{

    public static void main(String[] args)
    {
	double priceOfProduct = 12.75;
    double priceOfProductWithTax = (priceOfProduct * .05) + priceOfProduct;
        System.out.println("The price of your product before tax = "+ priceOfProduct +" your price of product with tax = "+ priceOfProductWithTax);
    }
}
