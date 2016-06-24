import java.io.*;
import java.util.*;
public class Shopping{
	public static void main(String[] args){
		ShoppingService shoppingService = new ShoppingServiceImpl();
		Shopping shopping = new Shopping();
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
		System.out.println("There is all the information of Animals");
		shopping.printAll(cats,dogs);
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
				Scanner animalNoIn = new Scanner(System.in);
				Integer animalNo = animalNoIn.nextInt();
				shoppingService.printCatInfoByAnimalNo(cats,animalNo);
				shoppingService.printDogInfoByAnimalNo(dogs,animalNo);
				//}
			}else if (operation.equals("buy")){
				//执行购买功能
				System.out.println("Please enter catNo or dogNo");
				Scanner animalNoIn = new Scanner(System.in);
				Integer animalNo = animalNoIn.nextInt();
				cats = shoppingService.buyCat(cats,animalNo);
				dogs = shoppingService.buyDog(dogs,animalNo);
			}else if (operation.equals("add")){
				//执行添加商品功能
				Integer animalNo = shopping.intInInfo("animalNo");
				Integer animalNumber = shopping.intInInfo("animalNumber");
				String animalType = shopping.stringInInfo("animalType");
				String animalName = shopping.stringInInfo("animalName");
				String originPlace = shopping.stringInInfo("originPlace");
				String bloodTies = shopping.stringInInfo("bloodTies");
				List<String> animalImg = new ArrayList<String>();
				for (int i = 0;i < 3;i++){
					String img = shopping.stringInInfo("animalImg");
					animalImg.add(img);
				}
				//对于动物种类是狗的商品要额外做狗的种类的录入
				if (animalType.equals("Dog")){
					String dogType = shopping.stringInInfo("dogType");
					Integer meatNumber = shopping.intInInfo("meatNumber");
					dogs.add(shoppingService.enterDogInfo(animalNo,animalNumber,dogType,animalType,animalName,originPlace,bloodTies,animalImg,meatNumber));
				}else if (animalType.equals("Cat")){
					Integer fishNumber = shopping.intInInfo("fishNumber");
					cats.add(shoppingService.enterCatInfo(animalNo,animalNumber,animalType,animalName,originPlace,bloodTies,animalImg,fishNumber));
				}else {
					System.out.println("You should enter the right animalType");
				}
			}
			shopping.printAll(cats,dogs);
		}
		System.out.println("There is nothing in the shop!");
	}
	private Integer intInInfo(String systemInName){
		System.out.println("Please enter" + systemInName);
		try{
			Scanner InName = new Scanner(System.in);
			return InName.nextInt();
			}
		catch(InputMismatchException e){
			return 0 ;
		}
	}
	private String stringInInfo(String systemInName){
		System.out.println("Please enter" + systemInName);
		Scanner InNameIn = new Scanner(System.in);
		return InNameIn.nextLine();
	}
	private void printAll(List<Cat> cat,List<Dog> dog){
		ShoppingService shoppingService = new ShoppingServiceImpl();
		shoppingService.printCatInfo(cat);
		shoppingService.printDogInfo(dog);
	}
}