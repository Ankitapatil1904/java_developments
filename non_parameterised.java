class non{
    public static void main(string[]args){
        employee e1=new employee();
        System.out.println("default details:");
        e1.showPerson();
        e1.showEmployee();
        e1.name="ankita";
        e1.age=21;
        e1.post="JE";
        e1.ctc=15.4f;
        System.out.println("after setting new values:");
        e1.showPerson();
        e1.showEmployee();
    }
}
class person{
    string name;
    int age;
    void showPerson(){
        System.out.println("the name of person is:"+name+"age is"+age);
    }
}
class employee extends person{
    string post;
    float ctc;
employee()
{
    name="na";
    ctc=0.0f;
    System.out.println("constructored the employee ,subclass invoked");
}
void showEmployee(){
    System.out.println("post:"+post+"annual ctc:"+ctc);
}
}
