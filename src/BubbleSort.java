import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] myArray = {4, 11, 23, 1, 17, 6};
        int saveForMas;
        boolean sorted = false;

        while(!sorted) {
            sorted = true;
            for (int i = 0; myArray.length > i+1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    sorted = false;

                    saveForMas = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = saveForMas;
                    break;


                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
