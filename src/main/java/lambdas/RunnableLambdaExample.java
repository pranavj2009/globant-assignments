package lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        /**
         * Prior java 8
         * */
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable1");
            }
        };

        new Thread(runnable1).start();

        /**
         * New java 8 way
         * */
        Runnable runnable2 = () -> {
            System.out.println("Inside runnable2");
        };

        new Thread(runnable2).start();


        new Thread(() -> System.out.println("Inside runnable3")).start();
    }
}
