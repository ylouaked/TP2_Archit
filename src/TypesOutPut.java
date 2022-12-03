
public class TypesOutPut implements IJournal{
	IJournal journal1;
	IJournal journal2;
	
	public TypesOutPut(IJournal journal1 , IJournal journal2) {
	   super();
	   this.journal1 = journal1;
	   this.journal1 = journal2;
		}
	
	public void outPut_msg(String message) {
		journal1.outPut_Msg(message);
		journal2.outPut_Msg(message);
	}

}
