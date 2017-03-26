package takeTheSourceCode;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
public class main {

	public static void main(String[] args) {
		Socket s;
		try {
			s = new Socket("localhost",8080);
			PrintWriter pw;pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			pw.println("GET / HTTP/1.1");
			pw.println("Host:localhost");
			pw.println("Content-Type:text/html");
			pw.println();
			pw.flush();
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str="";
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
			br.close();
			pw.close();
			s.close();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
