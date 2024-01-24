package florma;

import fmr.Loginn;

/**
 *
 * @author elcar
 */
public class FlorMa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Loginn vent = new Loginn();
        conexion conec = new conexion();
        conec.Conectar();
        
        vent.setVisible(true);
        vent.setLocationRelativeTo(null);
    

}
}
