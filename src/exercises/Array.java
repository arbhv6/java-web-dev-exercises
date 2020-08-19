package exercises;

public class Array {
    public static void main(String[] args) {
        Integer[] arr = {1, 1, 2, 3, 5, 8};

        for (Integer i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                System.out.println(arr[i]);
            } else if (arr[i] % 2 == 1) {
                System.out.println(arr[i]);
            }
        }

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] strArr = str.split(" ");

        System.out.println(strArr[1]);
    }
}
