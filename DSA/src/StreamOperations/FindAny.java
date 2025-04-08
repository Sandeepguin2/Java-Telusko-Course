  package StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words=Arrays.asList("Apple","banana","cherry");
		Optional<String> result=words.stream()
				.filter(word->word.startsWith("b"))
				.findAny();
		System.out.println(result);

	}

}
