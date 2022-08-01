class Reverse{
public static void main(String args[]){
String orig = "india is my contry";
String reverse = "";
int len = orig.length();
for(int i = len-1;i>=0;i--){
	reverse = reverse+orig.charAt(i);
}
System.out.println(reverse);
}
}