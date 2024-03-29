package labTen;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {

	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	public testSelectionSort() {
	}

	private void testPositive() {
		int[] arr = new int[5];
		arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
<<<<<<< HEAD
        arr[4] = 1;
=======
        arr[4] = 2;
>>>>>>> mixDup

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 1;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] != Sortedarr[i]) {
        		sum++;
        	}
        }
        assertEquals(0, sum);


	}

	private void testNegative() {
		int[] arr = new int[5];
		arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] != Sortedarr[i]) {
        		sum++;
        	}
        }
        assertEquals(0, sum);
	}

	private void testMixed() {
		int[] arr = new int[5];
		arr[0] = 8;
        arr[1] = 9;
        arr[2] = 0;
        arr[3] = 10;
<<<<<<< HEAD
        arr[4] = -2;
=======
        arr[4] = -1;
>>>>>>> mixDup

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -1;
        Sortedarr[1] = 0;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] != Sortedarr[i]) {
        		sum++;
        	}
        }
        assertEquals(0, sum);

	}

	private void testDuplicates() {
		int[] arr = new int[5];
		arr[0] = 8;
        arr[1] = 10;
        arr[2] = -1;
        arr[3] = 10;
<<<<<<< HEAD
        arr[4] = -2;
=======
        arr[4] = -1;
>>>>>>> mixDup

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -1;
        Sortedarr[1] = -1;
        Sortedarr[2] = 8;
        Sortedarr[3] = 10;
        Sortedarr[4] = 10;

        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] != Sortedarr[i]) {
        		sum++;
        	}
        }
        assertEquals(0, sum);
	}

}
