public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(isPalindrome(-1221));

        System.out.println("***********************************");

        System.out.println(isPalindrome2(-1221));
        System.out.println(isPalindrome2(-12241));
        System.out.println(isPalindrome2(-333));
        System.out.println(isPalindrome2(-12321));
        System.out.println(getFirstAndLastDigitSum(124));

        System.out.println("***********************************");
        System.out.println(numberToWords(23));
    }



    public static boolean isPalindrome(int num){
        num=Math.abs(num);
        char[] digits =String.valueOf(num).toCharArray();
        String reversed ="";
        for(int i=digits.length-1;i>=0;i--){
            reversed += digits[i];
        }
       return reversed.equals(String.valueOf(num));

    }
    public static boolean isPalindrome2(int num){
        num = Math.abs(num);
        int orijinalNum=num;
        int reverseNum=0;

        while(num >0){
            int digit=num%10;
            reverseNum=reverseNum *10 + digit;
            num = num /10;

        }
        return  orijinalNum==reverseNum;
    }

    public static boolean isPerfectNumber(int num){
        if(num <=0){
            return false;
        }
        int total =0;
        for(int i=1;i<=num/2;i++){
            if(num % i==0){
                total +=i;
            }
        }
        return num==total;
    }

   public static String numberToWords(int num){
        if(num<0 ){
            return "Invalid Value";
        }
        char[] digits=String.valueOf(num).toCharArray();
        String numToText="";
        for(char digit : digits){
            switch (digit){
                case '0':
                    numToText +="Zero ";
                    break;
                case '1':
                    numToText +="One ";
                    break;
                case '2':
                    numToText +="Two ";
                    break;
                case '3':
                    numToText +="Three ";
                    break;
                case '4':
                    numToText +="Four ";
                    break;
                case '5':
                    numToText +="Five ";
                    break;
                case '6':
                    numToText +="Six ";
                    break;
                case '7':
                    numToText +="Seven ";
                    break;
                case '8':
                    numToText +="Eight ";
                    break;
                case '9':
                    numToText +="Nine ";
                    break;
            }

        }
        return numToText.trim();
   }



    public static int getEvenDigitSum(int num){
        num =Math.abs(num);
        int sum=0;
        char[] digits= String.valueOf(num).toCharArray();
        for(char digit: digits){
            int parseDigit=Integer.parseInt(String.valueOf(digit));
            if(parseDigit%2==0){
                sum+=parseDigit;
            }
        }
        return sum;
    }



    public static int getFirstAndLastDigitSum(int num){
        int lastDigit = num % 10;
       //int firstDigit= String.valueOf(num).charAt(0);
       int firstDigit=Integer.parseInt(String.valueOf(num).substring(0,1));
       return firstDigit+lastDigit;
    }


}