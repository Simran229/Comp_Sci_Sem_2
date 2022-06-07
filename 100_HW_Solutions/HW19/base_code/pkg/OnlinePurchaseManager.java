import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
   private ArrayList<Gizmo> purchases;
   

   public int countElectronicsByMaker (String maker){
      int count = 0;
      for (Gizmos g: purchases){
         if (g.getMaker().equals (maker) && g.isElectonic()){
            count ++;
         }
      }
      return count;
      
   }
   public boolean hasAdjacentEqualPair (){
      for (int i = 0; i<purchases.size()-1; i++){
         if (purchases.get(x) == purchases.get(x+ 1)){
            return true;
         }
      }
      return false;
   }
   // public Gizmo getCheapestGizmoByMaker( String mkr )
   // {
   // }
   
   
   public String toString()
   {
   	return "" + purchases;
   }
}
