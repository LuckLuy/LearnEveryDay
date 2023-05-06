package ase;
import com.alibaba.fastjson.JSON;
import org.apache.commons.codec.binary.Base64;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

/**
 * @author 鲁先生
 * @Description：
 * @date 2021/9/28 15:58
 */
public class ASE {
  public static void main(String[] args) throws Exception {
    // aes + base  -->  aes + base
    //String content =   "{\"billNum\":\"6000000011544932\",\"reqSN\":\"088802084564\",\"tranDate\":\"202106\"}";
    String content =   "{\"billNum\":\"851000103\",\"reqSN\":\"088802107736\",\"tranDate\":\"20210430\"}";
    System.out.println("加密内容：" + content);
    String key = "OJH78THDQUXBRRAKDEGAYJ80";
    System.out.println("加密密钥和解密密钥：" + key);

    String encrypt = aesEncrypt(content, key);
    System.out.println("加密后：" +encrypt);


    String sss ="P2S28g6vXIhrqPnL8D0MMGkT1QIp04dia0LBfcR62rKnId0Dc8RC/MHAXG5eMa8aA4eVd92qxVxFAaDphgBgzABa/X3Vda8Rdwo7Onj4IC";
    // 模板一
    String decrypt = aesDecrypt(sss, key);
    System.out.println("解密后：" + decrypt);
    //String base64encode = Base64encode(decrypt);


    //模板二
    System.out.println("模板二");
    byte[] decrypt2 = aesDecrypt2(encrypt, key);
    String decr =new String(decrypt2);
    System.out.println(decr);
    Invoice jsonObject = JSON.parseObject(decr,Invoice.class);
    System.out.println("转换成对象:" + jsonObject);


    System.out.println("---------------");

  //  String en ="bHM0dUgyMDZsenNTTm55N21FT1pGNmIxYnBtQ0paNFJUUldZVHlxVkcvc0ZFdng1WHZGREx0Zzk4R0ZyblR3eDdUelRiVGEyK0ZyRURmVmRhNndsemNlc0VjQlNQNjMrZnhTY0VFSWRPTnM9";
    String en ="UDJTMjhnNnZYSWhycVBuTDhEME1NR2tUMVFJcDA0ZGlhMExCZmNSNjJyS25JZDBEYzhSQy9NSEFYRzVlTWE4YUE0ZVZkOTJxeFZ4RkFhRHBoZ0JnekFCYS9YM1ZkYThSZHdvN09uajRJQw==";
    byte[] bytes = Base64decode(en);
    String decr222 =new String(bytes);
    System.out.println("解密后：" + decr222);






  }

  /**
   * 编码
   * @param bstr
   * @return String
   */
  public static String Base64encode(byte[] bstr) {
    return Base64.encodeBase64String(bstr);
  }

  /**
   * 解码
   * @param str
   * @return string
   */
  public static byte[] Base64decode(String str) {
    return Base64.decodeBase64(str);
  }

  /*
   * AES加密
   * @param content 待加密的内容
   * @param encryptKey 加密密钥
   * @return 加密后的byte[]
   * @throws Exception
   */
  public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
    KeyGenerator kgen = KeyGenerator.getInstance("AES");
    /*防止linux下 随机生成key*/
    SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
    random.setSeed(encryptKey.getBytes());
    kgen.init(128, random);
    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
    cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(kgen.generateKey().getEncoded(), "AES"));

    return cipher.doFinal(content.getBytes("UTF-8"));
  }

  /**
   * AES加密为base 64 code
   * @param content 待加密的内容
   * @param encryptKey 加密密钥
   * @return 加密后的base 64 code
   * @throws Exception
   */
  public static String aesEncrypt(String content, String encryptKey) throws Exception {
    return Base64encode(aesEncryptToBytes(content, encryptKey));
  }

  /**
   * AES解密
   * @param encryptBytes 待解密的byte[]
   * @param decryptKey 解密密钥
   * @return 解密后的String
   * @throws Exception
   */
  public static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) {
    byte[] decryptBytes = new byte[0];
    try {
      KeyGenerator kgen = KeyGenerator.getInstance("AES");
      /*防止linux下 随机生成key*/
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
      /*防止linux下 随机生成key*/
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
   * 将base 64 code AES解密
   * @param encryptStr 待解密的base 64 code
   * @param decryptKey 解密密钥
   * @return 解密后的string
   * @throws Exception
   */
  public static String aesDecrypt(String encryptStr, String decryptKey){
    return aesDecryptByBytes(Base64decode(encryptStr), decryptKey);
  }

  public static byte[] aesDecrypt2(String encrypt, String key){
    return aesDecryptByBytes2(Base64decode(encrypt), key);
  }

}
