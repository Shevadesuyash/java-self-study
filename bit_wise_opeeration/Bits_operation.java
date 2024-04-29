package bit_wise_opeeration;

import java.util.Scanner;

public class Bits_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number ");
		int n = sc.nextInt();
		System.out.println(n + "  Binery conversion is  :  " + inttobits(n));

		System.out.println("Enter your choise of operation \n1.get\n2.set\n3.clear\n4.update\n");
		int c = sc.nextInt();
		switch (c) {
		case 1: {
			System.out.println("Enter position right to left for checking bit ");
			int p = sc.nextInt();
			get(n, p);
			break;
		}
		case 2: {
			System.out.println("Enter position right to left for set bit to 1 the  ");
			int p = sc.nextInt();
			set(n, p);
			break;
		}
		case 3: {
			System.out.println("Enter position right to left for set bit to 0  ");
			int p = sc.nextInt();
			clear(n, p);
			break;
		}
		case 4: {
			System.out.println("Enter position right to left for update inverse bit ");
			int p = sc.nextInt();
			System.out.println("Enter operation perform to bit 1 or 0 ");
			int o = sc.nextInt();
			update(n, p, o);
			break;
		}
		default: {
			System.out.println("Wrong choice \nPlease run again");
		}
		}

	}

	private static void get(int n, int p) {

		// we perform check operation such a that
		// we check the bit at given position
		// for that we use bitMask ,logical and

		int bitmask = 1 << p;
		if ((bitmask & n) == 0) {
			System.out.println("bit was 0");
		} else {
			System.out.println("bit was 1");
		}
		System.out.println("Binery :  " + inttobits(n));

	}

	private static void set(int n, int p) {

		// we perform set operation such a that
		// we set bit to 1 at given position
		// for that we use bitMask ,logical or
		System.out.println("before answer " + n + "  Binery conversion is  :  " + inttobits(n));
		int bitmask = 1 << p;
		int newN = n | bitmask;

		System.out.println("Answer is " + newN + "  Binery conversion is  :  " + inttobits(newN));

	}

	private static void clear(int n, int p) {

		// we perform clear operation such a that
		// we clear bit to 1 at given position
		// for that we use bitMask ,logical not-and

		System.out.println("before answer " + n + "  Binery conversion is  :  " + inttobits(n));
		int bitmask = 1 << p;
		int newN = n & ~bitmask;

		System.out.println("Answer is " + newN + "  Binery conversion is  :  " + inttobits(newN));

	}

	private static void update(int n, int p, int o) {

		// we perform update operation such a that
		// we update bit to 1 or 0 at given position
		// for that we use both set and clear

		if (o == 1) {
			set(n, p);
		} else {
			clear(n, p);
		}

	}

	public static StringBuffer inttobits(int n) {
		// converting decimal integer value to binary digit string
		StringBuffer str = new StringBuffer("");
		while (n > 0) {
			int remainder = n % 2;
			str.append(remainder);
			n /= 2;
		}

		return str.reverse();

	}

}
