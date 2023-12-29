package streams;
import java.util.*;
import java.util.stream.Collectors;

public class terminalOperationsEx1 {

	public static void main(String[] args) {
		
		//For Each
List<String> fruits=Arrays.asList("Hey", "Whats","Up?","Apple","Ball");
fruits.stream().forEach(System.out::println);

//to Array
String[] arr=fruits.stream().toArray(String[]::new);
for(String s:arr)
	System.out.println("TO Array: "+s);

//reduce
Optional<String> concatenated=fruits.stream().reduce((a, b)->a+" "+b);
System.out.println(concatenated);

//collect
List<String> collList=fruits.stream().collect(Collectors.toList());
System.out.println(collList);

//min and mAx
Optional<String> minElement=fruits.stream().min(Comparator.naturalOrder());
Optional<String> maxElem=fruits.stream().max(Comparator.naturalOrder());
System.out.println("Min: "+minElement+"  Max: "+maxElem);

//anyMatch, allMatch, noneMatch
boolean anyM=fruits.stream().anyMatch(s->s.startsWith("p"));
boolean anyM1=fruits.stream().anyMatch(s->s.startsWith("x"));

boolean allMatch=fruits.stream().allMatch(s->s.length()<2);
boolean allMatch2=fruits.stream().allMatch(s->s.length()>2);

boolean none1=fruits.stream().noneMatch(s->s.contains("a"));
boolean none2=fruits.stream().noneMatch(s->s.contains("m"));

System.out.println(anyM+" "+anyM1+" "+allMatch+" "+allMatch2+" "+none1+" "+none2);

//findAny and findFirst
Optional<String> anyElement = fruits.stream().findAny();
Optional<String> firstElement = fruits.stream().findFirst();

System.out.println(anyElement+" "+firstElement);

// forEachOrdered
fruits.stream().forEachOrdered(System.out::println);

//iterator
Iterator<String> iterator = fruits.stream().iterator();

	}

}
