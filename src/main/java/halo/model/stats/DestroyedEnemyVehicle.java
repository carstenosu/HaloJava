package halo.model.stats;


public class DestroyedEnemyVehicle {

   private Enemy enemy;
   private String totalKills;

   public Enemy getEnemy() {
      return enemy;
   }

   public void setEnemy( Enemy enemy ) {
      this.enemy = enemy;
   }

   public String getTotalKills() {
      return totalKills;
   }

   public void setTotalKills( String totalKills ) {
      this.totalKills = totalKills;
   }


}
