public class Main {
    public static void main(String[] args) {
        int arr[] = {91, 29, 97, 104, 26};
        int key = 91;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Element Found" : "Not Found");
    }
}
