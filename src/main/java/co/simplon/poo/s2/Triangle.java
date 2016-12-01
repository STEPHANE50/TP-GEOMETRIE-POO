package co.simplon.poo.s2;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public  class Triangle extends Figure {
	
	private double coteTriangleAB;
	private double coteTriangleBC;
	private double coteTriangeCD;

	@Override
	public double perimetre() {
		return coteTriangleAB + coteTriangleBC + coteTriangeCD;
	}

	@Override
	public double surface() {
		throw new NotImplementedException();
	}
	
	public  void  afficher ( String nom ) {
	       System.out.println("Informations du quadrilatere " + nom + " : ") ;
		   System.out.println("  - coteAB  : " + coteTriangleAB) ;
		   System.out.println("  - coteAB  : " + coteTriangleBC) ;
		   System.out.println("  - coteAB  : " + coteTriangeCD) ;
		   System.out.println("  - perimetre : " + perimetre()) ;
		   
	}	
}
