package Journal;
import java.text.SimpleDateFormat;
public class Enrichirmsg implements IJournal {
IJournal Journal;
public void outPut_msg(String message) {
	SimpleDateFormat Date = new SimpleDateFormat();
    Journal.outPut_Msg(Date.format(Date +" "+ message);
}

}
