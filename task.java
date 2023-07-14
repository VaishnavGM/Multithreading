package Stringnew;
import java.util.Scanner;
public class task {

	public static void main(String[] args) {
Scanner Scan = new Scanner(System.in);
System.out.println("enter the string");
String s = Scan.nextLine();
StringBuilder n = new StringBuilder();
Scan.close();
for(int i=0;i<s.length();i++)
{
	if(i%2==0)
	{
        n.append(Character.toUpperCase(s.charAt(i)));
		}
	else
	{
        n.append(Character.toLowerCase(s.charAt(i)));
	}
	}
System.out.println(n);

	}}
