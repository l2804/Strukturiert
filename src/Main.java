/**
 * The type Main.
 */
public class Main {
    /**
     * The Time.
     */
    int time;

    /**
     * Animation.
     *
     * @param text the text
     * @param time the time
     */
    public static void animation(String text,int time) {
        for (char c : text.toCharArray()) {
            System.out.print(c);

            try {
                sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();}}}

    /**
     * Sleep.
     *
     * @param time the time
     * @throws InterruptedException the interrupted exception
     */
    public static void sleep(int time) throws InterruptedException {
                    Thread.sleep(time);
                }
}
