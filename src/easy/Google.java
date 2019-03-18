package easy;

import static java.lang.System.out;

public class Google {
    public static void main(String args[])
    {
        int array[]={2,3,4,5,6};
        int n=1612;
        out.println(check(array,n));
    }

    static boolean check(int []array, int n)
    {
        for(int index=0;index<array.length;index++)
        {
            for(int secondIntex=0;secondIntex<array.length;secondIntex++)
            {
                if(array[index]+array[secondIntex]==n)
                    return true;
            }
        }
        return false;
    }
}
