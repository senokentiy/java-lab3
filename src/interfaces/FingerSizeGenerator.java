package interfaces;

import java.util.Random;


public interface FingerSizeGenerator
{
    default int genSize()
    {
        int maxSize = 25;
        int minSize = 15;

        Random random = new Random();
        return random.nextInt(maxSize - minSize) + minSize;
    }
}
