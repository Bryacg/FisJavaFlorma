package florma;

import fmr.Login;

/**
 *
 * @author elcar
 */
public class FlorMa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Login vent = new Login();
        conexion conec = new conexion();
        conec.Conectar();
        
        vent.setVisible(true);
        vent.setLocationRelativeTo(null);
    

}
}
