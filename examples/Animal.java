import java.util.*;
abstract class Animal{
	private Integer animalNo;
	
	private String animalNumber;
	
	private String animalType;
	
	private String animalName;

	private String originPlace;
	
	private String bloodTies;

	private List<String> animalImg = new ArrayList<String>();
	
	public Integer getAnimalNo(){return animalNo;}
	public void setAnimalNo(Integer animalNo){this.animalNo = animalNo;}
	public Integer getAnimalNumber(){return animalNumber;}
	public void setAnimalIdNumber(Integer animalNumber){this.animalNumber = animalNumber;}
	public Integer getAnimalType(){return animalType;}
	public void setAnimalIdType(Integer animalType){this.animalType = animalType;}
	public String getAnimalName(){return animalName;}
	public void setAnimalName(String animalName){this.animalName = animalName;}
	public String getOriginPlace(){return originPlace;}
	public void setOriginPlace(String originPlace){this.originPlace = originPlace;}
	public String getBloodTies(){return bloodTies;}
	public void setBloodTies(String bloodTies){this.bloodTies = bloodTies;}
	public List<String> getAnimalImg(){return animalImg;}
	public void setAnimalImg(List<String> animalImg){this.animalImg = animalImg;}
	
	public void eat(){};
}