public class Task2 {

    public boolean oneFour(int[]arr){
        for (int i=0; i < arr.length; i++){
            if(arr[i] == 1 || arr[i] == 4){
                return true;
            }
        }
        return false;
    }
}
