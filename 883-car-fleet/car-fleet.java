class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        float[] times = new float[target];
        for (int i = 0; i < position.length; i ++) {
            times[position[i]] = (float) (target - position[i]) / speed[i];
        }

        int fleets = 0;
        float limitingTime = 0;
        for (int i = times.length - 1; i >= 0; i --) {
            if (times[i] > limitingTime) {
                fleets ++;
                limitingTime = times[i];
            }
        }
        return fleets;

    }
}