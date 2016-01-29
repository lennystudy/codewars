package herdingcats;

import java.util.Arrays;

public class CatMain {
	public static void main(String[] args) {
		Cat cat1 = new Cat("tony", 15);
		Cat cat2 = new Cat("lenny", 30);
		Cat temp = null;
		System.out.println(cat1.name);
		System.out.println(cat2.name);
		if(cat1.weight < cat2.weight){
			temp = cat1;
			cat1 = cat2;
			cat2 = temp;
		}
		System.out.println(cat1.name+cat1.weight);
		System.out.println(cat2.name+cat2.weight);
	}
	

}
