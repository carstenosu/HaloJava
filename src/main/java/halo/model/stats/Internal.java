package halo.model.stats;

import java.util.ArrayList;
import java.util.List;

public class Internal {

   private String highestScore;
   private String fastestCompletionTime;
   private List<String> skulls = new ArrayList<String>();
   private String totalTimesCompleted;
   private String allSkullsOn;

   public String getHighestScore() {
      return highestScore;
   }

   public void setHighestScore( String highestScore ) {
      this.highestScore = highestScore;
   }

   public String getFastestCompletionTime() {
      return fastestCompletionTime;
   }

   public void setFastestCompletionTime( String fastestCompletionTime ) {
      this.fastestCompletionTime = fastestCompletionTime;
   }

   public List<String> getSkulls() {
      return skulls;
   }

   public void setSkulls( List<String> skulls ) {
      this.skulls = skulls;
   }

   public String getTotalTimesCompleted() {
      return totalTimesCompleted;
   }

   public void setTotalTimesCompleted( String totalTimesCompleted ) {
      this.totalTimesCompleted = totalTimesCompleted;
   }

   public String getAllSkullsOn() {
      return allSkullsOn;
   }

   public void setAllSkullsOn( String allSkullsOn ) {
      this.allSkullsOn = allSkullsOn;
   }

}
