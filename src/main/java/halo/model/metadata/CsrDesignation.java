package halo.model.metadata;

import java.util.List;


public class CsrDesignation {

   private String name;
   private String bannerImageUrl;
   private int id;
   private List<CsrTier> tiers;

   public String getName() {
      return name;
   }

   public void setName( String name ) {
      this.name = name;
   }

   public String getBannerImageUrl() {
      return bannerImageUrl;
   }

   public void setBannerImageUrl( String bannerImageUrl ) {
      this.bannerImageUrl = bannerImageUrl;
   }

   public int getId() {
      return id;
   }

   public void setId( int id ) {
      this.id = id;
   }

   public List<CsrTier> getTiers() {
      return tiers;
   }

   public void setTiers( List<CsrTier> tiers ) {
      this.tiers = tiers;
   }

}
