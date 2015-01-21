import org.junit.Test;

import java.util.LinkedList;

public class SingleTonTest {

    @Test
    public void testSingleTon(){

        Singleton newInstance = Singleton.getInstance();

        System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(7);

        System.out.println("Player 1: " + playerOneTiles);
        System.out.println(newInstance.getLetterList());

        Singleton instanceTwo = Singleton.getInstance();

        System.out.println("2nd Instance ID: " + System.identityHashCode(instanceTwo));
        System.out.println(instanceTwo.getLetterList());

        LinkedList<String> playerTwoTiles = newInstance.getTiles(7);

        System.out.println("Player 2: " + playerTwoTiles);
    }

    @Test
    public void testThreadedBehaviour(){
        // Create a new Thread created using the Runnable interface
        // Execute the code in run after 10 seconds

        Runnable getTiles = new GetTheTiles();

        Runnable getTilesAgain = new GetTheTiles();

        // Call for the code in the method run to execute

        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();

    }
}