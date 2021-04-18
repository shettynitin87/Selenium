import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class javaStreamsCh15 {
	
	//@Test
	public void streamFilter()
	{
		ArrayList<String> requiredList = new ArrayList<String>();
		requiredList.add("Nitin");
		requiredList.add("Rakshitha");
		requiredList.add("Rachana");
		requiredList.add("Sarojini");
		
		//Convert the same to String and check the condition
		Long requiredCount = requiredList.stream().filter(s->s.startsWith("N")).count();
		System.out.println(requiredCount);
		
		//To print the names whose length is > 5
		requiredList.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		
		//To print only the first of the lot whose length is greater than 4
		requiredList.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
	}
	
	//@Test
	public void streamMap()
	{
		//Print names ending with 'a' in Upper Case
		Stream.of("Nitin","Rakshitha","Rachana","Sarojini").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Find names starting with 'A', then sort and print them
		List<String> requiredList = Arrays.asList("Nitin","Rakshitha","Rachana","Sarojini");
		
		requiredList.stream().filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	//@Test
	public void concatToLists()
	{
		ArrayList<String> requiredList = new ArrayList<String>();
		requiredList.add("Nitin");
		requiredList.add("Rakshitha");
		requiredList.add("Rachana");
		requiredList.add("Sarojini");
		
		List<String> requiredSecondList = Arrays.asList("Gangadhar","Shalini");
		
		Stream<String> finalStream = Stream.concat(requiredList.stream(), requiredSecondList.stream());
		
		finalStream.sorted().forEach(s->System.out.println(s));
				
	}
	
	//@Test
	public void searchAndReturnBoolean() 
	{
		ArrayList<String> requiredList = new ArrayList<String>();
		requiredList.add("Nitin");
		requiredList.add("Rakshitha");
		requiredList.add("Rachana");
		requiredList.add("Sarojini");
		
		List<String> requiredSecondList = Arrays.asList("Gangadhar","Shalini");
		
		Stream<String> finalStream = Stream.concat(requiredList.stream(), requiredSecondList.stream());
		
		Boolean returnFlag = finalStream.anyMatch(s->s.equalsIgnoreCase("nitin"));
		
		Assert.assertTrue(returnFlag);
	}
	
	@Test
	public void streamCollect()
	{
		List<Integer> values = Arrays.asList(6,6,8,4,2,2,7,3,9,0,3,3,1);
		
		List<Integer> newList = values.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(newList);
	}
}
