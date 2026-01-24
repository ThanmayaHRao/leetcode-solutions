class Solution {

    class Car {
        int position;
        double timeToTarget;

        Car(int position, double timeToTarget) {
            this.position = position;
            this.timeToTarget = timeToTarget;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {

        int n = speed.length;
        if (n == 0) return 0;

        Car[] arr = new Car[n];

        // create car objects
        for (int i = 0; i < n; i++) {
            double time = (target - position[i]) * 1.0 / speed[i];
            arr[i] = new Car(position[i], time);
        }

        // sort cars by position
        Arrays.sort(arr, (a, b) -> Integer.compare(a.position, b.position));

        int fleets = 0;
        double maxTime = 0;

        // iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i].timeToTarget > maxTime) {
                fleets++;
                maxTime = arr[i].timeToTarget;
            }
        }

        return fleets;
    }
}
