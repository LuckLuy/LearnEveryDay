package ase;
import com.alibaba.fastjson.JSON;
import org.apache.commons.codec.binary.Base64;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

/**
 * @author ³����
 * @Description��
 * @date 2021/9/28 15:58
 */
public class ASE {
  public static void main(String[] args) throws Exception {
    // aes + base  -->  aes + base
    //String content =   "{\"billNum\":\"6000000011544932\",\"reqSN\":\"088802084564\",\"tranDate\":\"202106\"}";
    String content =   "{\"billNum\":\"851000103\",\"reqSN\":\"088802107736\",\"tranDate\":\"20210430\"}";
    System.out.println("�������ݣ�" + content);
    String key = "OJH78THDQUXBRRAKDEGAYJ80";
    System.out.println("������Կ�ͽ�����Կ��" + key);

    String encrypt = aesEncrypt(content, key);
    System.out.println("���ܺ�" +encrypt);


    String sss ="P2S28g6vXIhrqPnL8D0MMGkT1QIp04dia0LBfcR62rKnId0Dc8RC/MHAXG5eMa8aA4eVd92qxVxFAaDphgBgzABa/X3Vda8Rdwo7Onj4IC";
    // ģ��һ
    String decrypt = aesDecrypt(sss, key);
    System.out.println("���ܺ�" + decrypt);
    //String base64encode = Base64encode(decrypt);


    //ģ���
    System.out.println("ģ���");
    byte[] decrypt2 = aesDecrypt2(encrypt, key);
    String decr =new String(decrypt2);
    System.out.println(decr);
    Invoice jsonObject = JSON.parseObject(decr,Invoice.class);
    System.out.println("ת���ɶ���:" + jsonObject);


    System.out.println("---------------");

  //  String en ="bHM0dUgyMDZsenNTTm55N21FT1pGNmIxYnBtQ0paNFJUUldZVHlxVkcvc0ZFdng1WHZGREx0Zzk4R0ZyblR3eDdUelRiVGEyK0ZyRURmVmRhNndsemNlc0VjQlNQNjMrZnhTY0VFSWRPTnM9";
    String en ="UDJTMjhnNnZYSWhycVBuTDhEME1NR2tUMVFJcDA0ZGlhMExCZmNSNjJyS25JZDBEYzhSQy9NSEFYRzVlTWE4YUE0ZVZkOTJxeFZ4RkFhRHBoZ0JnekFCYS9YM1ZkYThSZHdvN09uajRJQw==";
    byte[] bytes = Base64decode(en);
    String decr222 =new String(bytes);
    System.out.println("���ܺ�" + decr222);






  }

  /**
   * ����
   * @param bstr
   * @return String
   */
  public static String Base64encode(byte[] bstr) {
    return Base64.encodeBase64String(bstr);
  }

  /**
   * ����
   * @param str
   * @return string
   */
  public static byte[] Base64decode(String str) {
    return Base64.decodeBase64(str);
  }

  /*
   * AES����
   * @param content �����ܵ�����
   * @param encryptKey ������Կ
   * @return ���ܺ��byte[]
   * @throws Exception
   */
  public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
    KeyGenerator kgen = KeyGenerator.getInstance("AES");
    /*��ֹlinux�� �������key*/
    SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
    random.setSeed(encryptKey.getBytes());
    kgen.init(128, random);
    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
    cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(kgen.generateKey().getEncoded(), "AES"));

    return cipher.doFinal(content.getBytes("UTF-8"));
  }

  /**
   * AES����Ϊbase 64 code
   * @param content �����ܵ�����
   * @param encryptKey ������Կ
   * @return ���ܺ��base 64 code
   * @throws Exception
   */
  public static String aesEncrypt(String content, String encryptKey) throws Exception {
    return Base64encode(aesEncryptToBytes(content, encryptKey));
  }

  /**
   * AES����
   * @param encryptBytes �����ܵ�byte[]
   * @param decryptKey ������Կ
   * @return ���ܺ��String
   * @throws Exception
   */
  public static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) {
    byte[] decryptBytes = new byte[0];
    try {
      KeyGenerator kgen = KeyGenerator.getInstance("AES");
      /*��ֹlinux�� �������key*/
      SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
      random.setSeed(decryptKey.getBytes());
      kgen.init(128, random);
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(kgen.generateKey().getEncoded(), "AES"));
      decryptBytes = cipher.doFinal(encryptBytes);
      return new String(decryptBytes,"UTF-8");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return decryptKey;

  }
  public static  byte[] aesDecryptByBytes2(byte[] encryptBytes, String decryptKey) {
    byte[] decryptBytes = new byte[0];
    try {
      KeyGenerator kgen = KeyGenerator.getInstance("AES");
      /*��ֹlinux�� �������key*/
      SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
      random.setSeed(decryptKey.getBytes());
      kgen.init(128, random);
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(kgen.generateKey().getEncoded(), "AES"));
      return cipher.doFinal(encryptBytes);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;

  }


  /**
   * ��base 64 code AES����
   * @param encryptStr �����ܵ�base 64 code
   * @param decryptKey ������Կ
   * @return ���ܺ��string
   * @throws Exception
   */
  public static String aesDecrypt(String encryptStr, String decryptKey){
    return aesDecryptByBytes(Base64decode(encryptStr), decryptKey);
  }

  public static byte[] aesDecrypt2(String encrypt, String key){
    return aesDecryptByBytes2(Base64decode(encrypt), key);
  }

}
