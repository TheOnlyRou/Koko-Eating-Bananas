public class Solution {
    public static void main(String[] args){
        System.out.println(Integer.toString(new Solution().minEatingSpeed(new int[]{3,6,7,11}, 8)));
    }

    public int minEatingSpeed(int[] piles, int h) {
        // Get the minimum and maximum pile sizes
        int min = 1, max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        // Binary search for the minimum k
        while (min < max) {
            int mid = (min + max) / 2;
            int hours = 0;
            for (int pile : piles) {
                hours += (int) Math.ceil((double) pile / mid);
            }
            if (hours > h) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        return min;
    }
}
