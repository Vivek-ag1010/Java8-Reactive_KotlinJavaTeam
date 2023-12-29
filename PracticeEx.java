package streams;

import java.util.*;
import java.util.stream.*;

public class PracticeEx {

	public static void main(String[] args) {
		List<Integer> list = List.of(10, 20, 30, 40, 50);
		int sum = list.stream().reduce(0, Integer::sum);

		double avg = (double) sum / list.size();
		System.out.println(avg);
	}

}
