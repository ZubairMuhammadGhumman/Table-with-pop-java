package table;
import javax.swing.JOptionPane;
public class Table 
{
    public static void main(String[] args)
    {
        int firstnum = Integer.parseInt(JOptionPane.showInputDialog("Enter the Table : "));
        int limitnum = Integer.parseInt(JOptionPane.showInputDialog("Enter End Limit for table : "));
        methodForTable(firstnum,limitnum);
    }
    public static void methodForTable(int firstnum,int limitnum)
    {
        for(int i = 1;i<=limitnum;i++)
        {
            JOptionPane.showMessageDialog(null, (firstnum + " x " + i + " = " + firstnum*i));
        }
    }
    
}
