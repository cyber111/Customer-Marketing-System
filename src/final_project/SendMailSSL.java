/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

/**
 *
 * @author Pradeep
 */
public class SendMailSSL{    
// public void sendmail(String sendto){
//     
// }
    public static void main(String args,String sub,String msg) {    
     //from,password,to,subject,message  
     
     MailDemo.send("keepitsimple7799@gmail.com","keepitsimple@123",args,sub,msg);  

    
     //change from, password and to  
 }    
    
}
