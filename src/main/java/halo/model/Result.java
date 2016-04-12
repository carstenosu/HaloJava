
package halo.model;


public class Result {

   private CampaignStat campaignStat;
   private int spartanRank;
   private long xp;
   private PlayerId playerId;
   
   public CampaignStat getCampaignStat() {
      return campaignStat;
   }
   
   public void setCampaignStat( CampaignStat campaignStat ) {
      this.campaignStat = campaignStat;
   }
   
   public int getSpartanRank() {
      return spartanRank;
   }
   
   public void setSpartanRank( int spartanRank ) {
      this.spartanRank = spartanRank;
   }
   
   public long getXp() {
      return xp;
   }
   
   public void setXp( long xp ) {
      this.xp = xp;
   }
   
   public PlayerId getPlayerId() {
      return playerId;
   }
   
   public void setPlayerId( PlayerId playerId ) {
      this.playerId = playerId;
   }
   
}
