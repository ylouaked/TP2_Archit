
public class IFichier implements IJournal {
	private final Path path;

	public void outPut_Msg(String message) {
	
	try
	{
		String monFichier;
		FileWriter fw = new FileWriter(monFichier)
	
	    Files.write(Paths.get(monFichier), message.getBytes(),StandardOpenOption.APPEND );
	}
	catch (IOException e)
	{
	 //Gestion des exceptions en cas de problème d'accès au fichier
		System.err.println(IOException: + ioe.getMessage());
	}
	}
}
