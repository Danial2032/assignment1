import java.util.Scanner;

public class Main {
    public static void printDigits(int number){
        int digit=number%10;
        if(number==0){
            return;
        }
        printDigits(number/10);
        System.out.println(digit);
    }
    static int i=2;
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
            System.out.println();
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
        if(number==0){
            return 0;
        }
        if (number==1){
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
        return 1+CountOfCharInString(str.substring(1));
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
        System.out.println("Enter number to print only digits: ");
        int task1= scanner.nextInt();
        System.out.println("Digits line by line of" + task1 + " number:");
        printDigits(task1);//1st task

        System.out.println("Write number of elements and then the elements to find average:");
        int n1= scanner.nextInt();//2nd task
        int[] arr1= new int [n1];//2nd task
        fillArray(arr1,0,scanner);//2nd task
        double sum=findSum(arr1,0);
        double average=sum/n1;
        System.out.println("Average is: "+average);//2nd task

        System.out.println("Enter number");//3rd task
        int task3= scanner.nextInt();
        System.out.println("Number "+ task3+ " is:");
        isPrime(task3);//3rd task

        System.out.println("Enter your number");//4th task
        int task4=scanner.nextInt();
        System.out.println("Factorial of " + task4+  " is:"+factorial(task4));//4th task

        System.out.println("Enter your number");
        int task5=scanner.nextInt();
        System.out.println(task5+"th Fibonacci number is: "+FibonacciNum(task5));//5th task

        System.out.println("Enter your base and exponent");
        int base=scanner.nextInt();
        int exponent= scanner.nextInt();
        System.out.println(base+" in the power of "+exponent+ " is: "+power(base,exponent));//6th task

        System.out.println("Write number of elements and then the elements:");
        int n2= scanner.nextInt();//7th task
        int[] arr2= new int [n2];//7th task
        fillArray(arr2,0, scanner);//7th task
        reverseArray(arr2,0,n2-1);//7th task
        System.out.println("The reversed array:");
        printArray(arr2,0);//7th task

        System.out.println("Enter your string.I will write YES if your string contains only digits: ");//8th task
        String task8=scanner.next();
        if(IsOnlyDigits(task8,0)){//8th task
            System.out.println("YES");//8th task
        }//8th task
        else{//8th task
            System.out.println("NO");//8th task
        }

        System.out.println("Enter your string. I will count number of characters.");
        String task9=scanner.next();
        System.out.println("To make "+task9+" were used: " +CountOfCharInString(task9)+" characters");//9th task

        System.out.println("Enter two numbers");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        System.out.println("GCD of "+number1+" and "+number2+" is: "+GCDOf2Num(number1,number2));//10th task
    }
}