public class Main {
    int time;
    public static void animation(String text,int time) {
        for (char c : text.toCharArray()) {
            System.out.print(c);

            try {
                sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();}}}

                public static void sleep(int time) throws InterruptedException {
                    Thread.sleep(time);
                }
}
