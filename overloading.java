class overloading
{
    void sum(int a,int b)
    {
        System.out.println(a + b);
    }
    void sum(int a, int b, int c)
    {
        System.out.println(a + b + c);

    }

    public static void main(String args[])
    {
        overloading result = new overloading();

        result.sum(20,30);
        result.sum(20,30,50);
        
    }
}


//