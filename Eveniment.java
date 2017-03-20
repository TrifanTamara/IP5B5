/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipb5;

/**
 *
 * @author Tamara
 */
public class Eveniment {

     private int nrTickets;
     
     Eveniment(int nr){
         nrTickets=nr;
     }
     public int getAvailable()
     {
         return nrTickets;
     }
     
     public void setAvailable(int n){
         nrTickets=n;
     }
}
