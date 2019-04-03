package hard;

public class Google1 {
    public static void main(String[] args) {
        int[] array = {10, 5, 2, 7, 8, 7,3,6};
        displayArray(solution(array,3));
    }

    static void displayArray(int [] array)
    {
        for(int index=0;index<array.length;index++)
        {
            System.out.print(array[index]+" ");
        }
    }

    static int [] solution(int [] array, int k)
    {
        int max=Integer.MIN_VALUE;
        int []arrayToReturn=new int[array.length-k+1];
        int atrIndex=0;
        for (int index=0;index<array.length-k+1;index++)
        {
            if(index<array.length-k+1)
            {
                for(int secondIndex=index;secondIndex<index+k;secondIndex++)
                {
                    if(array[secondIndex]>max)
                    {
                        max=array[secondIndex];
                    }
                }
                arrayToReturn[atrIndex]=max;
                max=Integer.MIN_VALUE;
            }
            atrIndex++;
        }
        return arrayToReturn;
    }
}
