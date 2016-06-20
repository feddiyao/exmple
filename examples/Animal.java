import java.util.*;
abstract class Animal{
	private Integer animalIdNo;
	
	private String animalName;

	private String originPlace;
	
	private String bloodTies;

	private List<String> animalImg = new ArrayList<String>();
	
	public Integer getAnimalNo(){return animalIdNo;}
	public void setAnimalIdNo(Integer animalIdNo){this.animalIdNo = animalIdNo;}
	public String getAnimalName(){return animalName;}
	public void setAnimalName(String animalName){this.animalName = animalName;}
	public String getOriginPlace(){return originPlace;}
	public void setOriginPlace(String originPlace){this.originPlace = originPlace;}
	public String getBloodTies(){return bloodTies;}
	public void setBloodTies(String bloodTies){this.bloodTies = bloodTies;}
	public List<String> getAnimalImg(){return animalImg;}
	public void setAnimalImg(List<String> animalImg){this.animalImg = animalImg;}
	
	abstract void eat();
}