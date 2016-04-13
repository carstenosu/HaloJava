package halo.model.stats;

import java.util.List;


public class ServiceRecordResponse {
   
   private List<ServiceRecord> results;
   
   public List<ServiceRecord> getResults() {
      return results;
   }
   
   public void setResults( List<ServiceRecord> results ) {
      this.results = results;
   }
}
