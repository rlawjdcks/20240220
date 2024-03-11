package optional;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		String str = "hi";
		Optional<String> optionalStr = Optional.of(str);
		System.out.println(optionalStr);
		
		String nullStr = null;
		Optional<String> optionalNullStr = Optional.ofNullable(nullStr);
		System.out.println(optionalNullStr);
		
		Optional<String> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
	}

}
