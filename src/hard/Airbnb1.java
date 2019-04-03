package hard;
//fixed Airbnb problem
public class Airbnb1 {
    public static void main(String[] args) {
        int [] array={1,3,5,6,2,-2,-1,-1};
        System.out.println(solution(array));
    }
    static int solution(int[] array)
    {
        int comparrison=lowestValueFrom(array);
        while (true) {
            int holdTheLength=0;
            for (int index = 0; index < array.length; index++) {
                if (array[index] != comparrison + 1) {
                    holdTheLength++;
                }
                if(holdTheLength==array.length-1)
                {
                    return comparrison+1;
                }
            }
            comparrison++;
        }
    }

    static int lowestValueFrom(int[] array)
    {
        int min=Integer.MAX_VALUE;
        for(int index=0;index<array.length;index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}