public class TestConvert {
    public static void main(String arg[]) {
        int i1 = 123; 
        int i2 = 456;
        double d1 = (i1+i2)*1.2;//ϵͳ��ת��Ϊdouble������
        float f1 = (float)((i1+i2)*1.2);//��Ҫ��ǿ��ת����
        byte b1 = 67; 
        byte b2 = 89;
        byte b3 = (byte)(b1+b2);//ϵͳ��ת��Ϊint�����㣬��
                                //Ҫǿ��ת����
        System.out.println(b3);
        double d2 = 1e200;
        float f2 = (float)d2;//��������
        System.out.println(f2);

        float f3 = 1.23f;//�����f
        long l1 = 123;
        long l2 = 30000000000L;//�����l
        float f = l1+l2+f3;//ϵͳ��ת��Ϊfloat�ͼ���
        long l = (long)f;//ǿ��ת������ȥС�����֣������������룩

    }
}
