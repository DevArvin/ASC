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
    serverSocket = new ServerSocket(port + 3000);  // �ܺο��� �Է¹��� ������ ������ �����Ѵ�.
  else
    serverSocket = new ServerSocket(def + 3000);
}

}