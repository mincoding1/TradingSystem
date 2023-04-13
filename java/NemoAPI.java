import java.util.Random;

public class NemoAPI {
    public void certification( String ID, String Password) {
        System.out.println("[네모]" + ID + "님 로그인 성공");
    }
    public void purchasingStock( String stockCode,int price, int count){
        System.out.println("[네모]" + stockCode + "를 " + price + "가격에 매수하였음");
    }
    public void ellingStock( String stockCode , int price, int count) {
        System.out.println("[네모]" + stockCode + "를 " + price + "가격에 매도하였음");
    }
    public int getMarketPrice ( String stockCode, int minute) {
        Random random = new Random();
        return random.nextInt() % 10 * 100 + 5000;
    }
}
