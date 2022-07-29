public class S488 extends HttpServlet 
{

public static void main(String[] args) {
  String urlString = args[0];
  try{
    URL url = new URL(urlString);
    URLConnection cmx = url.openConnection();
    cmx.connect();
  }
  catch (Exception e) { e.printStackTrace(); }
 }
}

}