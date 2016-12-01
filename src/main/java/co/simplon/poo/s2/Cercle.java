package co.simplon.poo.s2;

public class Cercle extends Figure {

	private double rayonCercle;
	protected double nombre = 2;
			
	@Override
	public double perimetre() {
		return nombre * Math.PI * rayonCercle;
	}

	@Override
	public double surface() {
		return Math.PI * rayonCercle * rayonCercle;
	}
	public  void  afficher ( String nom ) {
	       System.out.println("Informations du cercle " + nom + " : ") ;
		   System.out.println("  - rayon  : " + rayonCercle) ;
		   System.out.println("  - perimetre : " + perimetre()) ;
		   System.out.println("  - surface   : " + surface());
	}	
}


