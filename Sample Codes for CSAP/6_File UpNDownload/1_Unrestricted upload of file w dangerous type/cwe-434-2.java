public class Test{

String savePath="/var/www/uploads";// ���ε� ���丮 
int sizeLimit = 5 * 1024 * 1024 ;// ���ε� ���� ������ ���� 

try 
MultipartRequest multi=new MultipartRequest(request, savePath, sizeLimit, new DefaultFileRenamePolicy()); 
Enumeration formNames=multi.getFileNames();// ���� �̸� ��ȯ 
String formName=(String)formNames.nextElement(); 
String fileName=multi.getFilesystemName(formName);// ������ �̸� ��� 

if(fileName == null) 
out.print("Error"); 
else 
fileName=new String(fileName.getBytes("8859_1"),"euc-kr"); 
out.print("User Name : " + multi.getParameter("userName") + "<BR>"); 
out.print("Form Name : " + formName + "<BR>"); 
out.print("File Name : " + fileName); 

}