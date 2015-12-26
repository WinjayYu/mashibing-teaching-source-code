public class TestConvert {
    public static void main(String arg[]) {
        int i1 = 123; 
        int i2 = 456;
        double d1 = (i1+i2)*1.2;//系统将转换为double型运算
        float f1 = (float)((i1+i2)*1.2);//需要加强制转换符
        byte b1 = 67; 
        byte b2 = 89;
        byte b3 = (byte)(b1+b2);//系统将转换为int型运算，需
                                //要强制转换符
        System.out.println(b3);
        double d2 = 1e200;
        float f2 = (float)d2;//会产生溢出
        System.out.println(f2);

        float f3 = 1.23f;//必须加f
        long l1 = 123;
        long l2 = 30000000000L;//必须加l
        float f = l1+l2+f3;//系统将转换为float型计算
        long l = (long)f;//强制转换会舍去小数部分（不是四舍五入）

    }
}
