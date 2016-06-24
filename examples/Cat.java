import java.util.*;
public class Cat extends Animal{
	private Fish fish;
	
	public Fish getFish(){return fish;}
	public void setFish(Fish fish){this.fish=fish;}
	public void eat(){
		System.out.println(this.fish.getAnimalName());
	}
	public String toString(){
		return super.toString() + '\n' + "cat's fish:" + this.fish.getAnimalName();
	}
}