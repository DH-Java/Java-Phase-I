package IO.src.练习程序;

public class ArrayApp {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[100];
        int nElems = 0;
        int j;
        int searchKey;
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;
        for (j = 0; j <nElems; j++) {
            System.out.print(arr[j] + "");
            System.out.print(" ");
        }

        searchKey = 66;
        for(j=0;j<nElems;j++){
            if (arr[j] == searchKey){
                break;
            }
        }
        if (j == nElems){
            System.out.println("\nCan't find "+ searchKey);
        }else {
            System.out.println("\nFound " + searchKey);
        }

        searchKey = 55;
        for (j = 0; j <nElems ; j++) {
            if (arr[j] == searchKey){
                break;
            }
        }
        for (int k =j; k <nElems ; k++) {
            arr[k] = arr[k+1];
        }
        nElems--;
        for (j = 0; j< nElems; j++) {
            System.out.print(arr[j] + "");
            System.out.print(" ");
        }
    }
}
