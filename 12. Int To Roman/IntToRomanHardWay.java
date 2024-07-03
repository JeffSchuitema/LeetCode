class Solution {
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();

        int m = 0;
        for (int i = 0; i < Math.floor((num /1000)); i++){
            ans.append("M");
            m++;
        }
        num = num - (m*1000);

        int d = 0;
        for (int i = 0; i < Math.floor((num /500)); i++){
            ans.append("D");
            d++;
        }
        num = num - (d*500);

        int c = 0;
        for (int i = 0; i < Math.floor((num /100)); i++){
            ans.append("C");
            c++;
        }
        num = num - (c*100);

        int l = 0;
        for (int i = 0; i < Math.floor((num /50)); i++){
            ans.append("L");
            ans.append(Integer.toString(num));
            l++;
        }
        num = num - (l*50);

        int x = 0;
        for (int i = 0; i < Math.floor((num /10)); i++){
            ans.append("X");
            ans.append(Integer.toString(num));
            x++;
        }
        num = num - (x*10);

        int v = 0;
        for (int i = 0; i < Math.floor((num /5)); i++){
            ans.append("V");
            v++;
        }
        num = num - (v*5);

        int j = 0;
        for (int i = 0; i < Math.floor((num /1)); i++){
            ans.append("I");
            j++;
        }
        num = num - (j*1);

        return ans.toString();
    }
}
