import java.util.*;
public abstract class Animal{
	private Integer animalIdNo;
	
	private String animalName;
	
	private String animalColor;

	private String originPlace;
	
	private String bloodTies;

	private List<String> animalImg = new ArrayList<String>();
	
	public Integer getAnimalNo(){
		return animalIdNo;
		}
	public void setAnimalIdNo(Integer animalIdNo){
		this.animalIdNo = animalIdNo;
		}
	public String getAnimalName(){
		return animalName;
		}
	public void setAnimalName(String animalName){
		this.animalName = animalName;
		}
	public String getAnimalColor(){
		return animalColor;
		}
	public void setAnimalColor(String animalColor){
		this.animalColor=animalColor;
		}
	public String getOriginPlace(){
		return originPlace;
		}
	public void setOriginPlace(String originPlace){
		this.originPlace = originPlace;
		}
	public String getBloodTies(){
		return bloodTies;
		}
	public void setBloodTies(String bloodTies){
		this.bloodTies = bloodTies;
		}
	public List<String> getAnimalImg(){
		return animalImg;
		}
	public void setAnimalImg(List<String> animalImg){
		this.animalImg = animalImg;
		}
	public String toString(){
		return "cat's no:" + this.animalIdNo + "cat's name:" + this.animalName + "cat's color:" + this.animalColor + "cat's originplace:" + this.originPlace + "cat's bloodties:" + this.bloodTies;
	}
	
	
	abstract void eat();
	
}