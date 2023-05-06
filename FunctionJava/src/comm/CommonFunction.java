package comm;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author ³����
 * @Description��
 * @date 2021/9/15 9:59
 */
public class CommonFunction {
  /**
   * description:����һ��System.out.println�Ŀ�����������ϰ�ߣ�
   **/
  private static int objectNullSystemOutFlag = 0;


  /**
   * @description �� �жϵ�ǰ�����Ƿ�Ϊ�գ�������������Ϊ�գ�,
   *                  ����ֵΪnull ʱ������true��
   *                  �������ĳЩ����ֵΪ "" �� ��ֵ ʱ������false��
   * @author ³����
   * @date 2021/9/15 10:39
   * @param  object �����
   * @return
   */
  public static boolean objCheckIsNull(Object object) {
    if (object == null) {
      return true;
    }
    // �õ������
    Class clazz = object.getClass();
    // �õ���������
    Field[] fields = clazz.getDeclaredFields();
    //���巵�ؽ����Ĭ��Ϊtrue
    boolean flag = true;
    for (Field field : fields) {
      //����Ȩ�ޣ�����Ҫ�������ȡ����private�����ԣ����˽��ͬѧ��ϰһ�·���֪ʶ��
      field.setAccessible(true);
      Object fieldValue = null;
      String fieldName = null;
      try {
        //�õ�����ֵ
        fieldValue = field.get(object);
        //�õ���������
        Type fieldType = field.getGenericType();
        //�õ�������
        fieldName = field.getName();
        //��ӡ���(�����ÿɺ���)
        if (objectNullSystemOutFlag == 1) {
          System.out.println("�������ͣ�" + fieldType + ",��������" + fieldName + ",����ֵ��" + fieldValue);
        }
      } catch (IllegalArgumentException | IllegalAccessException e) {
        e.printStackTrace();
      }
      //ֻҪ��һ������ֵ��Ϊnull �ͷ���false ��ʾ����Ϊnull �������л�
      if (fieldValue != null && !"serialVersionUID".equals(fieldName)) {
        flag = false;
        break;
      }
 }
    return flag;
  }






  /**
   * description:�жϵ�ǰ�����Ƿ�Ϊ�գ�������������Ϊ�գ�
   *              ��ѡ�����жϹ������޳�ĳһ�ֶΣ�����ĳһֵ
   * @author ³����
   * @date 2021/9/15 10:39
   * @param  object �����
   * @param excludeNameList Ҫ�޳�����������,û�оʹ��ռ��ϻ���null
   * @param excludeValueList Ҫ�޳�����ֵ,û�оʹ��ռ��ϻ���null
   * @return
   **/
  public static boolean objCheckIsNull(Object object, List<String> excludeNameList, List<Object> excludeValueList) {
    if (object == null) {
      return true;
    }
    // �õ������
    Class clazz = object.getClass();
    // �õ���������
    Field[] fields = clazz.getDeclaredFields();
    //�ж����
    boolean excludeNameListFlag = false;
    if (excludeNameList != null && excludeNameList.size() > 0) {
      excludeNameListFlag = true;
    }
    boolean excludeValueListFlag = false;
    if (excludeValueList != null && excludeValueList.size() > 0) {
      excludeValueListFlag = true;
    }
    //���巵�ؽ����Ĭ��Ϊtrue
    boolean flag = true;
    for (Field field : fields) {
      field.setAccessible(true);
      Object fieldValue = null;
      String fieldName = null;
      try {
        //�õ�����ֵ
        fieldValue = field.get(object);
        //�õ���������
        Type fieldType = field.getGenericType();
        //�õ�������
        fieldName = field.getName();
        //�޳�ָ��������������ֵ
        if (excludeNameListFlag) {
          for (String s : excludeNameList) {
            if (fieldName.equals(s)) {
              fieldValue = null;
              break;
            }
          }
        }
        //�޳�ָ������ֵ
        if (excludeValueListFlag) {
          for (Object obj : excludeValueList) {
            if (obj.equals(fieldValue)) {
              fieldValue = null;
              break;
            }
          }
        }
        //��ӡ���(�����ÿɺ���)
        if (objectNullSystemOutFlag == 1) {
          System.out.println("�������ͣ�" + fieldType + ",��������" + fieldName + ",����ֵ��" + fieldValue);
        }
      } catch (IllegalArgumentException | IllegalAccessException e) {
        e.printStackTrace();
      }
      //ֻҪ��һ������ֵ��Ϊnull �ͷ���false ��ʾ����Ϊnull �������л�
      if (fieldValue != null && !"serialVersionUID".equals(fieldName)) {
        flag = false;
        break;
      }
    }
    //��ӡ���(�����ÿɺ���)
    if (objectNullSystemOutFlag == 1) {
      System.out.println("��������: " + excludeNameList + " ����ֵ: " + excludeValueList);
    }
    return flag;
  }

}
