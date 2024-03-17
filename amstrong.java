public class amstrong
{
    public static void main(String args[])
    {
        int num, number, total, temp;
        
        for(num = 1;num <=1000; num++)
        {
            number = num;
            total = 0;
            temp = 0;
            while(number != 0)
            {
                temp = number % 10;
                total = total + temp * temp * temp;
                number = number / 10;
            }
            if(total == num){
                System.out.println(num);
            }
        }
    }
}


// second armstrong

// armstrong between 1 to 1000

public class amstrong
{
    public static void main(String args[])
    {
        int num,number,temp,total;
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter the value :");
        // num = s.nextInt();
        for(num=1;num <=1000;num++)
        {
            number = num;
            temp = 0;
            total = 0;
            while(number != 0)
            {
                temp = number % 10;
                total = total+temp*temp*temp;
                number = number / 10;
            }
            if(total == num)
            {
                System.out.println(num);
            }
        }
    }
}