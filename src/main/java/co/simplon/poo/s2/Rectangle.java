package co.simplon.poo.s2;

public class Rectangle extends Figure{
	
	private double longueurRectangle, largeurRectangle ;
	
	@Override
	public double perimetre() {
		return 2 * ( longueurRectangle + largeurRectangle );
		
	}

	@Override
	public double surface() {
		return  longueurRectangle * largeurRectangle ;
	}
	  
	public  void  afficher ( String nom ) {
	       System.out.println("Informations du rectangle " + nom + " : ") ;
		   System.out.println("  - longueur  : " + longueurRectangle) ;
		   System.out.println("  - largeur   : " + largeurRectangle) ;
		   System.out.println("  - perimetre : " + perimetre()) ;
		   System.out.println("  - surface   : " + surface());
	}	
		
}
	  
	  
