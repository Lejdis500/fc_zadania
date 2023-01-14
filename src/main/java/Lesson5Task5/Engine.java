package Lesson5Task5;

public class Engine {
    public abstract void start ();
    public abstract void stop ();
    public abstract boolean isStarted ();
    private boolean engineStarted;


        @Override
        public void start() {
            if (!engineStarted) {
                engineStarted = true;
            }

        }

        @Override
        public void stop() {
            if ((engineStarted)) {
                engineStarted = true;
            }

        }

        @Override
        public boolean isStarted() {
            return engineStarted;
        }
    }

