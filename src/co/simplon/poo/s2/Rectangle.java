package co.simplon.poo.s2;

public class Rectangle extends Figure{
	  
		public double largeur, hauteur;
		public double perimetre() {
		return 2*(largeur+hauteur);
		}
		public double surface(){
		return largeur*hauteur;
		}
		
}
	  
	  
