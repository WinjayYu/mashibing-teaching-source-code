/*	范例名称：Panel应用举例
 * 	源文件名称：TestFrameWithPanel.java
 *	要  点：
 *		1. Panel组件的性质
 *		2. 容器和组件的概念
 *		3. setSize，setBackground，setLayout，add，setVisible等常用方法
 */

import java.awt.*;

public class TestFrameWithPanel {
	public static void main(String args[]) {
		Frame f = new Frame("MyTest Frame");
		Panel pan = new Panel();
		f.setSize(200,200);
		f.setBackground(Color.blue);
		f.setLayout(null); // 取消默认布局管理器
		pan.setSize(100,100);
		pan.setBackground(Color.green);
		f.add(pan);
		f.setVisible(true);
	}
}