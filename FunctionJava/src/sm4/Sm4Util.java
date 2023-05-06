package sm4;


import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Security;

  /**
   * ����sm4�ӽ���
   */
  public class Sm4Util {
    public enum Algorithm {

      SM4("SM4","SM4","key���ȣ�16 byte");

      private String keyAlgorithm;
      private String transformation;
      private String description;//����
      Algorithm(String keyAlgorithm, String transformation, String description) {
        this.keyAlgorithm = keyAlgorithm;
        this.transformation = transformation;
        this.description = description;
      }
      public String getKeyAlgorithm() {
        return this.keyAlgorithm;
      }
      public String getTransformation() {
        return this.transformation;
      }
      public String getDescription() {
        return this.description;
      }
    }

    private static final String PROVIDER_NAME = "BC";//BouncyCastleProvider������
    static {
      Security.addProvider(new BouncyCastleProvider());
    }


    /**
     * �Զ��ַ���������Կ
     * @param algorithm �ӽ����㷨
     * @param keyStr ��Կ�ַ���
     * @param charset �����ַ���
     * @return ��Կ
     */
    public static SecretKey genKeyByStr(Algorithm algorithm, String keyStr, Charset charset) {
      return readKeyFromBytes(algorithm, keyStr.getBytes(charset));
    }

    /**
     * ����ָ���ֽ����������Կ
     * @param algorithm �ӽ����㷨
     * @param keyBytes ��Կ�ֽ�����
     * @return ��Կ
     */
    public static SecretKey readKeyFromBytes(Sm4Util.Algorithm algorithm, byte[] keyBytes) {
      return new SecretKeySpec(keyBytes, algorithm.getKeyAlgorithm());
    }

    /****************************����*********************************/
    /**
     * �����ַ�����������base64����
     * @param algorithm �ӽ����㷨
     * @param key ��Կ
     * @param data ����
     * @param charset �����ַ���
     * @return ����
     * @throws InvalidKeyException ��Կ����
     */
    public static String encryptBase64(Sm4Util.Algorithm algorithm, SecretKey key, String data, Charset charset) throws InvalidKeyException {
      return Base64.encodeBase64String(encrypt(algorithm, key, data.getBytes(charset)));
    }

    /**
     * �����ֽ�����
     * @param algorithm �ӽ����㷨
     * @param key ��Կ
     * @param data ����
     * @return ����
     * @throws InvalidKeyException ��Կ����
     */
    public static byte[] encrypt(Sm4Util.Algorithm algorithm, SecretKey key, byte[] data) throws InvalidKeyException {
      try {
        return cipherDoFinal(algorithm, Cipher.ENCRYPT_MODE, key, data);
      } catch (BadPaddingException e) {
        throw new RuntimeException(e);//����û�о����ʽҪ�󣬲��������������쳣����Ҫ�ⲿ����
      }
    }

    /**
     * �ӽ����ֽ�����
     * @param algorithm �ӽ����㷨
     * @param opmode ������1���ܣ�2����
     * @param key ��Կ
     * @param data ����
     * @throws InvalidKeyException ��Կ����
     * @throws BadPaddingException �������Ĵ���(����ģʽû��)
     */
    private static byte[] cipherDoFinal(Sm4Util.Algorithm algorithm, int opmode, SecretKey key, byte[] data) throws InvalidKeyException, BadPaddingException {
      Cipher cipher;
      try {
        cipher = Cipher.getInstance(algorithm.getTransformation(), PROVIDER_NAME);
      } catch (Exception e) {
        //NoSuchAlgorithmException�������㷨���Ǳ��������ṩ�ģ��������ҵ��û�а취������������쳣����Ҫ�ⲿ����
        //NoSuchProviderException��Provider�Ǳ��������ṩ�ģ��������ҵ��û�а취������������쳣����Ҫ�ⲿ����
        //NoSuchPaddingException��û���ض��������ƣ��뻷���йأ�ҵ��û�а취������������쳣����Ҫ�ⲿ����
        throw new RuntimeException(e);
      }
      cipher.init(opmode, key);
      try {
        return cipher.doFinal(data);
      } catch (IllegalBlockSizeException e) {
        throw new RuntimeException(e);//ҵ����Ҫ�����ݷֿ�(�����ɵײ㴦����)���������ҵ��û�а취������������쳣����Ҫ�ⲿ����
      }
    }

    /****************************����*********************************/
    /**
     * ���ַ����Ƚ���base64���룬�ٽ���
     * @param algorithm �ӽ����㷨
     * @param key ��Կ
     * @param data ����
     * @param charset �����ַ���
     * @return ����
     * @throws InvalidKeyException ��Կ����
     * @throws BadPaddingException ���Ĵ���
     */
    public static String decryptBase64(Sm4Util.Algorithm algorithm, SecretKey key, String data, Charset charset)
        throws InvalidKeyException, BadPaddingException {
      return new String(decrypt(algorithm, key, Base64.decodeBase64(data)), charset);
    }

    /**
     * �����ֽ�����
     * @param algorithm �ӽ����㷨
     * @param key ��Կ
     * @param data ����
     * @return ����
     * @throws InvalidKeyException ��Կ����
     * @throws BadPaddingException ���Ĵ���
     */
    public static byte[] decrypt(Sm4Util.Algorithm algorithm, SecretKey key, byte[] data) throws InvalidKeyException, BadPaddingException {
      return cipherDoFinal(algorithm, Cipher.DECRYPT_MODE, key, data);
    }



  }

