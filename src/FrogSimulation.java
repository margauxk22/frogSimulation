public class FrogSimulation {

    /** Distance, in inches, from the starting position to the goal. */
    private int goalDistance;
    /** Maximum number of hops allowed to reach the goal. */
    private int maxHops;

    public FrogSimulation(int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;

    }

    private int hopDistance() {
        return (int) (Math.random() * 40) - 8;
    }

    public boolean simulate(){
        int distance = 0;
        while (maxHops > 0) {
            distance += hopDistance();
//            System.out.println(distance);
            if (distance >= goalDistance) return true;
            maxHops--;
        }
        return false;
    }

    public double runSimulations(int num){
        return 0;
    }



}

