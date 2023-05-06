package stringBuffer;

/**
 * @Description��StringBuffer���÷��� ������StringBuffer��StringBuilder��ʹ���ϼ���һ��������ֻдһ�� )
 * @author ³����
 * @date 2022/4/21 18:12
 */
public class StringBufferFamly {
  public static void main(String[] args) {

    StringBuffer s = new StringBuffer();
    //������ʼ������StringBuffer������һ���յĶ���
    StringBuffer sb1 = new StringBuffer(512);
    //�����˳���512�ֽڵ��ַ���������
    StringBuffer sb2 = new StringBuffer("how are you?");

    //�����������ݵ�StringBuffer�������ַ��������д���ַ���"how are you?"


    //a��append����
    //�÷�����������׷�����ݵ���ǰStringBuffer�����ĩβ���������ַ��������ӣ����ø÷����Ժ�StringBuffer���������Ҳ������ �䣬���磺
    StringBuffer sb = new StringBuffer("abc");
    sb.append(true);
    //�����sb��ֵ�����"abctrue"
    //ʹ�ø÷��������ַ��������ӣ�����String���ӽ�Լ���ݣ�����Ӧ�������ݿ�SQL�������ӡ�
//    b��deleteCharAt����
//    �÷�����������ɾ��ָ��λ�õ��ַ���Ȼ��ʣ��������γ��µ��ַ��������磺
    StringBuffer sbk = new StringBuffer("KMing");
    sbk.deleteCharAt(1);
    //�ô��������ɾ���ַ�������sb������ֵΪ1���ַ���Ҳ����ɾ���ڶ����ַ���ʣ����������һ���µ��ַ��������Զ���sb��ֵ�� Ϊ "King"��
    //������һ���������Ƶ�delete������
    //�÷�����������ɾ��ָ���������ڵ������ַ�������start��������end����ֵ�����䡣���磺
    StringBuffer sbt = new StringBuffer("TestString");
    sbt.delete(1, 4);
    //�ô����������ɾ������ֵ1(����) ������ֵ4(������) ֮��������ַ���ʣ����ַ��γ��µ��ַ����������sb��ֵ�� "TString"��


    //c��insert����
//    �÷�������������StringBuffer�����в������ݣ�Ȼ���γ��µ��ַ��������磺
    StringBuffer sbs = new StringBuffer("TestString");
    sbs.insert(4, false);
   // ��ʾ��������������ڶ���sb������ֵ4��λ�ò���falseֵ���γ��µ��ַ�������ִ���Ժ����sb��ֵ�� "TestfalseString"��
   // d��reverse����
//    �÷����������ǽ�StringBuffer�����е����ݷ�ת��Ȼ���γ��µ��ַ��������磺
    StringBuffer sba = new StringBuffer("abc");
    sba.reverse();
   // ������ת�Ժ󣬶���sb�е����ݽ���Ϊ "cba"��

   // e��setCharAt����
   // public void setCharAt ( int index, char ch)�÷������������޸Ķ���������ֵΪindexλ�õ��ַ�Ϊ�µ��ַ�ch�����磺
    StringBuffer sbabc = new StringBuffer("abc");
    sbabc.setCharAt(1,'D');
   // �����sb��ֵ����� "aDc"��

    //f��trimToSize����
    //�÷����������ǽ�StringBuffer������д洢�ռ���С�����ַ�������һ���ĳ��ȣ����ٿռ���˷ѣ���String��trim() ��һ�������ã����ھ�����

    //g��length����
    //�÷����������ǻ�ȡ�ַ������� ��������˵�˰ɡ�

    // h��setlength����
    // �÷����������������ַ�����������С��
  /*  StringBuffer sbss = new StringBuffer();
    sbss.setlength(100);*/
    //�����С�ڵ�ǰ�ַ������ȵ�ֵ����setlength() ���������³��Ⱥ�����ַ�����ʧ��

    //i��sb.capacity����
    // �÷����������ǻ�ȡ�ַ�����������
    StringBuffer sbr = new StringBuffer("string");
    int i = sbr.capacity();

    //j��ensureCapacity����
    // �÷��������������������ַ��������Ĵ�С��
    StringBuffer sbe = new StringBuffer();
    sbe.ensureCapacity(32); //Ԥ������sb������Ϊ32


    //k��getChars����
    // �÷����������ǽ��ַ��������ַ������Ƹ����顣
    StringBuffer sbi = new StringBuffer("I love You");
    int begin = 0;
    int end = 5;
//ע��ch�ַ�����ĳ���һ��Ҫ���ڵ���begin��end֮���ַ��ĳ���
//С�ڵĻ��ᱨArrayIndexOutOfBoundsException
//������ڵĻ������ڵ��ַ����Կո���
    char[] ch = new char[end - begin];
    sbi.getChars(begin, end, ch, 0);
    System.out.println(ch);

  }
}
