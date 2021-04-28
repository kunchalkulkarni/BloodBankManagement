/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.*;

/**
 *
 * @author Shrayesha
 */
public interface loginInterface extends Remote{
    public boolean getLogin(String userName, String pwd) throws RemoteException;
}
