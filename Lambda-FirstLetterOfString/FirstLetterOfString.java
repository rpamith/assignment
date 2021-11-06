package FirstLetterOfString;

import java.sql.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class FirstLetterOfString {

	public static void main(String[] args) {
		String[] str= {"Amith","Ajith","Raju","Rani","Niyaz","Sasi"};
		System.out.println(Arrays.stream(str)
				.filter(Objects::nonNull)
				.map(s ->s.charAt(0))
				.collect(Collectors.toList()));
	}

}
