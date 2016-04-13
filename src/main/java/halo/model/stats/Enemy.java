package halo.model.stats;

import java.util.ArrayList;
import java.util.List;

public class Enemy {

   private String baseId;
   private List<String> attachments = new ArrayList<String>();

   public String getBaseId() {
      return baseId;
   }

   public void setBaseId( String baseId ) {
      this.baseId = baseId;
   }

   public List<String> getAttachments() {
      return attachments;
   }

   public void setAttachments( List<String> attachments ) {
      this.attachments = attachments;
   }

}
