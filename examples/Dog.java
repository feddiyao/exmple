import java.util.*;
public class Dog extends Animal{
	private String dogType;
	private Integer meatNumber;
	
	public String getDogType(){return dogType;}
	public void setDogType(String dogType){this.dogType = dogType;}
	public Integer getMeatNumber(){return meatNumber;}
	public void setMeatNumber(Integer meatNumber){this.meatNumber = meatNumber;}
	public void eat(){
		if(this.meatNumber > 0){
			this.meatNumber--;
		}
		else{
			System.out.println("There is no meat");
		}
	}
}