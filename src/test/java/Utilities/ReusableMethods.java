package Utilities;

public class ReusableMethods {
    public static void bekle(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {

        }

    }
}
