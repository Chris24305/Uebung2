package h2;

public class H2_main {
	public static void main(String[] args) {
		int i, j, k, min, max;
		i = 1;
		j = 2;
		k = 3;
		min = 4;
		max = 5;
		if (i > j) {
			if (i > k) {
				// => max=i
				max = i;
				if (j < k) {
					// => min=j
					min = j;
				} else {
					// => min=k
					min = k;
					
				}
			} else {
				// => max=k und min=j
				max = k;
				min = j;
			}
		} else {
			if (j > k) {
				// => max=j
				max = j;
				if (i < k) {
					// => min=i
					min = i;
				} else {
					// => min=k
					min = k;
				}
			} else {
				// => max=k und min=i
				max = k;
				min = i;
			}
		}
		System.out.println("max:");
		System.out.print(max);
		System.out.println();
		System.out.println("min:");
		System.out.print(min);
	}
}
