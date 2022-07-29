public class U256 
{
private Connection con;

public String encryptString (String usr) 
{
  String seed = "68af404b513073584c4b6f22b6c63e6b";

  try {
     // 상수로 정의된 암호키를 이용하여 encrypt를 수행한다.
     SecretKeySpec skeySpec = new SecretKeySpec(seed.getBytes(), "AES");
   } catch (SQLException e) {
        // ...
   }

   return con;
  }
}
  }