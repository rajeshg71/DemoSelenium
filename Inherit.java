class parent{
public void m1(){System.out.println("this is m1 method of parent");}
}
class child extends parent{
public void m1(){System.out.println("this is m1 method of child ");}
}
public class Inherit{
public static void main(String args[]){
parent p = new parent();
parent p1 = new child();
p.m1();
p1.m1();

}
}