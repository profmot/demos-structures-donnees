package demo1_2;

import demo1_2.validateur.Modele;

@SuppressWarnings("serial")

public class Demo2 extends Modele<Demo2> {
	
	public static void main(String[] args) {
		new Demo2().initialize();
	}

	
	private Fruit[] fruits = new Fruit[3];


	@Override
	public void initialize() {
		fruits[0] = new Fraise(29);
		fruits[1] = new Bleuet(10);
		fruits[2] = new FruitDragon(100);
		
		for(int i = 0; i < fruits.length; i++) {
			
			Fruit fruitCourant = fruits[i];
			
			System.out.println(fruitCourant);
			
		}
		
		/*
		for(Fruit fruitCourant : fruits) {

			System.out.println(fruitCourant);
			
		}
		*/
		
		
		
		
	}

}
