public class Q43 {
    public String multiply(String num1, String num2) {
        int n1=num1.length(),n2=num2.length();
        int[] product=new int[n1+n2];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                int a=num1.charAt(i)-'0';
                int b=num2.charAt(j)-'0';
                product[i + j + 1] += a * b;
            }
        }
        int carry = 0;
        for (int i = product.length - 1; i >= 0; i--) {
            int tmp = (product[i] + carry) % 10;
            carry = (product[i] + carry) / 10;
            product[i] = tmp;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : product) sb.append(num);
        while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
