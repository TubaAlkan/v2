package ProjectVendingMachine;

public class Product {
    private double cocoStar=15;
    private double cokonat=20;
    private double cikolataliGofret=22;
    private double albeni=17;

    private  double metro=18;

    private  double price;
    private int selectNum;

    public double getCocoStar() {
        return cocoStar;
    }



    public double getCokonat() {
        return cokonat;
    }


    public double getCikolataliGofret() {
        return cikolataliGofret;
    }

    public double getAlbeni() {
        return albeni;
    }

    public double getMetro() {
        return metro;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSelectNum() {
        return selectNum;
    }

    public void setSelectNum(int selectNum) {
        this.selectNum = selectNum;
    }

    @Override
    public String toString() {
        return "Product" +
                "\n1-CocoStar=" + cocoStar + " ₺" +
                "\n2-Cokonat=" + cokonat + " ₺" +
                "\n2-CikolataliGofret=" + cikolataliGofret +  " ₺"+
                "\n4-Albeni=" + albeni +  " ₺"+
                "\n5-Metro=" + metro + " ₺";
    }
}
