public class ExtractDigit{
public static void main(String args[]){
String s = "qwerty143";
for(int i=0;i<s.length();i++)
{
   if(Character.isDigit(s.charAt(i)))
   System.out.print(s.charAt(i)+"");
}

}
}