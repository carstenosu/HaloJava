package halo.model.stats;

import java.util.ArrayList;
import java.util.List;

public class CampaignMissionStat {

   private FlexibleStats flexibleStats;
   private CoopStats coopStats;
   private SoloStats soloStats;
   private String missionId;
   private String totalKills;
   private String totalHeadshots;
   private String totalWeaponDamage;
   private String totalShotsFired;
   private String totalShotsLanded;
   private WeaponWithMostKills weaponWithMostKills;
   private String totalMeleeKills;
   private String totalMeleeDamage;
   private String totalAssassinations;
   private String totalGroundPoundKills;
   private String totalGroundPoundDamage;
   private String totalShoulderBashKills;
   private String totalShoulderBashDamage;
   private String totalGrenadeDamage;
   private String totalPowerWeaponKills;
   private String totalPowerWeaponDamage;
   private String totalPowerWeaponGrabs;
   private String totalPowerWeaponPossessionTime;
   private String totalDeaths;
   private String totalAssists;
   private String totalGamesCompleted;
   private String totalGamesWon;
   private String totalGamesLost;
   private String totalGamesTied;
   private String totalTimePlayed;
   private String totalGrenadeKills;
   private List<MedalAward> medalAwards = new ArrayList<MedalAward>();
   private List<DestroyedEnemyVehicle> destroyedEnemyVehicles = new ArrayList<DestroyedEnemyVehicle>();
   private List<EnemyKill> enemyKills = new ArrayList<EnemyKill>();
   private List<WeaponStat> weaponStats = new ArrayList<WeaponStat>();
   private List<Impulse> impulses = new ArrayList<Impulse>();
   private String totalSpartanKills;

   public FlexibleStats getFlexibleStats() {
      return flexibleStats;
   }

   public void setFlexibleStats( FlexibleStats flexibleStats ) {
      this.flexibleStats = flexibleStats;
   }

   public CoopStats getCoopStats() {
      return coopStats;
   }

   public void setCoopStats( CoopStats coopStats ) {
      this.coopStats = coopStats;
   }

   public SoloStats getSoloStats() {
      return soloStats;
   }

   public void setSoloStats( SoloStats soloStats ) {
      this.soloStats = soloStats;
   }

   public String getMissionId() {
      return missionId;
   }

   public void setMissionId( String missionId ) {
      this.missionId = missionId;
   }

   public String getTotalKills() {
      return totalKills;
   }

   public void setTotalKills( String totalKills ) {
      this.totalKills = totalKills;
   }

   public String getTotalHeadshots() {
      return totalHeadshots;
   }

   public void setTotalHeadshots( String totalHeadshots ) {
      this.totalHeadshots = totalHeadshots;
   }

   public String getTotalWeaponDamage() {
      return totalWeaponDamage;
   }

