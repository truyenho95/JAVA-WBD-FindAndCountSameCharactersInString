import java.util.Scanner;

public class FindAndCountSameCharactersInString {
  public static void main(String[] args) {
    String stringPattern = "Hello Java! I'm a beginner";

    Scanner scanner = new Scanner(System.in);
    System.out.println("Mời bạn nhập ký tự muốn tìm kiếm:");

    char charNeedToFind = scanner.next().charAt(0);
    int numberOfSameChar = 0;
    for (int i = 0; i < stringPattern.toCharArray().length; i++)
      if (stringPattern.charAt(i) == charNeedToFind)
        numberOfSameChar += 1;

    System.out.printf("Ký tự '%s' được tìm thấy %d lần.", charNeedToFind, numberOfSameChar);
  }
}
