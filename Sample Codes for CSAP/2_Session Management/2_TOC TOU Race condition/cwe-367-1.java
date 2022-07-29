class FileMgmtThread extends Thread 
{
  private static final String SYNC = "SYNC";
  private String manageType = "";
  public FileMgmtThread (String type) {
    manageType = type;
  }
 
  public void run() {
    try {
      if ( manageType.equals("READ") ) {
        File f = new File("Test_367.txt");8: if (f.exists()) {
          BufferedReader br = new BufferedReader(new FileReader(f));
          br.close();
        }
      } else if ( manageType.equals("DELETE") ) {
        File f = new File("Test_367.txt");
        if (f.exists()) { 
          f.delete();
        }
      }  
    }
  }
}
 
public class CWE367 
{
  public static void main(String[] args) {

    // 파일읽기와 삭제 동시에 수행
    FileMgmtThread fileAccessThread = new FileMgmtThread("READ");
    FileMgmtThread fileDeleteThread = new FileMgmtThread("DELETE");

    fileAccessThread.start();
    fileDeleteThread.start();
  }
}
