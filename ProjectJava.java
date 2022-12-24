import java.util.Random;

public class ProjectJava {

    public static void main(String args[]){

        int length = 5;

        String s = "My Name is Chirag";

        System.out.println(randomString(length));
        Random random = new Random();
        double x = random.nextDouble()+1;

        System.out.println(Math.random());
        System.out.println(x);

        System.out.println(reverseString(s));

    }

    public static String randomString(int length){

        String alphanumeric = "abcdefghijklmnopqrstuvwxyz"
                +"ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        int num = random.nextInt(10);

        for(int i=0 ; i<length-2 ; i++){

            int j = (int)((alphanumeric.length()-1)*Math.random());

            sb.append(alphanumeric.charAt(j));

            sb.append(num);

        }
       // sb.append()

        return sb.toString();
    }

    public static String reverseString(String str){

        String res = "";
        String strArr[] = str.split(" ");

        for(int i= strArr.length-1; i>=0 ; i--){

            res += strArr[i] + " ";
        }
        return res;
    }
}
