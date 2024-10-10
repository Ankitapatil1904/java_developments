package mypackage;
class packagedemo1{
    public static void main(string args[])
    {
        rectangle obj=new rectangle();
        obj.showdata(3,8);
        obj.area();
    }
} 
class rectangle{
    float l,b;
    void showdata(float len,float br)
    {
        l=len;
        b=br;

    }
    void area()
    {    System.out.println("len:"+l+"breadth:"+b);
        System.out.println("area is:"+(l*b));
    }
}
