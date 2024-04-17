import java.util.Scanner;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wpisz liczbe: ");
    int a = scanner.nextInt();
    System.out.println("Znak: ");
    char znak = scanner.next().charAt(0);
    int b=a;
    for(int i = 0; i < a+1; i++)
    
      {
        
        for(int j = 0; j < b; j++)
          {
            System.out.print(" ");
            
          }

        for(int j = 0; j < i; j++)
          {
            System.out.print(znak);

          }
        b--;
        System.out.print('\n');
        
      }

  }
}