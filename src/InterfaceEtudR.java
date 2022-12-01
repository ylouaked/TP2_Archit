import java.util.ArrayList;

public interface InterfaceEtudR {
	
	void add (Etudiant E);
	
	boolean ExistsEmail(String email);
	
	boolean ExistsMat(int mat);
	
	ArrayList< EtudiantLimite  > getAllEtudiantForfaiLimite();

}
