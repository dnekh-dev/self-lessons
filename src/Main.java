public class Main {

    public static void main(String[] args) {

        ElementsOne el1 = new ElementsOne();
        ElementsOne el2 = new ElementsOne();

        el1.start();
        el2.start();

        Thread el3 = new Thread(new ElementsTwo());
        Thread el4 = new Thread(new ElementsTwo());
        Thread el5 = new Thread((new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 11; i++) {
                    System.out.println("El5 " + i);
                }
            }
        }));

        el3.start();
        el4.start();
        el5.start();
    }
}
