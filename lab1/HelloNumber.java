public class HelloNumber {
    public static void main(String[] args) {
        int num = 0;
        int cumulativeSum = 0;
        while(num<10){
            cumulativeSum += num;
            System.out.print(cumulativeSum+" ");
            num++;
        }
        System.out.println();;
        
        System.out.println(10+"50");
        //output 1050 cuz java interprets it as string concatenation
    }
    
}
