/*	范例名称：匿名类在事件处理中的使用
 * 	源文件名称：TestAnonymous2.java
 *	要  点：
 *		1. 匿名类只能是内部类
 *		2. 匿名类的两种创建方式----既可以继承父类、也可以单重实现接口
 */

import java.awt.*;
import java.awt.event.*;

public class TestAnonymous2 {
	Frame f = new Frame("Test");
	TextField tf = new TextField(10);
	Button b1 = new Button("Start");
	
	public TestAnonymous2(){
		f.add(b1,"North");
		f.add(tf,"South");
		
		b1.addActionListener(new ActionListener(){
			private int i;
			public void actionPerformed(ActionEvent e) {
			 	tf.setText(e.getActionCommand() + ++i);    
			}
		});
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});
		
		f.pack();        	
		f.setVisible(true);		
	}	
	public static void main(String args[]) {
		new TestAnonymous2();
	}
}
