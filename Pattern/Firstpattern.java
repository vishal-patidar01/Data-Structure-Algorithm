package Pattern;

public class Firstpattern {
    public static void rightAngleTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
// Inverted right angle triangle

    public static void second(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    // Right angle tringle with number

    public static void thirdPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

  //  Inverted Right-Angled Triangle with Numbers

    public static void fourthPattern(int n) {
        for(int i=5; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

     //Floyd's Triangle

     public static void fifthPattern(int n) {
         int count = 1;
         for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    //Half Diamond Pattern with Numbers

    public static void sixPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    //Right-Angled Triangle of Alphabets
    // A
    // B B
    // C C C
    // D D D D
    // E E E E E

    public static void sevenPattern(int n) {
        char ch = 'A';
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
    // Inverted Triangle of Alphabets

    public static void eightPattern(int n) {
        for(int i=n; i>=1; i--) {
            char ch = 'A';
            for(int j=1; j<=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            // ch = 'A';
            System.out.println();
        }
    }

    // Pyramid Pattern

    public static void ninePattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    // Inverted Pyramid Pattern

    public static void tenPattern(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    // Diamond Pattern

    public static void elevenpattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    // Hourglass Pattern

    public static void twelvePattern(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    //Hollow Square Pattern
    public static void thirteenPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Hollow Triangle

    public static void fourteenPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i == n || j == 1 || j == i) {
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void fifteenPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j)%2 != 0 ) {
                    System.out.print("0"+" ");
                }else {
                    System.out.print(""+" ");
                }
            }
            System.out.println();
        }
    }

    // Hollow Diamond Pattern

    public static void sixteenPattern(int n) {
        for(int i=0; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
       // rightAngleTriangle(5);
       // second(5);
       //thirdPattern(5);
       //fourthPattern(5);
       //fifthPattern(5);
       //sixPattern(100);
    //    sevenPattern(5);
    //    System.out.println();
    //    eightPattern(5);
       //ninePattern(8);
       //tenPattern(10);
      // elevenpattern(10);
      //twelvePattern(10);
      //thirteenPattern(5);
      //fourteenPattern(5);
      //fifteenPattern(5);
      sixteenPattern(5);
    }

}