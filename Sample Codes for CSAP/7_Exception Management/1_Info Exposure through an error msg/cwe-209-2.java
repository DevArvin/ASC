public class S488 extends HttpServlet 
{

public void f() {
  try { g(); }
  catch (IOException e) {
    // ���� �߻��� printf(e.getMessage())�� ���� ���� �޽��� ������ ����ȴ�.
    System.err.printf(e.getMessage());
  }
}
  private void g() throws IOException { }
  // ...

}