public class Test {

public static void main(String args[])
{
  // ���� ����: rw-rw-rw-, ���丮 ����: rwxrwxrwx
  String cmd = "umask 0";
  File file = new File("/home/report/report.txt");
  // ...
  Runtime.getRuntime().exec(cmd);
}

}