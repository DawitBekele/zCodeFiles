package Homework.lab9.prob8;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).

      List<Transaction> list=  transactions.stream().filter(e->e.getYear()==2011)
        .sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
        
        // Query 2: What are all the unique cities where the traders work?
     List<String> list2=transactions.stream().map(e->e.getTrader()).map(Trader::getCity)
    		 .distinct().collect(Collectors.toList());

        // Query 3: Find all traders from Cambridge and sort them by name.
        
      List<Trader> list3=   transactions.stream().map(e->e.getTrader()).filter(e->e.getCity()=="Cambridge")
           .sorted(Comparator.comparing(e->e.getName())).collect(Collectors.toList());
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        List<String> list4= transactions.stream().map(e->e.getTrader()).map(e->e.getName())
        		.distinct().sorted().collect(Collectors.toList());
        // Query 5: Are there any trader based in Milan?
              Optional<Trader> trader= transactions.stream().map(e->e.getTrader())
            		  .filter(e->e.getCity()=="Milan").findAny();    
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream().map(e->e.getTrader())
        .filter(e->e.getCity()=="Milan").forEach(e->e.setCity("Cambridge"));
        
        // Query 7: What's the highest value in all the transactions?
       Optional<Integer> largest=  transactions.stream().map(e->e.getValue()).max((x,y)->x-y);
//        System.out.println(list); 
//        System.out.println(list2); 
//        System.out.println(list3);
//        System.out.println(list4);
           trader.ifPresent(System.out::println);
           System.out.println(largest.get());  
          
    }
    
}
