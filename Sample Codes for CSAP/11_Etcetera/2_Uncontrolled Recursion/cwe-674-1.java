public class S488 extends HttpServlet 
{

public int factorial(int n) {
  // ��� ȣ���� ���ǹ�/�ݺ��� �� �ܺο��� �Ͼ�� ��κ� ���� ��͸� �����Ѵ�.
  return n * factorial(n - 1);
}

}