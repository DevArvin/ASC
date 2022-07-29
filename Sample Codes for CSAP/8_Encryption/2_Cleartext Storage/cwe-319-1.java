public class Test {
public void bad() throws Throwable
{
 
String getPassword() {
  return "secret";
}

void foo() {
  try {
    Socket socket = new Socket("taranis", 4444);
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    String password = getPassword();
    out.write(password);
  } catch (FileNotFoundException e) { }
  // ...
}

}

}