/**
 * Created by berg on 11/11/16.
 */
public class GA {

    public static void main(String[] args) {

        FitnessCal.setSolution("0101011001100001011011100010000001000100011001010110111000100000010000100110010101110010011001110010000001100100011000010010000001000111011000010110110101100001001000000100011001100101011100100111001001100101011010010111001001100001");

        Population myPop = new Population(50, true);

        int generationCount = 0;
        while (myPop.getFittest().getFitness() < FitnessCal.getMaxFitness()) {
            generationCount++;
            System.out.println("Generation: " + generationCount + " Fittest: " + myPop.getFittest().getFitness());
            myPop = Algorithm.evolvePopulation(myPop);
        }
        System.out.println("Solution found!");
        System.out.println("Generation: " + generationCount);
        System.out.print("Genes: ");
        System.out.println(myPop.getFittest());
    }
}
