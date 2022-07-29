public class Test {

public void target() throws NoSuchAlgorithmException
{
  KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
  int key = request.getParameter("key");
  // key generator의 불충분한 키 크기
  keyGen.initialize(key);
  KeyPair myKeys = keyGen.generateKeyPair();
}

}