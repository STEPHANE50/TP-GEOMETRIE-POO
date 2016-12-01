package co.simplon.poo.s2;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Cube extends Figure {
	public Cube(double base, double hauteur) {
		super();
		this.base = base;
		this.hauteur = hauteur;
	}
	private double base;
	private double hauteur;
	
	@Override
	public double volume() {
		return base * hauteur;
		
	}
	
	@Override
	public double perimetre() {
		throw new NotImplementedException();
	}
	
	@Override
	public double surface() {
		throw new NotImplementedException();
	}
	@Override
	public void neFaitRien() {
		throw new NotImplementedException();
		
	}
	
	public  void  afficher ( String nom ) {
	       System.out.println("Informations du cube " + nom + " : ") ;
		   System.out.println("  - base  : " + base) ;
		   System.out.println("  - hauteur  : " + hauteur) ;
		   System.out.println("  - volume : " + volume()) ;

}
}

