public class S488 extends HttpServlet 
{

public void bad() throws Throwable
{

try {						
	Integer.parseInt("Test");	
}
catch (Exception e)				// �������� ����ó�� Ŭ���� ���
{
	IO.writeLine("Caught Exception");
	throw e;
}

}

}