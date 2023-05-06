package sm4;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;

public class Sm4Utils {
  private static final String ENCODING = "UTF-8";
  public static final String ALGORIGTHM_NAME = "SM4";
  public static final String ALGORITHM_NAME_ECB_PADDING = "SM4/ECB/PKCS7Padding";
  public static final int DEFAULT_KEY_SIZE = 128;

  public Sm4Utils() {
  }

  static {
    Security.addProvider(new BouncyCastleProvider());
  }

  /**
   *  @Description:����ecb����
   */
  private static Cipher generateEcbCipher(String algorithmName, int mode, byte[] key) throws Exception {
    Cipher cipher = Cipher.getInstance(algorithmName,BouncyCastleProvider.PROVIDER_NAME);
    Key sm4Key = new SecretKeySpec(key, ALGORIGTHM_NAME);
    cipher.init(mode, sm4Key);
    return cipher;
  }

  /**
   *  @Description:�Զ�������Կ
   */
  public static byte[] generateKey() throws Exception {
    return generateKey(DEFAULT_KEY_SIZE);
  }

  public static byte[] generateKey(int keySize) throws Exception {
    KeyGenerator kg = KeyGenerator.getInstance(ALGORIGTHM_NAME, BouncyCastleProvider.PROVIDER_NAME);
    kg.init(keySize, new SecureRandom());
    return kg.generateKey().getEncoded();
  }


  /**
   *  @Description:����
   */
  public static String encryptEcb(String hexKey, String paramStr, String charset) throws Exception {
    String cipherText = "";
    if (null != paramStr && !"".equals(paramStr)) {
      byte[] keyData = ByteUtils.fromHexString(hexKey);
      charset = charset.trim();
      if (charset.length() <= 0) {
        charset = ENCODING;
      }
      byte[] srcData = paramStr.getBytes(charset);
      byte[] cipherArray = encrypt_Ecb_Padding(keyData, srcData);
      cipherText = ByteUtils.toHexString(cipherArray);
    }
    return cipherText;
  }

  /**
   *  @Description:����ģʽ֮ecb
   */
  public static byte[] encrypt_Ecb_Padding(byte[] key, byte[] data) throws Exception {
    Cipher cipher = generateEcbCipher(ALGORITHM_NAME_ECB_PADDING, Cipher.ENCRYPT_MODE, key);
    byte[] bs = cipher.doFinal(data);
    return bs;
  }

  /**
   *  @Description:sm4����
   */
  public static String decryptEcb(String hexKey, String cipherText, String charset) throws Exception {
    String decryptStr = "";
    byte[] keyData = ByteUtils.fromHexString(hexKey);
    byte[] cipherData = ByteUtils.fromHexString(cipherText);
    byte[] srcData = decrypt_Ecb_Padding(keyData, cipherData);
    charset = charset.trim();
    if (charset.length() <= 0) {
      charset = ENCODING;
    }
    decryptStr = new String(srcData, charset);
    return decryptStr;
  }

  /**
   *  @Description:����
   */
  public static byte[] decrypt_Ecb_Padding(byte[] key, byte[] cipherText) throws Exception {
    Cipher cipher = generateEcbCipher(ALGORITHM_NAME_ECB_PADDING, Cipher.DECRYPT_MODE, key);
    return cipher.doFinal(cipherText);
  }

  /**
   *  @Description:����У��
   */
  public static boolean verifyEcb(String hexKey,String cipherText,String paramStr) throws Exception {
    boolean flag = false;
    byte[] keyData = ByteUtils.fromHexString(hexKey);
    byte[] cipherData = ByteUtils.fromHexString(cipherText);
    byte[] decryptData = decrypt_Ecb_Padding(keyData,cipherData);
    byte[] srcData = paramStr.getBytes(ENCODING);
    flag = Arrays.equals(decryptData,srcData);
    return flag;
  }

  /**
   *  @Description:������
   */
  public static void main(String[] args) {
    try {
      String json = "{\"name\":\"color111\",\"sex\":\"man11\"}";
      // �Զ����32λ16������Կ
      String key = "cc9368581322479ebf3e79348a2757d9";
      System.out.println("--------����Ecb---------");
      String cipher = Sm4Utils.encryptEcb(key, json,ENCODING);
      System.out.println(cipher);

      System.out.println("--------����Ecb---------");
      System.out.println(Sm4Utils.verifyEcb(key, cipher, json));
      String newJson = Sm4Utils.decryptEcb(key, cipher,ENCODING);
      System.out.println(newJson);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
