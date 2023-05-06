package hutool_family;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.HMac;
import cn.hutool.crypto.digest.MD5;
import cn.hutool.crypto.symmetric.AES;
import org.apache.commons.lang3.StringUtils;

/**
 * @author ³����
 * @Description�����ܽ���
 * @date 2021/12/16 15:58
 */
public class SecureUtil_demo {
  private static AES aes = SecureUtil.aes();
  private static MD5 md5 = SecureUtil.md5();

  public static void main(String[] args) {
    /**
     * @description �� ���ܷ�Ϊ���֣�
     *
     * �ԳƼ��ܣ�symmetric�������磺AES��DES ��
     * �ǶԳƼ��ܣ�asymmetric�������磺RSA��DSA ��
     * ժҪ���ܣ�digest�������磺MD5��SHA-1��SHA-256��HMAC ��
     * @author ³����
     * @date 2021/12/16 15:59
     * @param [args]
     * @return void
     */
    //Hutool �����������������˷�װ��
    //
    //�ԳƼ��� SymmetricCrypto
    //�ǶԳƼ��� AsymmetricCrypto
    //ժҪ���� Digester
    //���ټ��ܹ����� SecureUtil ��������Щ������
    //
    //1���ԳƼ���
    //
    //SecureUtil.aes
    //SecureUtil.des
    //2���ǶԳƼ���
    //
    //SecureUtil.rsa
    //SecureUtil.dsa
    //3��ժҪ����
    //
    //SecureUtil.md5
    //SecureUtil.sha1
    //SecureUtil.hmac
    //SecureUtil.hmacMd5
    //SecureUtil.hmacSha1


    String encry = aes.encryptHex("��Ĭ����");
    System.out.println(encry);
    String oo = aes.decryptStr(encry);
    System.out.println(oo);


    System.out.println(md5);
    String str ="45e2967105fab20755f80e09cacd17be";
    System.out.println(str.length());

    String str333 ="  ";
    System.out.println("sada s "+StringUtils.isBlank(str333));

    String str33="  1";
    System.out.println("trim "+StringUtils.isNotBlank(str33)+ str33.trim());

  }
}
