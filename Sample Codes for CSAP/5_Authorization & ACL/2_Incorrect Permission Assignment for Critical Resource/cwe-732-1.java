public class Test {

public static void main(String args[])
{
  // 파일 권한: rw-rw-rw-, 디렉토리 권한: rwxrwxrwx
  String cmd = "umask 0";
  File file = new File("/home/report/report.txt");
  // ...
  Runtime.getRuntime().exec(cmd);
}

}