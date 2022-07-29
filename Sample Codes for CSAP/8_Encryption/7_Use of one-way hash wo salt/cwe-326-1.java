public class Test{

public byte[] getHash(String password) throws NosuchAlgorithmException 
{
  Message digest = MessageDigest.getInstance("SHA-256");
  digest.reset();
  return input = digest.digest(password.getBytes("UTF-8"));
}
}