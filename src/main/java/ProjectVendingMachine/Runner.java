package ProjectVendingMachine;

public class Runner {
    public static void main(String[] args) {

        Methods methods=new Methods();
        Product product=new Product();

       double money=methods.money();
        System.out.println("Hesabinizda"+ money+ "  TL var");
        product.setPrice(methods.select(product));
        money=methods.balance(product.getPrice() ,money ,product);
        methods.purchase( product.getPrice() ,money ,product);






    }




}
