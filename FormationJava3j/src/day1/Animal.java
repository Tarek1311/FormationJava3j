package day1;

public class Animal {
	// 1)Attributs d'instance (propri�t�s ou caract�ristiques)
	String nom;
	int age;
	
	// 2)Les contructeurs
	
	public Animal()  // le constructeur par d�faut(sans param�tres)
	{
		System.out.println("Construction d'un Animal");
	}
	
	public Animal(String nom, int age)
	{
		System.out.println("Construction d'un Animal avec deux param�ters");
		this.nom = nom;
		this.age = age;
	}

}