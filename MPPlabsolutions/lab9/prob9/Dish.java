package Homework.lab9.prob9;
import java.util.*;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    
  //find if Vegi available  using findFirst
    public static boolean vegeterianAvailable(List<Dish> menu) {
    	Optional<Dish> vegi=menu.stream().filter(e->e.isVegetarian()).findFirst();
    	return vegi.isPresent();
    }
    //find if there is healthy menu using anyMuch
    public static boolean healthyMenu(List<Dish> menu) {    	
    			return menu.stream().anyMatch(e->e.getCalories()<1000);
    			    	
    }  
    //find if there is unhealthy menu that has calories >1000 using nonmatch
    public static boolean unHealthyMenu(List<Dish> menu) {
    	//Optional<Dish>unHealthymenu=
    	return menu.stream().noneMatch(e->e.getCalories()<1000);
    	//return unHealthymenu.isPresent();
    }       
    
    //find the first item for the type meat
    public static Optional<Dish> firstMeatMenu(List<Dish> menu) {
    	return menu.stream().filter(e->e.type==Type.MEAT).findFirst();
    	
    }  
    //calculate total calories of all menu
    public static int totalCalories(List<Dish> menu) {    	 
    	return menu.stream().map(e->e.getCalories()).reduce(0,Integer::sum);    	
    }  
    //using method reference
    public static int totalCaloriesMethodReference(List<Dish> menu) {    	 
    	return menu.stream().map(Dish::getCalories).reduce(0,Integer::sum);    	
    } 
    
    
    public static void main(String [] args) {
    	//output if  vegeterian menu available
    	System.out.println(vegeterianAvailable(menu));
    	//healthy menu that has Calories < 1000 
    	System.out.println(healthyMenu(menu));
    	//unhealty menu clories > 1000
    	System.out.println(unHealthyMenu(menu));
    	//return first item for the type meat
    	firstMeatMenu(menu);
    	System.out.println(firstMeatMenu(menu).get());
    	//total calories of all menu
    	System.out.println(totalCalories(menu));
    	
    }
    
    
}