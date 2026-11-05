public class Evennumbersearch {
    public static void main(String [] args){   

     int [] arr = {1, 2, 3 , 4, 5, 6};
        int target =  5;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("ELEMENT FOUND IN THE ARRAY");
        } else {
            System.out.println("ELEMENT NOT FOUND IN THE ARRAY");
        }
    }




























    
}
