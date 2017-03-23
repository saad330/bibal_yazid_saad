/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal_yazid_saad.Connection;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dizay
 */
public class DbInteraction {
 public   static Connection con;     				// objet de type connection
public static ResultSet rs = null;							// pour le jeu  de resultat
   public static PreparedStatement pst;					// pour les requetes parametes
  public  static java.sql.Statement st;			// pour les requetes simples
	
    public static void Connect() throws SQLException{
    
		try {
						
            Class.forName("com.mysql.jdbc.Driver");			//chargement du pilote sql server	        
	        String url ="jdbc:mysql://localhost/bibal_yazid_saad" ;		//Chaine de connexion	       
	        con = (Connection) DriverManager.getConnection(url,"root","");		//Etablissement de la connection
	        st=con.createStatement();
	        System.out.println("Connection réussie");	        	        						
		} 
		catch (ClassNotFoundException e){
        	e.printStackTrace();
        } 
		catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public static void disconnect(){
    	try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public static ResultSet select(String sql){
    	try {
			rs=(ResultSet) st.executeQuery(sql);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
    	return rs;
    }
    
    public static int update(String sql){
    	int nb=0;
    	try {       		
			nb = st.executeUpdate(sql);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
    	return nb;
    }
    
}
