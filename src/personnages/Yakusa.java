package personnages;

public class Yakusa extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakusa(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
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
}
