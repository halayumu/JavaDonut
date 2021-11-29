package local.hal.sa31.androidjava.lesson2.asgmt2;

public class Donuts {

	private String _name;//ドーナツ名

	private int _price;//単価

	private int _quantity;//個数

	//----[コンストラクター]----//
	public Donuts(String name, int price, int quantity) {
		_name = name;
		_price = price;
		_quantity = quantity;
	}

	//----[ドーナツ合計処理]----//
	public int getTotalDonutsPrice() {
		return _price * _quantity;
	}

	//----[注文詳細]----//
	public void showOrder() {
		System.out.println(_name + "が" + _quantity + "個" + "で合計" + getTotalDonutsPrice() + "円");
	}

}