public class Test {

public void target() throws NoSuchAlgorithmException
{
  KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
  int key = request.getParameter("key");
  // key generator�� ������� Ű ũ��
  keyGen.initialize(key);
  KeyPair myKeys = keyGen.generateKeyPair();
}

}