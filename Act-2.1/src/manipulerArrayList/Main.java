package manipulerArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		Animaux animaux = new Animaux() ;
		
		List<String> listAnimaux = new ArrayList<String>() ;
		listAnimaux.add("Lion") ;
		listAnimaux.add("Tiger");
		listAnimaux.add("Cat") ;
		listAnimaux.add("Dog");
		
		listAnimaux.toString() ;
		animaux.setListAnimaux(listAnimaux);
		System.out.println(animaux.afficherAnimauxInitiale() );
		
		List<String> listAnimaux1 = new ArrayList<String>() ;
		listAnimaux1.add("Lion") ;
		listAnimaux1.add("Tiger") ;
		listAnimaux1.add("Elephant") ;
		listAnimaux1.add("Cat") ;
		listAnimaux1.add("Dog") ;
		
		animaux.setListAnimaux(listAnimaux1);		
		System.out.println(animaux.afficherAnimauxInitiale() );
		
		animaux.setListAnimauxConcat(listAnimaux1);
		animaux.concat(listAnimaux1);
		System.out.println(animaux.afficherAnimauxConcaténé());
		System.out.println(animaux.getListAnimauxConcat().size());
		
		
		animaux.setListAnimauxToDelete(animaux.getListAnimauxConcat());
		animaux.removeMeIndex(4);
		animaux.removeMeName("Tiger");
	}
		
}
