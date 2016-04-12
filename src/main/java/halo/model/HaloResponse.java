package halo.model;

import java.util.List;


public class HaloResponse {
   
   private List<SingleResult> results;
   
   public List<SingleResult> getResults() {
      return results;
   }
   
   public void setResults( List<SingleResult> results ) {
      this.results = results;
   }
}
