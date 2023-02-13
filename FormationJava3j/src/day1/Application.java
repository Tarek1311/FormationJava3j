package day1;

public class Application {

	public static void main(String[] args) {
		//System.out.println("Hello Java");
		
		// 1) Cr�ation d'une instance
		
		Animal a1 = new Animal(); // appel au contructeur par d�faut
		
		Animal a2 = new Animal(); // appel au contructeur par d�faut
		
		System.out.println(a1.nom);  //null
		System.out.println(a1.age);  // 0
        
		Animal a3 = new Animal("Rex", 3);
		System.out.println("Nom : " + a3.nom);
		System.out.println("Age : " + a3.age);
	}

}