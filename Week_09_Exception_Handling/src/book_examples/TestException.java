package book_examples;


public class TestException  {
  public static void main(String[] args) {
    try {
      a();
    }
    catch (Exception ex) {
      //ex.printStackTrace();
 //     System.out.println("\n" + ex.getMessage());
//      System.out.println("\n" + ex.toString());
//
      System.out.println("\nTrace Info Obtained from getStackTrace");

      StackTraceElement[] traceElements = ex.getStackTrace();

      for (int i = 0; i < traceElements.length; i++) {
        System.out.print("method " + traceElements[i].getMethodName());
        System.out.print("(" + traceElements[i].getClassName() + ":");
        System.out.println(traceElements[i].getLineNumber() + ")");
      }
    }
  }

  private static int sum(int[] list) {
    int result = 0;

    throw new IndexOutOfBoundsException("ERROR: Index out of bounds.");


//    for (int i = 0; i <= list.length; i++)
//      result += list[i];
  }

  public static void a() {
    b();
  }
  public static void b() {
    System.out.println(sum(new int[] {1, 2, 3, 4, 5}));
  }
}
