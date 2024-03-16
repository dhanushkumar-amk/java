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