public class Q12 {
    public String intToRoman(int num) {
        String Thousand[] = {"", "M", "MM", "MMM"};
        String Hundred[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String Ten[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String One[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return Thousand[num / 1000] + Hundred[(num % 1000) / 100] + Ten[(num % 100) / 10] + One[num % 10];
    }
}
