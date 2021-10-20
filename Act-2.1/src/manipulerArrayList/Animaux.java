package manipulerArrayList;

import java.util.ArrayList;
import java.util.List;

public class Animaux {

	private List<String> listAnimaux = new ArrayList<String>() ;
	private List<String> listAnimauxConcat = new ArrayList<String>() ;
	private List<String> listAnimauxToDelete = new ArrayList<String>() ;
	
	public void addAnimaux(String anim) {
		this.listAnimaux.add(anim) ;
	}
	
	public void afficherAnimaux(List<String> listAnimaux ) {
		for(String iterator : listAnimaux) {
			System.out.println(iterator);
		}
	}

	public  List<String> concat (List<String> listAnimaux2) {
		
		boolean added = false ;
		added = listAnimauxConcat.addAll(listAnimaux2) ;
		if (added==true) {	
			return listAnimauxConcat ;
		}
		return listAnimauxConcat ;
		
	}
	
	
	public Animaux() {
	}
	
	
	public void removeMeIndex(int index) {
		
		System.out.println("Suppression de l'élément en position : "+index);	
		String animal = this.listAnimauxToDelete.get(index-1) ;
		System.out.println("Suppression de l'élément : " +  animal);
		
		List<String> newToDelete  = listAnimauxToDelete;
		int animalNewIndex = listAnimauxToDelete.indexOf(animal) ;
		
		boolean proceed = true ;
		do {
			if (newToDelete.contains(animal)) {
				proceed = true  ;
				this.listAnimauxToDelete.remove(index-1) ;
				newToDelete  = listAnimauxToDelete.subList(index,listAnimauxToDelete.size()) ;
				animalNewIndex = newToDelete.indexOf(animal) ;
				index = index +animalNewIndex+1 ;}
			else {
					proceed=false ;
			}
			
		}
		while(proceed== true )  ;
		System.out.println("Nouveau tableau : " + listAnimauxToDelete.toString() );
		System.out.println("Taille du tableau :" +  listAnimauxToDelete.size());	
	}
	
	public void removeMeName(String animal) {
		

		System.out.println("Suppression de l'animal (nom): "+animal);
		int index = listAnimauxToDelete.indexOf(animal);
		List<String> newToDelete  = listAnimauxToDelete;
		int animalNewIndex = listAnimauxToDelete.indexOf(animal) ;
		boolean proceed = true ;
		do {
			if (newToDelete.contains(animal)) {
				proceed = true  ;
				this.listAnimauxToDelete.remove(index) ;
				newToDelete  = listAnimauxToDelete.subList(index,listAnimauxToDelete.size()) ;
				animalNewIndex = newToDelete.indexOf(animal) ;
				index = index +animalNewIndex+1 ;}
			else {
				proceed=false ;
			}
		}
		while(proceed== true )  ;
		System.out.println("Nouveau tableau : " + listAnimauxToDelete.toString() );
		System.out.println("Taille du tableau :" +  listAnimauxToDelete.size());	
	}



	public List<String> getListAnimaux() {
		return listAnimaux;
	}

	public void setListAnimaux(List<String> listAnimaux) {
		this.listAnimaux = listAnimaux;
	}

	
	
	public List<String> getListAnimauxConcat() {
		return listAnimauxConcat;
	}

	public void setListAnimauxConcat(List<String> listAnimauxConcat) {
		this.listAnimauxConcat = listAnimauxConcat;
	}




	
	
	public List<String> getListAnimauxToDelete() {
		return listAnimauxToDelete;
	}

	public void setListAnimauxToDelete(List<String> listAnimauxToDelete) {
		this.listAnimauxToDelete = listAnimauxToDelete;
	}

	public String afficherAnimauxAfterDeleted() {
		return listAnimauxToDelete.toString() ;
	}
	
	public String afficherAnimauxConcaténé() {
		return listAnimauxConcat.toString() ;
	}

	public String afficherAnimauxInitiale() {
		return listAnimaux.toString() ;
	}

		
}
