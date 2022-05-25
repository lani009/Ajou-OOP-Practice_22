import java.util.ArrayList;
import java.util.List;

public class CoinTest {

	public static void main(String[] args) {
		List<Coin> myWallet = new ArrayList<>();

		myWallet.add(new Coin("BTC", 9543.66, 10));
		myWallet.add(new Coin("ETH", 3240.17, 20));
		myWallet.add(new Coin("XRP", 910.95, 10));
		myWallet.add(new Coin("LTC", 1184.12, 30));

		for (Coin coin : myWallet) {
			System.out.printf("코인이름: %s 가격: %f 보유수량: %d 평가 금액: %f\n", coin.getCoinName(), coin.getPrice(),
					coin.getQty(), coin.calcPrice());
		}
	}

}
