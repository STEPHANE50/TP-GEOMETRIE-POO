package co.simplon.poo.s2;

public class Rectangle extends Figure{
	
	

	private double longueurRectangle, largeurRectangle ;
	
	public Rectangle(double longueurRectangle, double largeurRectangle) {
		super();
		this.longueurRectangle = longueurRectangle;
		this.largeurRectangle = largeurRectangle;
	}
	
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

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void neFaitRien() {
		// TODO Auto-generated method stub
		
	}	
		
}
	  
	  
