/*	范例名称：匿名类在事件处理中的使用
 * 	源文件名称：TestAnonymous.java
 *	要  点：
 *  	1. 匿名类的性质和用法
 *		2. 将监听器类定义为匿名类的好处----
 *		   在内部类的基础上进一步简化了代码
 */

import java.awt.*;
import java.awt.event.*;
public class TestAnonymous {
	Frame f = new Frame("匿名内部类测试");
	TextField tf = new TextField(30);
	public TestAnonymous(){
		f.add(new Label("请按下鼠标左键并拖动"), "North");
		f.add(tf, "South");
		f.addMouseMotionListener(
			new MouseMotionAdapter(){
				public void mouseDragged(MouseEvent e) {
			    String s = "鼠标拖动到位置（" + e.getX() + "," + e.getY() + ")";
			    tf.setText(s);
				}	
				public void mouseMoved(MouseEvent e) { }		
			}
			);
		f.setSize(300, 200);	    	
		f.setVisible(true);
	}
	public static void main(String args[]) {   	
		TestAnonymous t = new TestAnonymous();
	}
}