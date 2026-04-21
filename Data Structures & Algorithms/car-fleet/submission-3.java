
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;

        // sort indices by position descending (closest to target first)
        Arrays.sort(idx, (a, b) -> Integer.compare(position[b], position[a]));

        int fleets = 0;
        double currTime = -1.0;

        for (int k = 0; k < n; k++) {
            int i = idx[k];
            double time = ((double) target - position[i]) / speed[i]; // double division
            if (time > currTime) {
                fleets++;
                currTime = time;
            }
            // else car joins the fleet whose time is currTime
        }

        return fleets;
    }
}






