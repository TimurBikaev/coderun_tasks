
//Принимать массив и возвращать сумму его элементов

public class SumOfElementsOfMassive {

    public static void main(String[] args) {

        int[] array = {1, 2};
        System.out.println(sumOfElements(array));


    }

    public static int sumOfElements(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }


}
