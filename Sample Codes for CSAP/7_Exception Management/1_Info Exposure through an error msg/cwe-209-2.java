public class S488 extends HttpServlet 
{

public void f() {
  try { g(); }
  catch (IOException e) {
    // 예외 발생시 printf(e.getMessage())를 통해 오류 메시지 정보가 유출된다.
    System.err.printf(e.getMessage());
  }
}
  private void g() throws IOException { }
  // ...

}