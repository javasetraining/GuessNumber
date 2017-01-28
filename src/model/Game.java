package model;

public class Game {

    private final int min; // :-)


    private final int max;
    private final int attepptCount;
    private final int targetNumber;

    private Game(int min,
                 int max,
                 int attepptCount,
                 int targetNumber) {
        this.min = min;
        this.max = max;
        this.attepptCount = attepptCount;
        this.targetNumber = targetNumber;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getAttepptCount() {
        return attepptCount;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public static class GameBuilder {
        private int min;
        private int max;
        private int attepptCount;
        private int targetNumber;

        public GameBuilder setMin(int min) {
            this.min = min;
            return this;
        }

        public GameBuilder setMax(int max) {
            this.max = max;
            return this;
        }

        public GameBuilder setAttepptCount(int attepptCount) {
            this.attepptCount = attepptCount;
            return this;
        }

        public GameBuilder setTargetNumber(int targetNumber) {
            this.targetNumber = targetNumber;
            return this;
        }

        public Game createGame() {
            return new Game(min, max, attepptCount, targetNumber);
        }
    }
}