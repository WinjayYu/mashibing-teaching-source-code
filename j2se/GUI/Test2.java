//如何实例化其他类中的内部类

public class Test2 {
	public static void main(String[] args) {
		TFMath tfm = new TFMath();
		TFMath.MyListener t = tfm.new MyListener();
	}
}