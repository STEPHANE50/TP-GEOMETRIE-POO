package co.simplon.poo.s2;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Quadrilatere extends Figure {

	//**Son périmètre est égal à la somme de la mesure de ses 4 côtés soit :AB + BD + DC + CA*/
	private double coteQuadrilatereAB;
	private double coteQuadrilatereBD;
	private double coteQuadrilatereDC;
	private double coteQuadrilatereCA;
	
	public Quadrilatere(double coteQuadrilatereAB, double coteQuadrilatereBD, double coteQuadrilatereDC,
			double coteQuadrilatereCA) {
		super();
		this.coteQuadrilatereAB = coteQuadrilatereAB;
		this.coteQuadrilatereBD = coteQuadrilatereBD;
		this.coteQuadrilatereDC = coteQuadrilatereDC;
		this.coteQuadrilatereCA = coteQuadrilatereCA;
	}
	
/*	public double getCoteQuadrilatereAB() {
		return coteQuadrilatereAB;
	}

	public void setCoteQuadrilatereAB(double coteQuadrilatereAB) {
		this.coteQuadrilatereAB = coteQuadrilatereAB;
	}
	public double getCoteQuadrilatereBC() {
		return coteQuadrilatereBD;
	}

	public void setCoteQuadrilatereBC(double coteQuadrilatereBC) {
		this.coteQuadrilatereBD = coteQuadrilatereBC;
	}

	public double getCoteQuadrilatereDC() {
		return coteQuadrilatereDC;
	}

	public void setCoteQuadrilatereDC(double coteQuadrilatereDC) {
		this.coteQuadrilatereDC = coteQuadrilatereDC;
	}

	public double getCoteQuadrilatereCA() {
		return coteQuadrilatereCA;
	}

	public void setCoteQuadrilatereCA(double coteQuadrilatereCA) {
		this.coteQuadrilatereCA = coteQuadrilatereCA;
	}

	
	
	@Override
	//**Son périmètre est égal à la somme de la mesure de ses 4 côtés soit :AB + BD + DC + CA*/
	public double perimetre() {
		return coteQuadrilatereAB + coteQuadrilatereBD + coteQuadrilatereCA + coteQuadrilatereDC ;
	}

	@Override
	public double surface() {
		throw new NotImplementedException();
	}

	public  void  afficher ( String nom ) {
	       System.out.println("Informations du quadrilatere " + nom + " : ") ;
		   System.out.println("  - coteAB  : " + coteQuadrilatereAB) ;
		   System.out.println("  - coteAB  : " + coteQuadrilatereBD) ;
		   System.out.println("  - coteAB  : " + coteQuadrilatereDC) ;
		   System.out.println("  - coteAB  : " + coteQuadrilatereCA) ;
		   System.out.println("  - perimetre : " + perimetre()) ;
		   
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
