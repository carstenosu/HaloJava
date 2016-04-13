package halo.model.stats;

import java.util.ArrayList;
import java.util.List;

public class WeaponId {

   private String stockId;
   private List<String> attachments = new ArrayList<String>();

   public String getStockId() {
      return stockId;
   }

   public void setStockId( String stockId ) {
      this.stockId = stockId;
   }

   public List<String> getAttachments() {
      return attachments;
   }

   public void setAttachments( List<String> attachments ) {
      this.attachments = attachments;
   }
}
