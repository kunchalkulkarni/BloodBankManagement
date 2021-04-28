/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
//import login_Interface.LoginImplementation;

/**
 *
 * @author Shrayesha
 */
public class loginServer {
    public static void main(String  [] args){
        
        try{
            Registry reg = LocateRegistry.createRegistry(1099);
            loginImplementation lp = new  loginImplementation();
            reg.rebind("login", lp);
            System.out.println("Server is ready..!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
