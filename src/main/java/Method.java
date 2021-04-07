
public class Method {

    public static int[] arr (int [] arr){
       int x = 0;
       int [] newArr;
       for(int i = 0; i < arr.length; i++ ){
           if(arr[i] == 4){
               x = i+1;
           }
       }
       if(x == 0){
           throw new RuntimeException();
       }
       newArr = new int[arr.length - x];
       for (int j = 0; j < newArr.length; j++){
                newArr[j] = arr[j+x];
       }
       return newArr;
    }
}
