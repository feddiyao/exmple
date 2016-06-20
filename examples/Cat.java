import java.util.*;
public class Cat extends Animal{
	private Integer fishNumber;
	
	public Integer getFishNumber(){return fishNumber;}
	public void setFishNumber(Integer fishNumber){this.fishNumber=fishNumber;}
	public void eat(){
		if (this.fishNumber > 0){
			this.fishNumber--;	
		}
		else{
			System.out.println("There is no fish");
		}
	}
}