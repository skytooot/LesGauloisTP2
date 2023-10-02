package personnage;

public class Village {
	private String nom;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private Chef chef;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void ajouterHabitant(Gaulois gaulois) {
		this.villageois[nbVillageois++]= gaulois;
	}

	public Gaulois trouverHabitant(int i) {
		return villageois[i];
	}

	public void afficherVillageois() {
		System.out.println("Dans village du chef " + this.chef.getNom() + " vivent les légendaires gaulois :");
		for(int i=0;i<this.nbVillageois;i++){
			System.out.println(" - "+ this.villageois[i].getNom());
		}
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//probablement index out of range;
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//probablement index out of range ou alors variable pas encore initialisée;
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
	}
}