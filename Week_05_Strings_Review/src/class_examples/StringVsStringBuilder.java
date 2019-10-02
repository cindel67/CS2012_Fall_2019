package class_examples;

public class StringVsStringBuilder {

	public static void main(String[] args) {
int x = 100;
		
		long start1 = System.currentTimeMillis();
		String result1 = createString1('@', x);
		long end1 = System.currentTimeMillis();
		
		long start2 = System.currentTimeMillis();
		StringBuilder result2 = createString2('@', x);
		long end2 = System.currentTimeMillis();
		
		System.out.println(result2);
		
		System.out.println("String result: " + (end1 - start1) + "ms" );
		System.out.println("StringBuilder result: " + (end2 - start2) + "ms" );
	}
	
	public static String createString1(char ch, int x) {
		String result = "";
		
		for (int i = 1; i <= x ; i++) {
			result += ch;
		}
		
		return result;
	}
	
	public static StringBuilder createString2(char ch, int x) {
		StringBuilder result = new StringBuilder("");
		
		for (int i = 1; i <= x ; i++) {
			result.append(ch);
		}
		return result;
	}

}
