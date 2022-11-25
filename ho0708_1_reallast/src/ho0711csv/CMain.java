
package ho0711csv;

public class CMain {
	public static void main(String[] args) {
		CSVV v = new CSVV();
		v.print(CSVM.getM().selectData());
	}
}
