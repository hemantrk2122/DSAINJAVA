package binarySearch;

public class Leet1011 {
	private boolean isPossible(int capacity, int[] weights, int days){
        int currCap = 0, ships = 1;
        for(int w:weights){
            if(currCap+w>capacity){
                ships++;
                currCap = 0;
            }
            currCap += w;
        }
        return ships>days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;
        for(int w:weights){
            l = Math.max(l,w);
            r += w;
        }
        while(l<r){
            int capacity = l+(r-l)/2;
            if(isPossible(capacity, weights, days)){
                l = capacity + 1;
            }else r = capacity;
        }
        return l;
    }
}
