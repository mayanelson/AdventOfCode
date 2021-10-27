public class Day1 {
  public static int whatfloor(String s) {
    int floor = 0;
    for (int i = 0; i < s.length(); i++){
      if (s.charAt(i) == '(') {
        floor += 1;
      }
      if (s.charAt(i) == ')') {
        floor += -1;
      }
    }
    return floor;
  }
  public static void main(String[] args) {
    System.out.println("(())");
    System.out.println("((()");
    System.out.println(")())())");
  }
}
