package hard;

import static java.lang.System.out;

public class Stripe {
    public static void main(String[] args)
    {
        int[] array={2,3,4,3,4,123};
        out.println(solution(array));
    }

    private static int[] arrangeArrays(int []array)
    {
        int []arrangedArray=new int[array.length];
        int num=0;
        for(int index=0;index<array.length;index++)
        {
            if(isPositive(array[index]))
            {
                arrangedArray[num]=array[index];
                num++;
            }
        }
        return arrangedArray;
    }

   private static int solution(int []array)
    {
        for(int index=0;index<array.length;index++)
       {
           if(isOne(array[index]))
           {
               return ifIsOne(array);
           }
       }
       return ifIsNotOne(arrangeArrays(array));
    }

    private static int ifIsOne(int []array)
    {
        int solution=0;
        for(int index=0;index<array.length;index++)
        {
            if(solution<array[index])
            {
                solution=array[index];
            }
        }
        return solution;
    }

    private static int ifIsNotOne(int []array)
    {
        int solution=Integer.MAX_VALUE;
        for(int index=0;index<array.length;index++)
        {
            if(solution>array[index] && array[index]>0)
            {
                solution=array[index];
            }
        }
        return solution;
    }

    private static boolean isPositive(int n)
    {
        return n>0;
    }

    private static boolean isOne(int n){
        return n==1;
    }
}
