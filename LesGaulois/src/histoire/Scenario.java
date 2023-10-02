package histoire;

import personnage.Gaulois;
import personnage.Romain;
import personnage.Druide;

public class Scenario {

	public static void main(String[] args) {
		
		Gaulois asterix  = new Gaulois("Astérix",8);
		Gaulois obelix  = new Gaulois("Obélix",8);
		
		Druide panoramix = new Druide("Panoramix",5,10);
		
		Romain minus = new Romain("Minus",-6);

		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		
		panoramix.booster(asterix);
		
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
	}

}
