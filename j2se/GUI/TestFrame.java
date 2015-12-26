/*	范例名称：Frame 应用举例
 * 	源文件名称：TestFrame.java
 *	要  点：Frame组件的创建及显示设置
 */

import java.awt.*;
public class TestFrame {
	public static void main( String args[]) {
		Frame f = new Frame("My First Test");
		f.setLocation(300, 300);
		f.setSize( 170,100);
		f.setBackground( Color.blue);
		f.setResizable(false);
		f.setVisible( true);
	}
}