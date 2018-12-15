import java.net.*;
import java.io.*;
import java.io.BufferedReader;

class ServerCode
{
	ServerSocket ss;
	Socket s;
	BufferedReader br=null;
	DataInputStream ds;
	OutputStreamWriter os;
	PrintWriter pw;
	String str,str1="Lokesh";
	int port=44444;

	ServerCode()
	{
		try
		{
			System.out.println("Server is started");
			ss=new ServerSocket(port);
			System.out.println("Waiting for Client request");
			s=ss.accept();
			System.out.println("Client connected.....");
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			if((str=br.readLine()) != null){
			};
			//ds=new DataInputStream(s.getInputStream());
			//str=(String)ds.readUTF();

			s=new Socket("localhost",port);
			os=new OutputStreamWriter(s.getOutputStream());
			pw=new PrintWriter(os);
			pw.write(str1);

			System.out.println("Client Data : "+str);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{

		new ServerCode();
	}
}