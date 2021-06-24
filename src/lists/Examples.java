package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Examples {
	public static void main(String[] args) {
		List<String> colours = new ArrayList<>();
		colours.add("white");
		colours.add("blue");
		colours.add("black");
		colours.add("red");
		colours.add("green");
		System.out.println(colours);
		for (int i=0; i < colours.size(); i++) {
			System.out.println(colours.get(i));
		}
		for (String i : colours) {
			System.out.println(i);
		}
		System.out.println(colours.get(4));
		colours.set(0, "biege");
		colours.remove(1);
		Collections.sort(colours);
		System.out.println(colours);
		Collections.sort(colours,Collections.reverseOrder());
		System.out.println(colours);
		Collections.reverse(colours);
		System.out.println(colours);
		Collections.swap(colours, 2, 0);
		System.out.println(colours);

	}

}
