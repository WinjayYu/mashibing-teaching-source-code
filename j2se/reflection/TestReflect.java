import java.lang.reflect.*;

public class TestReflect {
	public static void main(String[] args) throws Exception {
		//m1();
		//m2();
		//m3("java.lang.Thread");
		//m4();
		//m5();
		//m6();
		//String s = "java.lang.String"; //���ļ����������
		//new s() 
		//m7();
		//m8();
		//m9();
		m10();
	}
	
	private static void m1() {
		String s = new String();
		Class c = s.getClass();
		System.out.println(c);
		Class su = c.getSuperclass();
		System.out.println(su);
		System.out.println(su.getSuperclass());
	}
	
	private static void m2() {
		Class c = String.class;
		System.out.println(c);
	}
	
	private static void m3(String className) {
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			System.out.println("this class doesn't exist!");
		}
	}
	
	private static void m4() {
		int m = String.class.getModifiers();
		System.out.println(Modifier.isPublic(m));
		System.out.println(Modifier.isFinal(m));
		System.out.println(Modifier.isStatic(m));
	}
	
	private static void m5() {
		for(Class c : String.class.getInterfaces()) {
			System.out.println(c);
		}
		System.out.println(java.lang.Comparable.class.isInterface());
	}
	
	private static void m6() {
		Field[] fs = System.class.getFields();
		for(Field f : fs) {
			System.out.println(f);
		}
	}
	
	private static void m7() throws Exception {
		Constructor[] cs = String.class.getConstructors();
		for(Constructor c : cs) {
			System.out.println(c);
			for(Class paraClass : c.getParameterTypes()) {
				System.out.print(paraClass + " ");
			}
			System.out.println();
		}
		
		String.class.newInstance();
	}
	
	private static void m8() throws Exception {
		
		Class[] argClasses = new Class[] {int.class, int.class};
		Object[] args = new Object[] {new Integer(12), new Integer(24)};
		Constructor c = java.awt.Point.class.getConstructor(argClasses);
		Object o = c.newInstance(args);
		System.out.println(o);
		
	}
	
	private static void m9() throws Exception {
		Class[] argClasses = new Class[] {String.class};
		Object[] args = new Object[] {new String("world!")};
		Method m = java.lang.String.class.getMethod("concat", argClasses);
		String result = (String)m.invoke(new String("hello"), args);
		System.out.println(result);
	}
	
	private static void m10() throws Exception {
		/*
		Class cls = Class.forName("java.lang.String");
		Object arr = Array.newInstance(cls, 10);
		Array.set(arr, 5, "this is a test");
		String s = (String)Array.get(arr, 5);
		System.out.println(s);
		*/
		
		//���д�����һ�� 5 x 10 x 15 ���������飬��Ϊ���� [3][5][10] ��Ԫ�ظ���ֵΪ 37��
		//ע�⣬��ά����ʵ���Ͼ�����������飬���磬��һ�� Array.get ֮��
		//arrobj ��һ�� 10 x 15 �����顣����ȡ�����е�һ��Ԫ�أ�������Ϊ 15 �����飬
		//��ʹ�� Array.setInt Ϊ���ĵ� 10 ��Ԫ�ظ�ֵ��
		
		int dims[] = new int[]{5, 10, 15};
    Object arr = Array.newInstance(Integer.TYPE, dims);
    Object arrobj = Array.get(arr, 3);
    Class cls = arrobj.getClass().getComponentType();
    System.out.println(cls);
    arrobj = Array.get(arrobj, 5);
    Array.setInt(arrobj, 10, 37);
    int arrcast[][][] = (int[][][]) arr;
    System.out.println(arrcast[3][5][10]);

	}
}