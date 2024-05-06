import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
public class q1 {
//		q1
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,8,0,2,7,13,8);
		num.forEach(n -> System.out.print(n+" "));
		System.out.println();
		System.out.println();
//		q2
		int sum=num.stream().reduce(0, (a,b)-> a+b);
		System.out.println(sum);
		System.out.println();
		
//		q3
		Collections.sort(num,(a,b)-> a-b);
		
//		System.out.println(num);
		int max=num.get(num.size()-1);
		System.out.println(max);
		System.out.println();
	
//		q4
		List<String> words=Arrays.asList("pan","man","ban","banana","base","basil");
		List<String> str=words.stream().filter(s->s.startsWith("ba")).collect(Collectors.toList());
		System.out.println(str);
		System.out.println();
		
//		q5
		Collections.sort(words);
		System.out.println(words);
		System.out.println();
		
//		q6
		
	}
}
