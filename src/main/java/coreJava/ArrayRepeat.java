package coreJava;

public class ArrayRepeat {
    public static void main(String[] args) {
        int[] nummers = {4, 5, 6, 4, 7, 5, 9, 6};

        System.out.println("Tekrar eden elemanlar: ");

        for (int i = 0; i < nummers.length; i++) {


            for (int j = i + 1; j < nummers.length; j++) {

                if (nummers[i] == nummers[j]) {


                    System.out.println(nummers[i]);

                    break;
                }
            }

        }

    }
}
