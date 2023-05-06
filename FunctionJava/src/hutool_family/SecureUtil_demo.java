package hutool_family;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.HMac;
import cn.hutool.crypto.digest.MD5;
import cn.hutool.crypto.symmetric.AES;
import org.apache.commons.lang3.StringUtils;

/**
 * @author 鲁先生
 * @Description：加密解密
 * @date 2021/12/16 15:58
 */
public class SecureUtil_demo {
  private static AES aes = SecureUtil.aes();
  private static MD5 md5 = SecureUtil.md5();

  public static void main(String[] args) {
    /**
     * @description ： 加密分为三种：
     *
     * 对称加密（symmetric），例如：AES、DES 等
     * 非对称加密（asymmetric），例如：RSA、DSA 等
     * 摘要加密（digest），例如：MD5、SHA-1、SHA-256、HMAC 等
     * @author 鲁先生
     * @date 2021/12/16 15:59
     * @param [args]
     * @return void
     */
    //Hutool 针对这三种情况都做了封装：
    //
    //对称加密 SymmetricCrypto
    //非对称加密 AsymmetricCrypto
    //摘要加密 Digester
    //快速加密工具类 SecureUtil 有以下这些方法：
    //
    //1）对称加密
    //
    //SecureUtil.aes
    //SecureUtil.des
    //2）非对称加密
    //
    //SecureUtil.rsa
    //SecureUtil.dsa
    //3）摘要加密
    //
    //SecureUtil.md5
    //SecureUtil.sha1
    //SecureUtil.hmac
    //SecureUtil.hmacMd5
    //SecureUtil.hmacSha1


    String encry = aes.encryptHex("沉默王二");
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
