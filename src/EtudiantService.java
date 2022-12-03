import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService  {
	 
	IEtudRepository IStudRep;
	IUnivRepository IUnivRep; 
	Ijour journal;
	IEtudiantFactory EtudFact;
	
	public EtudiantService(IEtudRepository IStudRep, IUnivRepository IUnivRep, Ijour journal,IEtudiantFactory EtudFact)
	
	{
		IStudRep=IStudREP;
		IUnivRep=IUnivREP;
		journal= jr;
		EtudFact=Efact;
	}
	
	
	boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException	
	{
		Etudiant etud = EtudFact.creer(matricule, nom, prenom, email, pwd, id_universite);
		journal.log("début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		
		if(IStudRep.ExistsEmail(email) || IStudRep.ExistsMat(matricule)
				{
			journal.log("Log : echec d'ajout" +matricule);
			return false;
				}
		
	    
	    System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	    
	    if(email == null || email.length() == 0)
	    {
	    	return false;
	    }
	    
	    if (StudRep.Exists(matricule))
	    {
	        return false;
	    }
	    
		if (StudRep.Exists(email))
	    {
	        return false;
	    }
		
		
		
		 if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(10);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 stud.setNbLivreMensuel_Autorise(10*2);
	     }                           
	     
		 StudRep.add(stud);
		 System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		 return true;
	    
		
	}
	
	
	

public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}


	
}
