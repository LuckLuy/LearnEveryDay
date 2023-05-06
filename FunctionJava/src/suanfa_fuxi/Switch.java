package suanfa_fuxi;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println(getValue(scan.nextInt()));

}
public static int getValue(int num) {
	int result =10;
	switch(num) {
	case 1:
		result+=1;
		break;
	case 2:
		result=result+2;
		break;
	case 3:
		result+=3;
		break;
	}
	return result;
}
}
