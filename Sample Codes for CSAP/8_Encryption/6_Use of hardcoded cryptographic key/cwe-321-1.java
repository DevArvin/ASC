public class U256 
{
private Connection con;

public String encryptString (String usr) 
{
  String seed = "68af404b513073584c4b6f22b6c63e6b";

  try {
     // ����� ���ǵ� ��ȣŰ�� �̿��Ͽ� encrypt�� �����Ѵ�.
     SecretKeySpec skeySpec = new SecretKeySpec(seed.getBytes(), "AES");
   } catch (SQLException e) {
        // ...
   }

   return con;
  }
}
  }