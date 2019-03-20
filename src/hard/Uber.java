package hard;

import static java.lang.System.out;

public class Uber {

    public static void main(String[] args) {
      int[] array={2,3,5,6,7};
      displayArray(uberCuArray(array));

    }

   private static void displayArray(int []array)
    {
        for(int i=0;i<array.length;i++)
            out.println(array[i]);
    }

    private static int []arrayEgualsWithArray(int []array, int []secondArray)
    {
        for(int i=0;i<array.length;i++)
        {
            secondArray[i]=array[i];
        }
        return secondArray;
    }

   private static int [] uberCuArray(int[] array)
    {
        int []fakeArray=new int[array.length];
        int holder;
        arrayEgualsWithArray(array,fakeArray);
        for(int index=0;index<array.length;index++)
        {
            holder=array[index];
            array[index]=1;
            for(int secondIndex=0;secondIndex<array.length;secondIndex++)
            {
                if(index!=secondIndex)
              array[index]*=array[secondIndex];
            }
            fakeArray[index]=array[index];
            array[index]=holder;
        }
        return fakeArray;
    }
}
