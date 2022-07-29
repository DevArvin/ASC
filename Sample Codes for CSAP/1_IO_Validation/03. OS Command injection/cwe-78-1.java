public class Test
{
  public void checkHost(ServletRequest xxx) throws IOException 
  {
    // Source of data from HTTP request in servlet
    String hostName = xxx.getParameter("userHostName");
    String command = "nslookup " + hostName;
    Process proc = Runtime.getRuntime().exec(command);
         // ...
  }
}