package string;
/**
 * ����String����Ʋ��ʺ�Ƶ���޸ģ��Դ�java�ṩ��һ��
 * ���ڱ༭�ַ������ݵ��ࣺstringBuilder
 * StringBuilder�ڲ�ά����һ���ɱ���ַ����飬����ÿ���޸Ķ���
 * �����¶��󣬴Ӷ�������Դ���������ִ��Ч��
 * ���ṩ�˷���༭�ַ������ݵ���ط�����������
 * ����ɾ���ģ���ȳ���������
 *
 */
public class StringBuilderDemo {
  public static void main(String[] args) {
    String str = "�ú�ѧϰjava";


    StringBuilder builder =new StringBuilder(str);
    // Ĭ���������λ��
    builder.append(",Ϊ���ҹ�����");
    System.out.println(builder.toString());

    // �滻��ʼλ�úͽ���λ�õ� ���ݡ�
    builder.replace(9,28,"Ϊ�˸��¾�ҵ��");
    System.out.println(builder);

    // ɾ�� ��ʼ���� ����������
    builder.delete(9,28);
    System.out.println(builder.toString());

    //	 insert�������ڵ�ǰ�ַ����в���ָ������
    builder.insert(0,"���͡�");
    System.out.println(builder);
  }
}
