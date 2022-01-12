public class Q541 {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i< arr.length; i += 2 * k) {
            if (i + k <= arr.length) {
                reverse(arr, i, i + k -1);
                continue;
            }
            reverse(arr, i, arr.length - 1);
        }
        return  new String(arr);

    }
    public void reverse(char[] arr, int i, int j) {
        while(i<j){
            char temp  = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
