package local.hal.sa31.androidjava.lesson2.asgmt2;

public class ShowDonutsPrice {
	public static void main(String[] args) {
		//----[オールドドーナツ結果]----//
		Donuts donut = new Donuts("オールドファッション", 120, 3);
		donut.showOrder();
		
		//----[チョコドーナツとドリンク結果]----//
		DonutsWithDrink set = new DonutsWithDrink("アイスコーヒー", 350, "チョコファッション", 140, 2);
		set.showOrder();
	}
}
