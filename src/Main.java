import javax.swing.*;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Läs in personnummer mha. dialogruta
        //   - Säg grattis om det är vår födelsedag
        //   - Meddela att det inte är vår födelsedag

        String pnr = JOptionPane.showInputDialog("Ange personnummer:");
        int mm = Integer.parseInt(pnr.substring(2, 4));
        int dd = Integer.parseInt(pnr.substring(4, 6));

        int todayMM = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int todayDD = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        if (mm == todayMM && dd == todayDD) {
            JOptionPane.showMessageDialog(null,"Grattis");
        } else {
            JOptionPane.showMessageDialog(null,"Inte än... Men det är snart din födelsedag");
        }
    }
}