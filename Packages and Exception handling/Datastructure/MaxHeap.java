package DataStructure;

public class MaxHeap {
	int a[], hsize;

	public MaxHeap() {
		a = new int[56];
		hsize = 0;
	}

	void restoredown_max() {
		int i = 1;
		int temp = a[i], r = 2 * i + 1, l = 2 * i;
		while (r <= hsize) {

			if (temp >= a[l] && temp >= a[r]) {
				a[i] = temp;
				return;
			} else if (a[l] > a[r]) {
				a[i] = a[l];
				i = l;
			} else {
				a[i] = a[r];
				i = r;
			}

			r = 2 * i + 1;
			l = 2 * i;
		}

		if (temp < a[l] && l == hsize) {
			a[i] = a[l];
			i = l;
		}
		a[i] = temp;
	}

	void restoreup_max() {
		int i = hsize;
		int par = i / 2;
		int temp = a[i];

		while (par >= 1 && temp > a[par]) {
			a[i] = a[par];
			i = par;
			par = i / 2;
		}

		a[i] = temp;
	}

	public void insert_max(int n) {
		hsize++;
		a[hsize] = n;
		restoreup_max();
	}

	public int deleteheap_max() {
		int t = a[1];
		a[1] = a[hsize];
		(hsize)--;
		restoredown_max();
		return (t);
	}

	public void display() {

		System.out.print("HEAP:\n ");

		int t = 0, j, s = 21;

		int i;
		for (i = 1; i <= hsize; i++) {

			if (i == (int) Math.pow(2, t)) {
				System.out.print("  ");

				for (j = 0; j < s; j++)
					System.out.print("  ");
				t++;
				s = s - 3 * (3 - t);
			}

			System.out.print(a[i]);
			for (j = 0; j < 22 - 6 * t; j++)
				System.out.print("    ");
		}
		System.out.printf("  ");
		System.out.println(" ");
	}

}
