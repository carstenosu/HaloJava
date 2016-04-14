package halo.model.metadata;

import java.util.List;


public class Reward {

   private int xp;
   private String id;
   private List<RequisitionPack> requisitionPacks;

   public int getXp() {
      return xp;
   }

   public void setXp( int xp ) {
      this.xp = xp;
   }

   public String getId() {
      return id;
   }

   public void setId( String id ) {
      this.id = id;
   }

   public List<RequisitionPack> getRequisitionPacks() {
      return requisitionPacks;
   }

   public void setRequisitionPacks( List<RequisitionPack> requisitionPacks ) {
      this.requisitionPacks = requisitionPacks;
   }
   
}
