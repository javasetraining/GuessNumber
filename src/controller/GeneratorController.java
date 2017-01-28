package controller;

        import java.util.Random;

public class GeneratorController {

    private final Random random;

    public GeneratorController(Random random) {
        this.random = random;
    }

    public int generate(final int min, final int max) {
        final int size = max - min;
        final int randomeValue = random.nextInt() % size;
        return min + randomeValue;
    }
}
