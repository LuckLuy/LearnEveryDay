package sm4;

import javax.crypto.BadPaddingException;
import javax.crypto.SecretKey;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;

/**
 * @author 鲁先生
 * @Description：
 * @date 2021/10/13 20:28
 */
public class SM4Function {
  public static void main(String[] args)  throws InvalidKeyException, BadPaddingException {
    Sm4Util.Algorithm algorithm = Sm4Util.Algorithm.SM4;
    //16位密钥字符串   0123456789abcdeffedcba9876543210  0123456789abcdeffedcba9876543210
    String encryptKey = "f69d2c6a4b0b2839";
    //编码格式
    Charset encryptCharset = StandardCharsets.UTF_8;
    //生产密钥
    SecretKey key = Sm4Util.genKeyByStr(algorithm, encryptKey, encryptCharset);
    System.out.println("这是什么key："+key);
    //加密
    String encryptBase64 = Sm4Util.encryptBase64(algorithm, key, "ksdhahsdkahdkl131346464", encryptCharset);
    System.out.println("encryptBase64 = " + encryptBase64);//encryptBase64=QtrH8m/aR9x/cySEoUb+Nw==
    //解密
    String decryptBase64 = Sm4Util.decryptBase64(algorithm, key, "D897DA26AFF6BA9764D4312C4AD50EAF24B488F97F19CED4D60C8F0FA108C2C03B1D3653A8DE9A9C9FF60B76BB80314758BF0828DBD71079D6C2357BD9A5DFE220683ABDC1596147F5483ECC8289E279", encryptCharset);
    System.out.println("decryptBase64 = " + decryptBase64);

  }
}
