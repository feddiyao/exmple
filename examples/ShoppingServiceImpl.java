import java.io.*;
import java.util.*;
public class ShoppingServiceImpl implements ShoppingService{
	public Cat enterCatInfo(Integer animalIdNo,String animalName,String animalColor,String originPlace,String bloodTies,List<String> animalImg,Fish fish){
		Cat Acat = new Cat();
		Acat.setAnimalIdNo(animalIdNo);
		Acat.setAnimalName(animalName);
		Acat.setAnimalColor(animalColor);
		Acat.setOriginPlace(originPlace);
		Acat.setBloodTies(bloodTies);
		Acat.setAnimalImg(animalImg);
		Acat.setFish(fish);
		return Acat;
	}
	public Dog enterDogInfo(Integer animalIdNo,String dogType,String animalName,String animalColor,String originPlace,String bloodTies,List<String> animalImg,Meat meat){
		Dog Adog = new Dog();
		Adog.setAnimalIdNo(animalIdNo);
		Adog.setAnimalName(animalName);
		Adog.setAnimalColor(animalColor);
		Adog.setDogType(dogType);
		Adog.setOriginPlace(originPlace);
		Adog.setBloodTies(bloodTies);
		Adog.setAnimalImg(animalImg);
		Adog.setMeat(meat);
		return Adog;
    }
	public void printCatInfo(List<Cat> cat){
		for (Cat Acat : cat){
			System.out.println("welcome to our animal home");
			if (Acat != null){
			System.out.println("==================");
			System.out.println("cat's no:" + Acat.getAnimalIdNo());
			System.out.println("cat's name:" + Acat.getAnimalName());
			}
		}
	}
	public void printDogInfo(List<Dog> dog){
		for (Dog Adog : dog){
			if (Adog != null){
			System.out.println("==================");
			System.out.println("dog's no:" + Adog.getAnimalIdNo());
			System.out.println("dog's name:" + Adog.getAnimalName());
			}
		}
	}
	
	public void printCatInfoByAnimalNo(List<Cat> cat,Integer animalIdNo){
		for (Cat Acat : cat){
			if (Acat != null && Acat.getAnimalIdNo().equals(animalIdNo)){
				System.out.println(Acat.toString());
				if (Acat.getAnimalImg() != null){
					for (String Image : Acat.getAnimalImg()){
						System.out.println("cat's Img:" + Image);
					}
				}
			}
		}
	}
	public void printDogInfoByAnimalNo(List<Dog> dog,Integer animalIdNo){
		for (Dog Adog : dog){
			if (Adog != null && Adog.getAnimalIdNo().equals(animalIdNo)){
				System.out.println("dog's no:" + Adog.getAnimalIdNo());
				System.out.println("dog's name:" + Adog.getAnimalName());
				System.out.println("dog's originplace:" + Adog.getOriginPlace());
				System.out.println("dog's bloodties:" + Adog.getBloodTies());
				System.out.println("dog's type:" + Adog.getDogType());
				System.out.println("dog's meat:" + Adog.getMeat());
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
					System.out.println("dog's meat:" + Adog.getMeat());
				}
			}
		}
	}
	public List<Cat> buyCat(List<Cat> cat,Integer animalIdNo){
		List<Cat> cats = new ArrayList<Cat>();
		for (Cat Acat : cat){
			if (Acat != null && Acat.getAnimalIdNo().equals(animalIdNo)){
			System.out.println("success!");
			}else{
				cats.add(Acat);
			}	
		}
		return cats;
	}
	public List<Dog> buyDog(List<Dog> dog,Integer animalNo){
		List<Dog> dogs = new ArrayList<Dog>();
		for (Dog Adog : dog){
			if (Adog != null && Adog.getAnimalIdNo().equals(animalNo)){
			System.out.println("success!");
			}else{
				dogs.add(Adog);
			}	
		}
		return dogs;
	}
}