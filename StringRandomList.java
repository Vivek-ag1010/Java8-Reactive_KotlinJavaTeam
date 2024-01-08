//	//Create a supplier that generates a list of 5 Strings

package javaFunctional;
import java.util.*;
import java.util.function.Supplier;

public class StringRandomList {

	public static void main(String[] args) {
		Supplier<List<String>> supRandString=()->getRandomStringList(5);
		List<String> randomStringList=supRandString.get();
		System.out.println(randomStringList);

	}
	public static List<String> getRandomStringList(int size)
	{
		List<String> randList=new ArrayList<>();
		Random r=new Random();
		for(int i=0;i<size;i++)
		{
			randList.add(randomStrings(r, 8));
		}
		return randList;
	}
	public static String randomStrings(Random r, int length)
	{
		String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<length;i++)
		{
			int rdIndex=r.nextInt(chars.length());
			char randChar=chars.charAt(rdIndex);
			sb.append(randChar);
		}
		return sb.toString();
	}

}
