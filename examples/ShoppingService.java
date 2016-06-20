import java.util.*;
public interface ShoppingService{
	void printCatInfo(List<Cat> cat);
	void printDogInfo(List<Dog> dog);
	void printCatInfoByAnimalNo(List<Cat> cat,Integer animalNo);
	void printDogInfoByAnimalNo(List<Dog> dog,Integer animalNo);
	List<Cat> buyCat(List<Cat> cat,Integer animalNo);
	List<Dog> buyDog(List<Dog> dog,Integer animalNo);
	Cat enterCatInfo(Integer animalNo,Integer animalNunber,String animalType,String animalName,String originPlace,String bloodTies,List<String> animalImg,Integer fishNumber);
	Dog enterDogInfo(Integer animalNo,Integer animalNumber,String dogType,String animalType,String animalName,String originPlace,String bloodTies,List<String> animalImg,Integer meatNumber);
}