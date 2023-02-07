import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {

        ArrayList<String> h = new ArrayList<String>();
        for (int i = 0; i< tokens.length; i++) {
            if (tokens[i].equals(closeDel)) {
                h.add(closeDel);
            } else if (tokens[i].equals((openDel))) {
                h.add(openDel);
            }
        }
        return h;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        /* to be implemented in part (b) */
        int open = 0;
        for (int i = 0; i<delimiters.size(); i++) {
            String item = delimiters.get(i);
            if (item.equals(openDel)) {
                open += 1;
            } else if (item.equals(closeDel)) {
                open -= 1;
            }
            if (open<0) {
                return false;
            }
        }
        if (open==0) {
            return true;
        }
        return false;
    }
}