   public void setTotalWeaponDamage( String totalWeaponDamage ) {
      this.totalWeaponDamage = totalWeaponDamage;
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

   public WeaponWithMostKills getWeaponWithMostKills() {
      return weaponWithMostKills;
   }

   public void setWeaponWithMostKills( WeaponWithMostKills weaponWithMostKills ) {
      this.weaponWithMostKills = weaponWithMostKills;
   }

   public String getTotalMeleeKills() {
      return totalMeleeKills;
   }

   public void setTotalMeleeKills( String totalMeleeKills ) {
      this.totalMeleeKills = totalMeleeKills;
   }

   public String getTotalMeleeDamage() {
      return totalMeleeDamage;
   }

   public void setTotalMeleeDamage( String totalMeleeDamage ) {
      this.totalMeleeDamage = totalMeleeDamage;
   }

   public String getTotalAssassinations() {
      return totalAssassinations;
   }

   public void setTotalAssassinations( String totalAssassinations ) {
      this.totalAssassinations = totalAssassinations;
   }

   public String getTotalGroundPoundKills() {
      return totalGroundPoundKills;
   }

   public void setTotalGroundPoundKills( String totalGroundPoundKills ) {
      this.totalGroundPoundKills = totalGroundPoundKills;
   }

   public String getTotalGroundPoundDamage() {
      return totalGroundPoundDamage;
   }

   public void setTotalGroundPoundDamage( String totalGroundPoundDamage ) {
      this.totalGroundPoundDamage = totalGroundPoundDamage;
   }

   public String getTotalShoulderBashKills() {
      return totalShoulderBashKills;
   }

   public void setTotalShoulderBashKills( String totalShoulderBashKills ) {
      this.totalShoulderBashKills = totalShoulderBashKills;
   }

   public String getTotalShoulderBashDamage() {
      return totalShoulderBashDamage;
   }

   public void setTotalShoulderBashDamage( String totalShoulderBashDamage ) {
      this.totalShoulderBashDamage = totalShoulderBashDamage;
   }

   public String getTotalGrenadeDamage() {
      return totalGrenadeDamage;
   }

   public void setTotalGrenadeDamage( String totalGrenadeDamage ) {
      this.totalGrenadeDamage = totalGrenadeDamage;
   }

   public String getTotalPowerWeaponKills() {
      return totalPowerWeaponKills;
   }

   public void setTotalPowerWeaponKills( String totalPowerWeaponKills ) {
      this.totalPowerWeaponKills = totalPowerWeaponKills;
   }

   public String getTotalPowerWeaponDamage() {
      return totalPowerWeaponDamage;
   }

   public void setTotalPowerWeaponDamage( String totalPowerWeaponDamage ) {
      this.totalPowerWeaponDamage = totalPowerWeaponDamage;
   }

   public String getTotalPowerWeaponGrabs() {
      return totalPowerWeaponGrabs;
   }

   public void setTotalPowerWeaponGrabs( String totalPowerWeaponGrabs ) {
      this.totalPowerWeaponGrabs = totalPowerWeaponGrabs;
   }

   public String getTotalPowerWeaponPossessionTime() {
      return totalPowerWeaponPossessionTime;
   }

   public void setTotalPowerWeaponPossessionTime( String totalPowerWeaponPossessionTime ) {
      this.totalPowerWeaponPossessionTime = totalPowerWeaponPossessionTime;
   }

   public String getTotalDeaths() {
      return totalDeaths;
   }

   public void setTotalDeaths( String totalDeaths ) {
      this.totalDeaths = totalDeaths;
   }

   public String getTotalAssists() {
      return totalAssists;
   }

   public void setTotalAssists( String totalAssists ) {
      this.totalAssists = totalAssists;
   }

   public String getTotalGamesCompleted() {
      return totalGamesCompleted;
   }

   public void setTotalGamesCompleted( String totalGamesCompleted ) {
      this.totalGamesCompleted = totalGamesCompleted;
   }

   public String getTotalGamesWon() {
      return totalGamesWon;
   }

   public void setTotalGamesWon( String totalGamesWon ) {
      this.totalGamesWon = totalGamesWon;
   }

   public String getTotalGamesLost() {
      return totalGamesLost;
   }

   public void setTotalGamesLost( String totalGamesLost ) {
      this.totalGamesLost = totalGamesLost;
   }

   public String getTotalGamesTied() {
      return totalGamesTied;
   }

   public void setTotalGamesTied( String totalGamesTied ) {
      this.totalGamesTied = totalGamesTied;
   }

   public String getTotalTimePlayed() {
      return totalTimePlayed;
   }

   public void setTotalTimePlayed( String totalTimePlayed ) {
      this.totalTimePlayed = totalTimePlayed;
   }

   public String getTotalGrenadeKills() {
      return totalGrenadeKills;
   }

   public void setTotalGrenadeKills( String totalGrenadeKills ) {
      this.totalGrenadeKills = totalGrenadeKills;
   }

   public List<MedalAward> getMedalAwards() {
      return medalAwards;
   }

   public void setMedalAwards( List<MedalAward> medalAwards ) {
      this.medalAwards = medalAwards;
   }

   public List<DestroyedEnemyVehicle> getDestroyedEnemyVehicles() {
      return destroyedEnemyVehicles;
   }

   public void setDestroyedEnemyVehicles( List<DestroyedEnemyVehicle> destroyedEnemyVehicles ) {
      this.destroyedEnemyVehicles = destroyedEnemyVehicles;
   }

   public List<EnemyKill> getEnemyKills() {
      return enemyKills;
   }

   public void setEnemyKills( List<EnemyKill> enemyKills ) {
      this.enemyKills = enemyKills;
   }

   public List<WeaponStat> getWeaponStats() {
      return weaponStats;
   }

   public void setWeaponStats( List<WeaponStat> weaponStats ) {
      this.weaponStats = weaponStats;
   }

   public List<Impulse> getImpulses() {
      return impulses;
   }

   public void setImpulses( List<Impulse> impulses ) {
      this.impulses = impulses;
   }

   public String getTotalSpartanKills() {
      return totalSpartanKills;
   }

   public void setTotalSpartanKills( String totalSpartanKills ) {
      this.totalSpartanKills = totalSpartanKills;
   }

}
