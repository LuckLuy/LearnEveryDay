package string;
/**
 * 由于String的设计不适合频繁修改，对此java提供了一个
 * 用于编辑字符串内容的类：stringBuilder
 * StringBuilder内部维护了一个可变的字符数组，不会每次修改都来
 * 创建新对象，从而降低资源开销，提高执行效率
 * 其提供了方便编辑字符串内容的相关方法，包含：
 * 增，删，改，插等常见操作。
 *
 */
public class StringBuilderDemo {
  public static void main(String[] args) {
    String str = "好好学习java";


    StringBuilder builder =new StringBuilder(str);
    // 默认添加最后的位置
    builder.append(",为了找工作。");
    System.out.println(builder.toString());

    // 替换起始位置和结束位置的 内容。
    builder.replace(9,28,"为了高新就业。");
    System.out.println(builder);

    // 删除 起始坐标 ，结束坐标
    builder.delete(9,28);
    System.out.println(builder.toString());

    //	 insert（）：在当前字符串中插入指定内容
    builder.insert(0,"加油。");
    System.out.println(builder);
  }
}
