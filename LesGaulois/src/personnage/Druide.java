package personnage;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public int preparerPotion() {
		Random random = new Random();
		int r = random.nextInt(this.effetPotionMax);
		if (r>7) {
			this.parler("J'ai préparé une super potion de force"+ r);
		} else {
			this.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force"+r);
		}
		return r;
	}
	
	public void booster(Gaulois gaulois){
		if (gaulois.getNom() == "Obélix") {
			this.parler("Non, Obélix !... Tu n'auras pas de potion magique !");
		} else {
			gaulois.boirePotion(this.preparerPotion());
		}
	}
	
}

