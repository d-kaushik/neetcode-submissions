class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max =0;
        for(int pile : piles) {
            max = Math.max(max, pile);
        }
        int minRate = Integer.MAX_VALUE;

        while(min<=max) {
            int mid = min + (max-min)/2;
            int hours = requiredHoursToFinishBanana(piles, mid);
            
            if(hours<=h) {
                minRate = Math.min(minRate, mid);
                max = mid-1;
            } else {
                min = mid+1;
            }
        }
        return minRate;
    }
    public int requiredHoursToFinishBanana(int[] piles, int rate) {
        int temp =0;
        System.out.println("Rate: "+ rate);
        for(int pile: piles) {
            temp += pile/rate + (pile%rate>0 ? 1 : 0);
        }
        System.out.println("temp: "+ temp);
        return temp;
    }
}
