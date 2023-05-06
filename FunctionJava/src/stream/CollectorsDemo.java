package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author ³����
 * @Description��
 * @date 2021/6/2 14:07
 */
public class CollectorsDemo {
  /**
   * @param
   * @return
   * @description �� Stream API��JDK8����ӵĴ����ϵĹؼ�������ṩ�˶��ֵĺ���ʽ������
   * ����ȫ�µ�Stream API���������Stream��I/O����ͬ�����������Iterable�ļ����࣬����Ϊ�ͼ�������������ͬ��
   * Stream�ǶԼ��϶����ܵ���ǿ����רע�ڶԼ��϶�����и��ַǳ���������Ч�ľۺϲ��������ߴ��������ݲ�����
   * ֻҪ������Ҫ���������Ԫ��ִ��ʲô���������硰���˵����ȴ���10���ַ�����������ȡÿ���ַ���������ĸ���ȣ�Stream����ʽ�����ڲ����б�����������Ӧ������ת����
   * Java�й�List��stream��������
   * Streamʹ��һ��������SQL�������ݿ��ѯ���ݵ�ֱ�۷�ʽ���ṩһ�ֶ�Java��������ͱ��ĸ߽׳���
   * ���ַ��Ҫ�����Ԫ�ؼ��Ͽ���һ���������ڹܵ��д��䣬���ҿ����ڹܵ��Ľڵ��Ͻ��д�������ɸѡ�����򡢾ۺϵȡ�
   * ����ǰ��collection������ͬ��Stream������������������������
   * Pipelining:�м�������᷵������������������������Դ�����һ���ܵ�����ͬ��ʽ������������ԶԲ��������Ż��������ӳ�ִ�кͶ�·��
   * �ڲ���������ǰ�Լ��ϱ�������ͨ��Iterator����ForEach�ķ�ʽ����ʾ���ڼ����ⲿ���е�����������ⲿ������Stream�ṩ���ڲ������ķ�ʽ��ͨ��������ģʽʵ�֡�
   * һЩ������
   * stream()��Ϊ���ϴ�����������
   * parallelStream(),Ϊ���ϴ������������������д������Ĵ��淽����
   * forEach(),Stream�ṩ���µķ������������е�ÿ�����ݡ�
   * map(),��������ӳ��ÿ��Ԫ�ص���Ӧ�Ľ����map(i -> i*i)�����е�ÿ��Ԫ�ر�Ϊƽ��
   * filter(),��������ͨ�����õ��������˳�Ԫ�أ�filter(string -> string.isEmpty()) ���˳����ַ�����
   * limit(),�������ڻ�ȡָ������������limit(10) ��ȡ10������
   * sorted(),�������ڶ�����������
   * collect(Collectors.toList()),���ڷ����б���ַ�����Collectors.joining(",");������ת���ɶ��Ÿ������ַ���
   * @author ³����
   * @date 2022/3/3 16:06
   */
  //Collectors ��ʵ���˺ܶ��Լ���������罫��ת���ɼ��Ϻ;ۺ�Ԫ�ء�
  // Collectors �����ڷ����б���ַ�����
  public static void main(String[] args) {

    // �����б�
    List<String> stringList = Arrays.asList("abc", "as", "", "fff", "sdfg", "qwe");
    List<String> collect = stringList.stream().filter(s -> !s.isEmpty()).collect(java.util.stream.Collectors.toList());
    System.out.println("ɸѡ������" + collect);
    // �����ַ���
    String mergedString = stringList.stream().filter(s -> !s.isEmpty()).collect(java.util.stream.Collectors.joining(", "));
    System.out.println("�ϲ��ַ�����" + mergedString);
  }
}
