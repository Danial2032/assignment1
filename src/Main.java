import java.util.Scanner;

public class Main {
    public static void printDigits(int number){
        int rem=number%10;
        if(number==0){
            return;
        }
        printDigits(number/10);
        System.out.println(rem);
    }
    static int i=2;//for isPrime
    public static void isPrime(int numb){
        if(i==numb/2+1){
            System.out.println("Prime");
            return;
        }
        if(numb%i==0){
            System.out.println("Composite");
            return;
        }
        i++;
        isPrime(numb);
    }
    public static int factorial(int number){
        if(number<=1){
            return 1;
        }
        return factorial(number-1)*number;
    }
    public static int power(int base,int exponent){
        if(exponent==0){
            return 1;
        }
        else{
            return base*power(base,exponent-1);
        }
    }
    public static void reverseArray(int[] arr,int i,int j){
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            reverseArray(arr,++i,--j);
        }
    }
    public static void fillArray(int[] arr,int index,Scanner scanner){
        if(index==arr.length){
            return;
        }
        arr[index]=scanner.nextInt();
        fillArray(arr,index+1,scanner);
    }
    public static void printArray(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]+ " ");
        printArray(arr,index+1);
    }
    public static int findSum(int [] arr,int index){
        if(index==arr.length){
            return 0;
        }
        int num=arr[index];
        int sum=findSum(arr,index + 1);
        return sum+ num;
    }
    public static int FibonacciNum(int number){
        if(number==1){
            return 0;
        }
        if (number==2){
            return 1;
        }
        return FibonacciNum(number-1)+FibonacciNum(number-2);
    }
    public static int GCDOf2Num(int num1,int num2){
        if(num1%num2==0){
            return num2;
        }
        return GCDOf2Num(num2,num1%num2);
    }
    public static int CountOfCharInString(String str){
        if(str==null||str.isEmpty()){
            return 0;
        }
        return CountOfCharInString(str.substring(1)+1);
    }
    public static boolean IsOnlyDigits(String str,int index){
        if(index==str.length()){
            return true;
        }
        if(!Character.isDigit(str.charAt(index))){
            return false;
        }
        return IsOnlyDigits(str,index+1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        printDigits(13749);//1st task
        int n1= scanner.nextInt();//2nd task
        int[] arr1= new int [n1];//2nd task
        fillArray(arr1,0,scanner);//2nd task
        System.out.println(findSum(arr1,0)/n1);//2nd task
        isPrime(7);//3rd task
        factorial(5);//4th task
        System.out.println(FibonacciNum(10));//5th task
        System.out.println(power(2,10));//6th task
        int n2= scanner.nextInt();//7th task
        int[] arr2= new int [n2];//7th task
        fillArray(arr2,0, scanner);//7th task
        reverseArray(arr2,0,n2-1);//7th task
        printArray(arr2,0);//7th task
        if(IsOnlyDigits("123",0)){//8th task
            System.out.println("YES");//8th task
        }//8th task
        else{//8th task
            System.out.println("NO");//8th task
        }//8th task
        System.out.println(CountOfCharInString("abcde"));//9th task
        System.out.println(GCDOf2Num(36,72));//10th task
    }
}