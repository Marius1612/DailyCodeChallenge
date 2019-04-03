package hard;

import static java.lang.System.out;

public class Amazon {
    public static void main(String [] args)
    {
        int n=5;
        solving(n);
    }

    static void solving(int n)
    {
        int k=0;
        printUnu(n);
        out.println(" ");
        while (n>2)
        {
                n-=2;
                k+=1;
                printUnu(n);
                printDoi(k);
                out.println(" ");
        }
    }


    static void printUnu(int n)
    {
        while(n!=0)
        {
            out.print(1+" ");
            n--;
        }
    }

    static void printDoi(int n)
    {
        while(n>0)
        {
            out.print(2+" ");
            n--;
        }
    }
}
