public class Test{

String savePath="/var/www/uploads";// 업로드 디렉토리 
int sizeLimit = 5 * 1024 * 1024 ;// 업로드 파일 사이즈 제한 

try 
MultipartRequest multi=new MultipartRequest(request, savePath, sizeLimit, new DefaultFileRenamePolicy()); 
Enumeration formNames=multi.getFileNames();// 폼의 이름 반환 
String formName=(String)formNames.nextElement(); 
String fileName=multi.getFilesystemName(formName);// 파일의 이름 얻기 

if(fileName == null) 
out.print("Error"); 
else 
fileName=new String(fileName.getBytes("8859_1"),"euc-kr"); 
out.print("User Name : " + multi.getParameter("userName") + "<BR>"); 
out.print("Form Name : " + formName + "<BR>"); 
out.print("File Name : " + fileName); 

}