package co.simplon.poo.s2;

public class Carre extends Figure {
		
	private double longueurCarre;
	
	@Override
	public double perimetre() {
		return 2 * ( longueurCarre + longueurCarre );
		
	}

	@Override
	public double surface() {
		return  longueurCarre * longueurCarre ;
		
	}
	public  void  afficher ( String nom ) {
	       System.out.println("Informations du carre " + nom + " : ") ;
		   System.out.println("  - longueur  : " + longueurCarre) ;
		   System.out.println("  - perimetre : " + perimetre()) ;
		   System.out.println("  - surface   : " + surface());
	}	
}
