import java.util.Scanner;

import DataStructure.MaxHeap;
import DataStructure.MinHeap;

public class PackageHeap
{
	private static Scanner sc;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Elements: ");

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		MinHeap m = new MinHeap();

		for (int i = 0; i < n; i++) {
			m.insert_min(a[i]);
		}
		m.display();														
        
		MaxHeap p = new MaxHeap();

		for (int i = 0; i < n; i++) {
			p.insert_max(a[i]);
		}
         p.display();
		for (int i = 0; i < n; i++) {
			a[i] = m.deleteheap_min();
		}
		
		for (int i = 0; i < n; i++) {
			a[i] = p.deleteheap_max();
		}
		
		System.out.println("Sorted Array(descending): ");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "  ");
		}

	}

}
