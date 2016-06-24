import java.io.*;
import java.util.*;
public class Shopping{
	public static void main(String[] args){
		ShoppingService shoppingService = new ShoppingServiceImpl();
		List<Cat> cats = new ArrayList<Cat>();
		List<Dog> dogs = new ArrayList<Dog>();
		List<String> imgs = new ArrayList<String>();
		Fish aFish = new Fish();
		Meat aMeat = new Meat();
		imgs.add("lalala");
		imgs.add("mmmmmm");
		//输入Meat,Fish数据
		aMeat = shoppingService.enterMeatInfo(1,"pork","big");
		aFish = shoppingService.enterFishInfo(1,"huanyu","yellow","UK","Thoroughbred",imgs,"big","vegan");
		//输入部分shopping home数据
		cats.add(shoppingService.enterCatInfo(1,"zher","yellow","UK","Thoroughbred",imgs,aFish));
		cats.add(shoppingService.enterCatInfo(2,"buou","yellow","American","Thoroughbred",imgs,aFish));
		cats.add(shoppingService.enterCatInfo(3,"jiafei","red","China","UnThoroughbred",imgs,aFish));
		dogs.add(shoppingService.enterDogInfo(4,"xunhui","jinmao","yellow","China","Thoroughbred",imgs,aMeat));
		dogs.add(shoppingService.enterDogInfo(5,"muyang","demu","black","Geman","Thoroughbred",imgs,aMeat));
		//shopping home展示
		System.out.println("welcome to our animal home");
		System.out.println("There is all the information of Animals");
		printAll(cats,dogs);
		while(!cats.isEmpty() || !dogs.isEmpty()){
			//shopping home提供search，buy和add三项功能
			System.out.println("Please enter search , buy , add");
			Scanner sc = new Scanner(System.in);
			String operation = sc.nextLine();
			//执行查找功能
			if (operation.equals("search")){
				//System.out.println("Please enter type (cat or dog)");
				//if (System.in.equals("cat")){
				System.out.println("Please enter catNo or dogNo");
				Scanner animalIdNoIn = new Scanner(System.in);
				Integer animalIdNo = animalIdNoIn.nextInt();
				shoppingService.printCatInfoByAnimalNo(cats,animalIdNo);
				shoppingService.printDogInfoByAnimalNo(dogs,animalIdNo);
				//}
			}else if (operation.equals("buy")){
				//执行购买功能
				System.out.println("Please enter catNo or dogNo");
				Scanner animalIdNoIn = new Scanner(System.in);
				Integer animalIdNo = animalIdNoIn.nextInt();
				cats = shoppingService.buyCat(cats,animalIdNo);
				dogs = shoppingService.buyDog(dogs,animalIdNo);
			}else if (operation.equals("add")){
				//执行添加商品功能
				String animalType = stringInInfo("animalType");
				Integer animalIdNo = intInInfo("animalIdNo");
				String animalName = stringInInfo("animalName");
				String animalColor = stringInInfo("animalColor");
				String originPlace = stringInInfo("originPlace");
				String bloodTies = stringInInfo("bloodTies");
				List<String> animalImg = new ArrayList<String>();
				for (int i = 0;i < 3;i++){
					String img = stringInInfo("animalImg");
					animalImg.add(img);
				}
				//对于动物种类是狗的商品要额外做狗的种类的录入
				if (animalType.equals("Dog")){
					String dogType = stringInInfo("dogType");
					dogs.add(shoppingService.enterDogInfo(animalIdNo,dogType,animalName,animalColor,originPlace,bloodTies,animalImg,aMeat));
				}else if (animalType.equals("Cat")){
					cats.add(shoppingService.enterCatInfo(animalIdNo,animalName,animalColor,originPlace,bloodTies,animalImg,aFish));
				}else {
					System.out.println("You should enter the right animalType");
				}
			}
			printAll(cats,dogs);
		}
		System.out.println("There is nothing in the shop!");
	}
	private static Integer intInInfo(String systemInName){
		System.out.println("Please enter" + systemInName);
		try{
			Scanner InName = new Scanner(System.in);
			return InName.nextInt();
			}
		catch(InputMismatchException e){
			return 0 ;
		}
	}
	private static String stringInInfo(String systemInName){
		System.out.println("Please enter" + systemInName);
		Scanner InNameIn = new Scanner(System.in);
		return InNameIn.nextLine();
	}
	private static void printAll(List<Cat> cat,List<Dog> dog){
		ShoppingService shoppingService = new ShoppingServiceImpl();
		shoppingService.printCatInfo(cat);
		shoppingService.printDogInfo(dog);
	}
}