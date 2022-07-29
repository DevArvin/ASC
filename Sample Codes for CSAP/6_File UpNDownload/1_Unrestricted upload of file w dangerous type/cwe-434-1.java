public class Test{

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
.. 중략 ..
// extract the filename from the Http header
BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
.. 중략 ..
pLine = br.readLine();
String filename =	 pLine.substring(pLine.lastIndexOf("\\"), pLine.lastIndexOf("\""));
...

// output the file to the local upload	 directory
try {
BufferedWriter bw = new BufferedWriter(new FileWriter(uploadLocation+filename, true));
for (String line; (line=br.readLine())!=null; )	 {
if (line.indexOf(boundary) == -1) {
bw.write(line);
bw.newLine();
bw.flush();
}
} //end of for loop
bw.close(); 

}
}
}