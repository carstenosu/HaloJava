package halo.model.metadata;


public class Level {
   
   private Reward reward;
   private String id;

   public String getId() {
      return id;
   }

   public void setId( String id ) {
      this.id = id;
   }

   public Reward getReward() {
      return reward;
   }
   
   public void setReward( Reward reward ) {
      this.reward = reward;
   }
}
