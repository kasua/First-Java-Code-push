package quz;

public class quz4 {

	public static void main(String[] args) {

		int i = 50;

		int[] a = new int[10];
		System.out.println(a.length);

		a = new int[100];
		System.out.println(a.length);

		a = new int[i];

		System.out.println(a.length);

		if (true) {
			int[] str = { 5 };
			
			String i1 = "" + str[0];
			System.out.print(i1);
		}
		System.out.print("-");
		{
			int[] str = { 1, 2 };
			System.out.print(str[1]);
		}
		System.out.print("-");
		{
			String str = "I like Java Programming Language";
			System.out.print(str);
		}
		System.out.print("-");
		{
			int str = 124;
			System.out.print(str);

		}

	}

}
