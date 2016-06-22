import java.util.*;
public class Fish extends Animal{
	private String fishSize;
	private String fishHabit;
	
	public String getFishSize(){
		return fishSize;
	}
	public void setFishSize(String fishSize){
		this.fishSize = fishSize;
	}
	public String getFishHabit(){
		return fishHabit;
	}
	public void setFishHabit(String fishHabit){
		this.fishHabit = fishHabit;
	}
	public void eat(){
		System.out.println("There is an insect being eat");
	}
}