package florma;
    import java.lang.System.Logger;
    import java.lang.System.Logger.Level;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.sql.ResultSet;
/**
 * @author elcar
 */
public class conexion {
    String db ="florma2"; 
    String url ="jdbc:mysql://127.0.0.1:3306/";
    String user ="root";
    String pass ="";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection con;
    Statement stm;
    ResultSet rs;
   
    // jdbc:mysql://127.0.0.1:3306/florma2,root,
    
    public Connection Conectar(){
        try{
            Class.forName(driver);
            con= DriverManager.getConnection(url+db,user,pass);
            //System.out.println("Conectado");
        }catch(ClassNotFoundException | SQLException ex){
          System.out.println("NO CONECTO");
          java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
        return con;
    }
    
    public void Desconectar(){
        try{
            con.close();
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
}
