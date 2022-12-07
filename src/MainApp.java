import java.sql.SQLException;

import Journal.IJournal;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    IJournal IEcran=new outPut_Msg();
    IJournal IFichier=new outPut_Msg();
    
    if(email == null || email.length() == 0)
    {
    	return false;
    }                       


		EtudiantService serv=new EtudiantService();
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
