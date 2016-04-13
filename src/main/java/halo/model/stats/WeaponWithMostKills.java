package halo.model.stats;



public class WeaponWithMostKills {

   private WeaponId weaponId;
   private String totalShotsFired;
   private String totalShotsLanded;
   private String totalHeadshots;
   private String totalKills;
   private String totalDamageDealt;
   private String totalPossessionTime;

   public WeaponId getWeaponId() {
      return weaponId;
   }

   public void setWeaponId( WeaponId weaponId ) {
      this.weaponId = weaponId;
   }

   public String getTotalShotsFired() {
      return totalShotsFired;
   }

   public void setTotalShotsFired( String totalShotsFired ) {
      this.totalShotsFired = totalShotsFired;
   }

   public String getTotalShotsLanded() {
      return totalShotsLanded;
   }

   public void setTotalShotsLanded( String totalShotsLanded ) {
      this.totalShotsLanded = totalShotsLanded;
   }

   public String getTotalHeadshots() {
      return totalHeadshots;
   }

   public void setTotalHeadshots( String totalHeadshots ) {
      this.totalHeadshots = totalHeadshots;
   }

   public String getTotalKills() {
      return totalKills;
   }

   public void setTotalKills( String totalKills ) {
      this.totalKills = totalKills;
   }

   public String getTotalDamageDealt() {
      return totalDamageDealt;
   }

   public void setTotalDamageDealt( String totalDamageDealt ) {
      this.totalDamageDealt = totalDamageDealt;
   }

   public String getTotalPossessionTime() {
      return totalPossessionTime;
   }

   public void setTotalPossessionTime( String totalPossessionTime ) {
      this.totalPossessionTime = totalPossessionTime;
   }
}
