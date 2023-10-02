package personnage;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipements = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		assert force > 0;
		this.force = force;
		equipements = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0;
		int forceAvant = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert forceAvant > force;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipements) {
			case 0:
			extracted(equipement);
				break;
			case 1:
				if(equipements[0] == equipement)System.out.println("Le soldat " + nom + " possède déjà un " + equipement + ".");
				else {
					extracted(equipement);
				}
				break;
			default:
				System.out.println("Le soldat " + nom + " est déjà bien protégé !");
		}
	}

	private void extracted(Equipement equipement) {
		equipements[nbEquipements++] = equipement;
		System.out.println("Le soldat "+ nom + " s'équipe avec un " + equipement + ".");
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		Equipement casque = Equipement.CASQUE;
		minus.sEquiper(casque);
		minus.sEquiper(casque);
		Equipement bouclier = Equipement.BOUCLIER;
		minus.sEquiper(bouclier);
		minus.sEquiper(bouclier);
	}
}
