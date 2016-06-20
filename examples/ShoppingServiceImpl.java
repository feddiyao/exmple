import java.io.*;
import java.util.*;
public class ShoppingServiceImpl implements ShoppingService{
	public Cat enterCatInfo(Integer animalNo,Integer animalNumber,String animalType,String animalName,String originPlace,String bloodTies,List<String> animalImg,Integer fishNumber){
		Cat Acat = new Cat();
		Acat.setAnimalNo(animalNo);
		Acat.setAnimalName(animalName);
		Acat.setAnimalType(animalType);
		Acat.setAnimalNumber(animalNumber);
		Acat.setOriginPlace(originPlace);
		Acat.setBloodTies(bloodTies);
		Acat.setAnimalImg(animalImg);
		Acat.setFishNumber(fishNumber);
		return Acat;
	}
	public Dog enterDogInfo(Integer animalNo,Integer animalNumber,String dogType,String animalType,String animalName,String originPlace,String bloodTies,List<String> animalImg,Integer meatNumber){
		Dog Adog = new Dog();
		Adog.setAnimalNo(animalNo);
		Adog.setAnimalName(animalName);
		Adog.setAnimalType(animalType);
		Adog.setAnimalNumber(animalNumber);
		Adog.setDogType(dogType);
		Adog.setOriginPlace(originPlace);
		Adog.setBloodTies(bloodTies);
		Adog.setAnimalImg(animalImg);
		Adog.setMeatNumber(meatNumber);
		return Adog;
    }
	public void printCatInfo(List<Cat> cat){
		for (Cat Acat : cat){
			System.out.println("welcome to our animal home");
			if (Acat != null){
			System.out.println("==================");
			System.out.println("cat's no:" + Acat.getAnimalNo());
			System.out.println("cat's name:" + Acat.getAnimalName());
			System.out.println("cat's number:" + Acat.getAnimalNumber());
			}
		}
	}
	public void printDogInfo(List<Dog> dog){
		for (Dog Adog : dog){
			if (Adog != null){
			System.out.println("==================");
			System.out.println("dog's no:" + Adog.getAnimalNo());
			System.out.println("dog's name:" + Adog.getAnimalName());
			System.out.println("dog's number:" + Adog.getAnimalNumber());
			}
		}
	}
	
	public void printCatInfoByAnimalNo(List<Cat> cat,Integer animalNo){
		for (Cat Acat : cat){
			if (Acat != null && Acat.getAnimalNo().equals(animalNo)){
				System.out.println("cat's no:" + Acat.getAnimalNo());
				System.out.println("cat's name:" + Acat.getAnimalName());
				System.out.println("cat's number:" + Acat.getAnimalNumber());
				System.out.println("cat's originplace:" + Acat.getOriginPlace());
				System.out.println("cat's bloodties:" + Acat.getBloodTies());
				System.out.println("cat's fish:" + Acat.getFishNumber());
				if (Acat.getAnimalImg() != null){
					for (String Image : Acat.getAnimalImg()){
						System.out.println("cat's Img:" + Image);
					}
				}
				System.out.println("Do you want to see this cat eat fish?");
				Scanner answerIn= new Scanner(System.in);
				String answer = answerIn.nextLine();
				if (answer.equals("yes")){
					Acat.eat();
					System.out.println("cat's fish:" + Acat.getFishNumber());
				}
			}
		}
	}
	public void printDogInfoByAnimalNo(List<Dog> dog,Integer animalNo){
		for (Dog Adog : dog){
			if (Adog != null && Adog.getAnimalNo().equals(animalNo)){
				System.out.println("dog's no:" + Adog.getAnimalNo());
				System.out.println("dog's number:" + Adog.getAnimalNumber());
				System.out.println("dog's name:" + Adog.getAnimalName());
				System.out.println("dog's originplace:" + Adog.getOriginPlace());
				System.out.println("dog's bloodties:" + Adog.getBloodTies());
				System.out.println("dog's type:" + Adog.getDogType());
				System.out.println("dog's meat:" + Adog.getMeatNumber());
				if (Adog.getAnimalImg() != null){
					for (String Image : Adog.getAnimalImg()){
						System.out.println("dog's Img:" + Image);
					}
				}
				System.out.println("Do you want to see this dog eat meat?");
				Scanner answerIn= new Scanner(System.in);
				String answer = answerIn.nextLine();
				if (answer.equals("yes")){
					Adog.eat();
					System.out.println("dog's meat:" + Adog.getMeatNumber());
				}
			}
		}
	}
	public List<Cat> buyCat(List<Cat> cat,Integer animalNo){
		List<Cat> cats = new ArrayList<Cat>();
		for (Cat Acat : cat){
			if (Acat != null && Acat.getAnimalNo().equals(animalNo)){
			Integer animalNumber = Acat.getAnimalNumber();
			Acat.setAnimalNumber(--animalNumber);
			System.out.println("success!");
			}
			if (Acat.getAnimalNumber() != 0){
				cats.add(Acat);
			}	
		}
		return cats;
	}
	public List<Dog> buyDog(List<Dog> dog,Integer animalNo){
		List<Dog> dogs = new ArrayList<Dog>();
		for (Dog Adog : dog){
			if (Adog != null && Adog.getAnimalNo().equals(animalNo)){
			Integer animalNumber = Adog.getAnimalNumber();
			Adog.setAnimalNumber(--animalNumber);
			System.out.println("success!");
			}
			if (Adog.getAnimalNumber() != 0){
				dogs.add(Adog);
			}	
		}
		return dogs;
	}
}