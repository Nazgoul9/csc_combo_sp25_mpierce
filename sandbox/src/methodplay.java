
import java.awt.PointerInfo;
import java.awt.MouseInfo;
import java.awt.Point;

public class methodplay {

	public static void main(String[] args) {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		int x = (int) b.getX();
		int y = (int) b.getY();
		System.out.print("Y: "+y);
		System.out.print("X: "+x+"\n");
	}
	
}
//	}
//	
//	public static int
//	
//	public static double dollarval(x)
//	{
//		double x;
//		
//		return x
//	
//	}
//
//}
