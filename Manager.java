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
import java.util.Vector;

public class Manager {

    private Manager(){};
    
    
  private static Manager manager=null;

  public Cont[] conturi;

  public Eveniment[]  myEveniment;
    
  public Manager getInstance() {
      if(manager==null) manager = new Manager();
    return manager;
  }

  public boolean getTicket(Eveniment e) {
      if(e.getAvailable()>0){
          e.setAvailable(e.getAvailable()-1);
          return true;
      }else{
            return false;
    }

}
