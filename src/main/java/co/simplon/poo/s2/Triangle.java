package co.simplon.poo.s2;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public  class Triangle extends Figure {
		
	private double coteTriangleAB;
	private double coteTriangleBC;
	private double coteTriangeCD;

	public Triangle(double coteTriangleAB, double coteTriangleBC, double coteTriangeCD) {
		super();
		this.coteTriangleAB = coteTriangleAB;
		this.coteTriangleBC = coteTriangleBC;
		this.coteTriangeCD = coteTriangeCD;
	}
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
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}	
}
