import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    System.out.println("Liczby parzyste:");
    for(int x = 0; x <= 50; x++)
    {
      if(x%2 == 0)
      {
        System.out.println(x);
      }
    }
    System.out.println("Liczby nieparzyste:");
    for(int x = 50; x <= 100; x++)
    {
      if(x%2 != 0 )
      {
        System.out.println(x);
      }
    }
  }
}