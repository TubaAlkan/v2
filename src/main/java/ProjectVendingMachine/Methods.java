package ProjectVendingMachine;

import javax.swing.plaf.PanelUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public  class Methods {
    public double money(){
        Scanner scan=new Scanner(System.in);
      System.out.println("Lutfen yatirmak istediginiz TL miktarini giriniz");
      Double money=scan.nextDouble();
     return money;
    }
    public double select(Product product) {
        System.out.println(product.toString());
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("lutfen almak istediginiz urunun numarasini tuslayiniz\n Cikmak icin 0'a basiniz");
            product.setSelectNum(scan.nextInt());

            if (product.getSelectNum() <0 || product.getSelectNum() >5) {
                System.out.println("Lutfen Gecerli Numara Tuslayiniz");
            }
        } while (product.getSelectNum() <0 || product.getSelectNum() >5);



        switch (product.getSelectNum()) {
            case 0:
                System.out.println("Tesekkur eder Tekrar Bekleriz");
                break;
            case 1:
                product.setPrice(product.getCocoStar());
                break;
            case 2:
                product.setPrice(product.getCokonat());
                break;
            case 3:
                product.setPrice(product.getCikolataliGofret());
                break;
            case 4:
                product.setPrice(product.getAlbeni());
                break;
            case 5:
                product.setPrice(product.getMetro());
                break;


        }return product.getPrice();

    }public  double balance(double Price,double money, Product product ) {//product.getPrice() ,money ,product

        while (product.getPrice()> money) {

            System.out.println(" Yetersiz Bakiye Para Eklemek Istermisiniz Evet ise 'Y' Hayir ise 'N' olarak giris yapiniz");
            Scanner scan = new Scanner(System.in);
            char secim = scan.next().toUpperCase().charAt(0);

            if (secim == 'N') {
                System.out.println("Tesekkur eder Tekrar bekleriz");
                break;
            } else if (secim == 'Y') {
                System.out.println("Lutfen eklemek istediginiz para miktarini giriniz");
                double eklenecek = scan.nextDouble();
                 money = money + eklenecek;
                System.out.println("Hesabinizda" +money+" TL bulunmaktadir");
                select(product);

            } else {
                System.out.println("Lutfen Gecerli Bir Secim Yapiniz");
            }
        }return money;


    }
    public  void purchase(double Price,double money, Product product){

        while (money>= product.getPrice()){
            money=money- product.getPrice();
            System.out.println("Hesabinizda "+ money + "bulunmaktadir");
            Scanner scan=new Scanner(System.in);
            System.out.println("Alisverise Devam etmek istermisiniz Y/N olarak giris yapiniz");
            char onay=scan.next().toUpperCase().charAt(0);
            if (onay=='N'){
                System.out.println("Tesekkur eder Tekrar Bekleriz");
                break;
            } else if (onay=='Y') {
                product.setPrice(select(product));
                money=balance(product.getPrice(), money, product);

            }else {
                System.out.println("Lutfen Gecerli Bir deger giriniz");
            }
        }
    }



}  //class sonu