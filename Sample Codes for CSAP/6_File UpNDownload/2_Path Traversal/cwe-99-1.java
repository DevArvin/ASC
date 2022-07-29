public class Test{

public void f() throws IOException {
  int def = 1000;
  ServerSocket serverSocket;
  Properties props = new Properties();
  String fileName = "file_list";
  FileInputStream in = new FileInputStream(fileName);
  props.load(in);

  String service = props.getProperty("Service No");
  int port = Integer.parseInt(service);

  if(port != 0)
    serverSocket = new ServerSocket(port + 3000);  // 외부에서 입력받은 값으로 소켓을 생성한다.
  else
    serverSocket = new ServerSocket(def + 3000);
}

}