package personnages;

public class Yakusa extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakusa(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	

	public int getReputation() {
		return reputation;
	}


	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int butin =victime.getArgent();
		argent += butin;
		reputation +=1;
		victime.seFaireExtorquer();
		parler("J’ai piqué les " + butin + " sous de " + victime.getNom() + ", ce qui me fait " + argent +" sous dans ma poche. Hi ! Hi !");
	}
	public int perdre() {
		int perte = argent;
		argent = 0;
		reputation -=1;
		parler("J’ai perdu mon duel et mes " + perte + " sous, snif... J'ai déshonoré le clan de " +clan +".");
		return perte;
	}
	public void gagner(int gain) {
		argent += gain;
		parler("Ce ronin pensait vraiment battre " + getNom() +" du clan de " + clan +"? Je l'ai dépouillé de ses " +gain+" sous.");
	}
}
