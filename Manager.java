
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
       int ok=0;
       if (!existaCont(x)){
           for(int i=0; i<x.name.size(); ++i)
                if((x.name[i]<'a' or x.name[i]>'z') or (x.name[i]<'A' or x.name[i]>'Z')) then
                        if(x.name[i]!=' ')
                            ok=1;
           if (ok==0) 
               conturi.add(x);
       }
           
   }
      
    @Override
  public String toString()
  {
      return "manager de bilete!";
  }

}
