public class Simulation {

    Integer numOfDies;
    Integer numOfTosses;
    Dice dice;
    Bins bins;

    public Simulation(Integer numOfDies, Integer numOfTosses) {
        this.numOfTosses = numOfTosses;
        this.numOfDies = numOfDies;
        dice = new Dice(numOfDies);
        bins = new Bins(numOfDies, numOfDies*6);
    }

    public void runSimulation() {
        for(int i=1; i<=numOfTosses; i++)
        {
            Integer sum = dice.tossAndSum();
            bins.incrementBin(sum);

        }
    }

    public void printResults() {
        System.out.println("Simulation of " + numOfDies + " dice tossed for " + numOfTosses + " times.");

        for(int i=numOfDies; i<=numOfDies*6; i++)
        {
            System.out.println(i + ": " + bins.getBin(i));
        }
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();
    }

}