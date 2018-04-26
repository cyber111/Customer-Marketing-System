/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;
import java.sql.*;

/**
 *
 * @author Pradeep
 */
public class Final_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // new mySqlConnection();
       java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                   Login login = new Login();
                   login.setVisible(true);
              }
        });
        // TODO code application logic here
    }
    
}
