/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package login_Interface;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Shrayesha
 */
public class loginImplementation extends UnicastRemoteObject implements loginInterface {
    
    public loginImplementation() throws RemoteException{
        
    }
    
    public boolean getLogin(String userName, String pwd) throws RemoteException{
        boolean found = false;
        try{
            if(userName.equals("bbms") && pwd.equals("admin"))
                return found = true;
            else
                return found = false;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return found;
    }

}
