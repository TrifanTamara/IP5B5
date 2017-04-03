
package ipb5;

import java.util.Vector;

public class Manager {

    private Manager(){};
    
    
  private static Manager manager=null;

  private Cont[] conturi;

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
      
   public  boolean existaCont(Cont x){
       for(int i=0; i<Cont.length; ++i)
           if(conturi[i].id==x.id)
               return true;
       return false;
   }
   public void adaugaCont(Cont x){
       if (!existaCont(x))
           conturi.add(x);
   }
      
    @Override
  public String toString()
  {
      return "manager de bilete!";
  }

}
