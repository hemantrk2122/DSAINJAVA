package t01_binarySearch;

// LC 1011. Capacity To Ship Packages Within D Days
public class Q06_CapacityToShipPackagesWithinDDays {

	private static boolean isPossible(int capacity, int[] weights, int days){
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
    public static int shipWithinDays(int[] weights, int days) {
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

	public static void main(String[] args) {
		System.out.println(shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5)); // expected 15
		System.out.println(shipWithinDays(new int[]{3,2,2,4,1,4}, 3));            // expected 6
		System.out.println(shipWithinDays(new int[]{1,2,3,1,1}, 4));              // expected 3
	}
}
