public class DataGeneration {
    public static int[] randomArr(){
        int ARRAY_SIZE = 100;
        int[] a = new int[ARRAY_SIZE];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100_000);
        }

        return a;
    }
}