import java.util.*;
public class Dog extends Animal{
	private String dogType;
	private Meat meat;
	
	public String getDogType(){return dogType;}
	public void setDogType(String dogType){this.dogType = dogType;}
	public Meat getMeat(){return meat;}
	public void setMeat(Meat meat){this.meat = meat;}
	public void eat(){
		System.out.println(this.meat.getMeatType());
	}
}