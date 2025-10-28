package h3;

public class H3_main {
	public static void main(String[] args) {
		int i, j, k;
		i = 200;
		j = 150;
		k = 100;
		k = -10;

		if (i > j) {
			if (i <= 200) {
				if (j <= 100) {
					k = 1;
				}
			}
			if (i > 200) {
				k = 2;
				if (j > 100) {
					k = 3;
				}
			}
		}
		if (i <= j) {
			if (i <= 200) {
				if (j <= 100) {
					k = 4;
				}
			}
		}
		System.out.print(k);
	}
}
