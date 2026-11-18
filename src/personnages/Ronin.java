package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	public void donner(Commercant beneficiaire) {
		 int montant = argent/10;
		 argent -= montant;
		 parler(beneficiaire.getNom() + " prends ces " + montant + " sous.");
		 beneficiaire.recevoir(montant);
	}
	public void provoquer(Yakusa adversaire) {
		int force = 2*honneur;
		if (force>= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			argent += adversaire.perdre();
			honneur +=1;
			parler("Je t’ai eu petit yakusa!");
		} else {
			int gain =argent;
			argent =0;
			honneur -=1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(gain);
		}
	}
}
