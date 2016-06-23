import java.util.*;
public interface ShoppingService{
	void printCatInfo(List<Cat> cat);
	void printDogInfo(List<Dog> dog);
	void printCatInfoByAnimalNo(List<Cat> cat,Integer animalNo);
	void printDogInfoByAnimalNo(List<Dog> dog,Integer animalNo);
	List<Cat> buyCat(List<Cat> cat,Integer animalNo);
	List<Dog> buyDog(List<Dog> dog,Integer animalNo);
	Cat enterCatInfo(Integer animalIdNo,String animalName,String animalColor,String originPlace,String bloodTies,List<String> animalImg,Fish fish);
	Dog enterDogInfo(Integer animalIdNo,String dogType,String animalName,String animalColor,String originPlace,String bloodTies,List<String> animalImg,Meat meat);
}