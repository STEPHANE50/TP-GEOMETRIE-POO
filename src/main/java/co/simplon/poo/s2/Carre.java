package co.simplon.poo.s2;

public class Carre extends Figure {
		
		protected Losange data = new Losange();

		public Carre(double longueurCarre) {
			super();
			this.data.longueurLosange = longueurCarre;
		}

	

	@Override
	public double perimetre() {
		return 2 * ( data.longueurLosange + data.longueurLosange );
		
	}

	
	@Override
	public double surface() {
		return  data.longueurLosange * data.longueurLosange ;
		
	}
	public  void  afficher ( String nom ) {
	       System.out.println("Informations du carre " + nom + " : ") ;
		   System.out.println("  - longueur  : " + data.longueurLosange) ;
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
