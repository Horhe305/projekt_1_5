import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
     Scanner Obj = new Scanner(System.in);

    int parzysta = 0;
    for(int i = 50; parzysta <= i; parzysta++)
      {
        if(parzysta%2==0) System.out.println(parzysta);
      }

    int nieparzysta = 0;
    for(int i = 100; nieparzysta <= i; nieparzysta++)
      {
        if(nieparzysta%2==0) System.out.println(nieparzysta);
      }
  }
}