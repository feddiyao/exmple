import java.io.*;
import java.util.*;
public class ShoppingServiceImpl implements ShoppingService{
	public Cat enterCatInfo(Integer animalIdNo,String animalName,String animalColor,String originPlace,String bloodTies,List<String> animalImg,Fish fish){
		Cat aCat = new Cat();
		aCat.setAnimalIdNo(animalIdNo);
		aCat.setAnimalName(animalName);
		aCat.setAnimalColor(animalColor);
		aCat.setOriginPlace(originPlace);
		aCat.setBloodTies(bloodTies);
		aCat.setAnimalImg(animalImg);
		aCat.setFish(fish);
		return aCat;
	}
	public Dog enterDogInfo(Integer animalIdNo,String dogType,String animalName,String animalColor,String originPlace,String bloodTies,List<String> animalImg,Meat meat){
		Dog aDog = new Dog();
		aDog.setAnimalIdNo(animalIdNo);
		aDog.setAnimalName(animalName);
		aDog.setAnimalColor(animalColor);
		aDog.setDogType(dogType);
		aDog.setOriginPlace(originPlace);
		aDog.setBloodTies(bloodTies);
		aDog.setAnimalImg(animalImg);
		aDog.setMeat(meat);
		return aDog;
    }
	public void printCatInfo(List<Cat> cat){
		for (Cat aCat : cat){
			System.out.println("welcome to our animal home");
			if (aCat != null){
			System.out.println("==================");
			System.out.println("cat's no:" + aCat.getAnimalIdNo());
			System.out.println("cat's name:" + aCat.getAnimalName());
			}
		}
	}
	public void printDogInfo(List<Dog> dog){
		for (Dog aDog : dog){
			if (aDog != null){
			System.out.println("==================");
			System.out.println("dog's no:" + aDog.getAnimalIdNo());
			System.out.println("dog's name:" + aDog.getAnimalName());
			}
		}
	}
	
	public void printCatInfoByAnimalNo(List<Cat> cat,Integer animalIdNo){
		for (Cat aCat : cat){
			if (aCat != null && aCat.getAnimalIdNo().equals(animalIdNo)){
				System.out.println(aCat.toString());
				if (aCat.getAnimalImg() != null){
					for (String Image : aCat.getAnimalImg()){
						System.out.println("cat's Img:" + Image);
					}
				}
				System.out.println("Do you want to see this cat eat fish?");
				Scanner answerIn= new Scanner(System.in);
				String answer = answerIn.nextLine();
				if (answer.equals("yes")){
					aCat.eat();
				}
			}
		}
	}
	public void printDogInfoByAnimalNo(List<Dog> dog,Integer animalIdNo){
		for (Dog aDog : dog){
			if (aDog != null && aDog.getAnimalIdNo().equals(animalIdNo)){
				System.out.println(aDog.toString());
				if (aDog.getAnimalImg() != null){
					for (String Image : aDog.getAnimalImg()){
						System.out.println("dog's Img:" + Image);
					}
				}
				System.out.println("Do you want to see this dog eat meat?");
				Scanner answerIn= new Scanner(System.in);
				String answer = answerIn.nextLine();
				if (answer.equals("yes")){
					aDog.eat();
				}
			}
		}
	}
	public List<Cat> buyCat(List<Cat> cat,Integer animalIdNo){
		List<Cat> cats = new ArrayList<Cat>();
		for (Cat aCat : cat){
			if (aCat != null && aCat.getAnimalIdNo().equals(animalIdNo)){
			System.out.println("success!");
			}else{
				cats.add(aCat);
			}	
		}
		return cats;
	}
	public List<Dog> buyDog(List<Dog> dog,Integer animalNo){
		List<Dog> dogs = new ArrayList<Dog>();
		for (Dog aDog : dog){
			if (aDog != null && aDog.getAnimalIdNo().equals(animalNo)){
			System.out.println("success!");
			}else{
				dogs.add(aDog);
			}	
		}
		return dogs;
	}
	public Meat enterMeatInfo(Integer meatId,String meatType,String meatSize){
		Meat aMeat = new Meat();
		aMeat.setMeatId(meatId);
		aMeat.setMeatType(meatType);
		aMeat.setMeatSize(meatSize);
		return aMeat;
	}
	public Fish enterFishInfo(Integer animalIdNo,String animalName,String animalColor,String originPlace,String bloodTies,List<String> animalImg,String fishSize,String fishHabit){
		Fish aFish = new Fish();
		aFish.setAnimalIdNo(animalIdNo);
		aFish.setAnimalName(animalName);
		aFish.setAnimalColor(animalColor);
		aFish.setOriginPlace(originPlace);
		aFish.setBloodTies(bloodTies);
		aFish.setAnimalImg(animalImg);
		aFish.setFishSize(fishSize);
		aFish.setFishHabit(fishHabit);
		return aFish;
	}
}