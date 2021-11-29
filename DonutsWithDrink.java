package local.hal.sa31.androidjava.lesson2.asgmt2;

public class DonutsWithDrink extends Donuts {

	private String _drinkName;//ドリンク名

	private int _drinkPrice;//ドリンク金額
	
	//----[コンストラクタ]----//
	public DonutsWithDrink(String drinkName, int drinkPrice, String name, int price, int quentity) {
		super(name, price, quentity);
		_drinkName = drinkName;
		_drinkPrice = drinkPrice;
	}

	//----[ドリンク代込み金額]----//
	public int getPriceWithDrink() {
		return getTotalDonutsPrice() + _drinkPrice;
	}

	//----[セット合計]----//
	public void showOrder() {
		super.showOrder();
		System.out.println("ドーナツと" + _drinkName + "とのセットで合計" + getPriceWithDrink() + "円");
	}
}
