import java.util.Arrays;

public class Testklasse {

	public static void main(String[] args) {

		int[] array = {3,7,10,1};
		int[] neu = SelectionSort.selectionSort(array);
		System.out.println(Arrays.toString(neu));
	}

}
