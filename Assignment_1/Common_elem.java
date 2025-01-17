package Assignment_1;

public class Common_elem {

    public static void main(String[] args) {
        int arr1[] = {2, 3, 4, 5};
        int arr[] = {2, 1, 3, 4, 6};
        boolean found = false;
        System.out.println("Common elements are:");
        for (int x : arr1) {
            for (int y : arr) {
                if (x == y) {
                    System.out.print(x + " ");
                    
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("no comon elements found");
        }
    }

}
