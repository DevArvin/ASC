public class OSCommandInjection
{
  .. �߷� ..
  public void Exec1()
  {
    String file = new String( inputBuffer );    
		  Process p = Runtime.getRuntime().exec( "ls " + file );  
  }
}