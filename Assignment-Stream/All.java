package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class All {

	public static void main(String[] args) {
		List<Fruit> fruitlist = Arrays.asList(
				new Fruit("mango",125,30,"yellow"),
				new Fruit("Banana",85,45,"yellow"),
				new Fruit("Apple",150,100,"red")
				);
		List<News> newslist = Arrays.asList(
				new News(001,"adam","james","nice"),
				new News(002,"Martin","Luthur","King"),
				new News(003,"chris","evans","---")
		
				);
		List<Trader> traderlist = Arrays.asList(
				new Trader("gyan","harayana"),
				new Trader("sandy","delhi"),
				new Trader("ami","karnataka")
				);
		List<Transiction> transictionlist=Arrays.asList(
				new Transiction(traderlist.get(0),2002,5000),
				new Transiction(traderlist.get(1),2008,10000),
				new Transiction(traderlist.get(2),2011,25000)
				);
		//7 th question
		long countofcommentByUser = newslist.stream()
				.count();
		System.out.println("countofcommentByUser = "+countofcommentByUser);
		
		// 1ST ANSWER
		 System.out.println("Stream 1st Question output");
         fruitlist.stream().filter(l -> l.calories<100).forEach(l -> System.out.println(l.name));
        
         //2nd answers
         System.out.println("\n"+"Stream 2nd Question output");
         fruitlist.stream().sorted(Comparator.comparing(l -> l.color)).forEach( l-> System.out.println(l));

        //4th answers
         System.out.println("\n"+"Stream 4th Question output");
         newslist.stream().collect(Collectors.groupingBy(l -> l.newsId, Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Map.Entry.comparingByValue())
	      .ifPresent(l-> System.out.println("News Id : "+ l.getKey() + " has the maxium comment i.e. :" + l.getValue()));
	//5 th answer
		
	System.out.println("\n"+"Stream 5th Question output");
	newslist.stream().filter(l-> l.comment.equalsIgnoreCase("Budget")).collect(Collectors.groupingBy(l -> l.comment, Collectors.counting()))
	    .entrySet().stream().max(Map.Entry.comparingByValue())
	    .ifPresent(l-> System.out.println( l.getKey() + " are arrived " + l.getValue() + " times")); 	
		
         
         //6th answers
         
         System.out.println("\n"+"Stream 6th Question output");
         newslist.stream().collect(Collectors.groupingBy(l->l.commentByUser, Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Map.Entry.comparingByValue())
	      .ifPresent(l-> System.out.println("User Id : "+ l.getKey() + " has did the maximum comment i.e. :" + l.getValue()));
		
         //8th answer
         System.out.println("\n"+"Stream 8th Question output");
         transictionlist.stream().filter(l -> l.year == 2011).sorted(Comparator.comparingInt(l-> l.value)).forEach(l -> System.out.println(l));
         
         
         
		// 9th answers
         System.out.println("\n"+"stream 9th Question output");
         traderlist.stream().map(l -> l.city).distinct().forEach(l->System.out.println(l));
         
         
         
		//10 th answer
         System.out.println("\n"+"Stream 10th Question output");
         traderlist.stream().filter(l -> l.city.equalsIgnoreCase("harayana")).sorted(Comparator.comparing(l -> l.name)).forEach(l -> System.out.println(l));
		
         
         //11th answer
         System.out.println("\n"+"Stream 11th Question output");
         traderlist.stream().sorted(Comparator.comparing(l->l.name)).forEach(l->System.out.print(l+"\t"));
         
        
	//12th answer
		
	System.out.println("\n"+"Stream 12th Question output");
	traderList.stream().filter(l -> l.city.equalsIgnoreCase("Indore")).forEach(System.out::println);
         
        //13th answers
         System.out.println("\n"+"Stream 13th Question output");
         transictionlist.stream().filter(l->l.trader.city.equalsIgnoreCase("delhi")).forEach(System.out::println);
         
         //14th answers
         System.out.println("\n"+"Stream 14th Question output");
         transictionlist.stream().max(Comparator.comparingInt(l-> l.value)).ifPresent(System.out::println);;
         
         
         //15th answers
         System.out.println("\n"+"Stream 15th Question output");
         transictionlist.stream().min(Comparator.comparingInt(l->l.value)).ifPresent(System.out::println);
         
         // 3rd answers
         System.out.println("\n"+"Stream 3rd Question output");
         fruitlist.stream().filter(l->l.color.equalsIgnoreCase("yellow")).sorted(Comparator.comparingInt(l ->l.price)).forEach(l->System.out.println(l));
         

	}

}
