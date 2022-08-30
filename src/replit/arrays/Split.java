package replit.arrays;

import java.util.Arrays;

public class Split {

        public static void main(String[] args) {

            String str = "There are500mangoesOn30trees..in5DAys";
            String[] strArr = str.split("[[^0-9]+]");
            //[^0-9]+ matches one or more characters that are not number
           System.out.println(Arrays.toString(strArr));

            int sum = 0;
            for(String num : strArr){
                if(!num.isEmpty()){
                    sum+= Integer.parseInt(num);
                }
            }
            System.out.println(sum);
        }

    }

