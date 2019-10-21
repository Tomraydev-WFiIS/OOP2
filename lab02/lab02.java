import java.util.Scanner;

public class lab02 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int len_a = in.nextInt();
		int len_b = in.nextInt();
		System.out.println(len_a+"+"+len_b+"="+(len_a+len_b));

		int[] a = new int[len_a];
		int[] b = new int[len_b];

		int ones_a = 0;
		int ones_b = 0;
		int zeroes_a = 0;
		int zeroes_b = 0;

		// Count numbers in first array
		boolean one_reached = false;
		for(int i = 0; i < len_a; i++){
			a[i] = in.nextInt();
			if(a[i] == 1){
				ones_a++;
				one_reached = true;
			}
			if(a[i] == 0 && !one_reached){
				zeroes_a++;
			}
			System.out.print(a[i] + " ");
		}
		System.out.println("\n\n");

		// Count numbers in second array
		one_reached = false;
		for(int i = 0; i < len_b; i++){
			b[i] = in.nextInt();
			if(b[i] == 1){
				ones_b++;
				one_reached = true;
			}
			if(b[i] == 0 && !one_reached){
				zeroes_b++;
			}
			System.out.print(b[i] + " ");
		}

		System.out.print("\n\n");
		System.out.println("ones_a = " + ones_a + "\tones_b = " + ones_b);
		System.out.println("zeroes_a = " + zeroes_a + "\tzeroes_b = " + ones_b);

		// Create the resulting array
		int zeroes_c = (zeroes_a < zeroes_b)? zeroes_a : zeroes_b;
		int ones_c = (ones_a < ones_b)? ones_a : ones_b;
		int len_c = zeroes_c + ones_c;
		int[] c = new int[len_c];
		for(int i = 0; i < zeroes_c; i++){
			c[i] = 0;
		}
		for(int i = 0; i < ones_c; i++){
			c[i + zeroes_c] = 1;
		}

		// Print results
		System.out.println("wynik: " + len_c);
		for(int i = 0; i < len_c; i++){
			System.out.print(c[i] + " ");
		}
		System.out.println();
 }
}
