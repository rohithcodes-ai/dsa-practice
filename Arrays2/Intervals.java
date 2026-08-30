import java.util.*;

public class Intervals {

    static int[][] merge(int[][] intervals){

        if(intervals.length<=1)
            return intervals;
        List<int[]> result =new ArrayList<>();
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        int[] curr = intervals[0];
        result.add(curr);
        for(int i=0;i<intervals.length;i++){

            int[] interval=intervals[i];
            if(interval[0]<curr[1])
                curr[1]=Math.max(curr[1],interval[1]);
            else{

                curr=interval;
                result.add(curr);
            }

        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of intervals");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.println("Enter start and end of each interval");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int[][] mergedIntervals = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int i = 0; i < mergedIntervals.length; i++) {
        System.out.println("[" + mergedIntervals[i][0] + ", " + mergedIntervals[i][1] + "]");
        }
    
    }
}
    
