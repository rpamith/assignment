package ThreadConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ThreadConsumerInterface {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,8,7,6,5,4,3,2,1);
		Consumer<List<Integer>>displist = (list1)->System.out.println(list1);
		Thread newthread = new Thread(() -> displist.accept(list));
		newthread.start();

	}

}
