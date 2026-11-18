package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakusa;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour() ;		
		prof.acheter("une boisson", 12);		
		prof.boire();		
		prof.acheter("un jeu", 2);		
		prof.acheter("un kimono", 50);
		Commercant marco = new Commercant("Marco", 0);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakusa yakuLeNoir = new Yakusa("Yaku Le Noir", "du whisky", 30, "Warsong");
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
		Ronin roco = new Ronin("Roco", "shochu", 60);
		roco.direBonjour();
		roco.donner(marco);
	}
	
}
