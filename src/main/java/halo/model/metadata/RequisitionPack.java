package halo.model.metadata;


public class RequisitionPack {

   private String name;
   private String description;
   private String largeImageUrl;
   private String mediumImageUrl;
   private String smallImageUrl;
   private boolean isFeatured;
   private boolean isNew;
   private int creditPrice;
   private boolean isPurchasableWithCredits;
   private boolean isPurchasableFromMarketplace;
   private String xboxMarketplaceProductId;
   private String xboxMarketplaceProductUrl;
   private String id;
   
   public String getName() {
      return name;
   }
   
   public void setName( String name ) {
      this.name = name;
   }
   
   public String getDescription() {
      return description;
   }
   
   public void setDescription( String description ) {
      this.description = description;
   }
   
   public String getLargeImageUrl() {
      return largeImageUrl;
   }
   
   public void setLargeImageUrl( String largeImageUrl ) {
      this.largeImageUrl = largeImageUrl;
   }
   
   public String getMediumImageUrl() {
      return mediumImageUrl;
   }
   
   public void setMediumImageUrl( String mediumImageUrl ) {
      this.mediumImageUrl = mediumImageUrl;
   }
   
   public String getSmallImageUrl() {
      return smallImageUrl;
   }
   
   public void setSmallImageUrl( String smallImageUrl ) {
      this.smallImageUrl = smallImageUrl;
   }
   
   public boolean isFeatured() {
      return isFeatured;
   }
   
   public void setFeatured( boolean isFeatured ) {
      this.isFeatured = isFeatured;
   }
   
   public boolean isNew() {
      return isNew;
   }
   
   public void setNew( boolean isNew ) {
      this.isNew = isNew;
   }
   
   public int getCreditPrice() {
      return creditPrice;
   }
   
   public void setCreditPrice( int creditPrice ) {
      this.creditPrice = creditPrice;
   }
   
   public boolean isPurchasableWithCredits() {
      return isPurchasableWithCredits;
   }
   
   public void setPurchasableWithCredits( boolean isPurchasableWithCredits ) {
      this.isPurchasableWithCredits = isPurchasableWithCredits;
   }
   
   public boolean isPurchasableFromMarketplace() {
      return isPurchasableFromMarketplace;
   }
   
   public void setPurchasableFromMarketplace( boolean isPurchasableFromMarketplace ) {
      this.isPurchasableFromMarketplace = isPurchasableFromMarketplace;
   }
   
   public String getXboxMarketplaceProductId() {
      return xboxMarketplaceProductId;
   }
   
   public void setXboxMarketplaceProductId( String xboxMarketplaceProductId ) {
      this.xboxMarketplaceProductId = xboxMarketplaceProductId;
   }
   
   public String getXboxMarketplaceProductUrl() {
      return xboxMarketplaceProductUrl;
   }
   
   public void setXboxMarketplaceProductUrl( String xboxMarketplaceProductUrl ) {
      this.xboxMarketplaceProductUrl = xboxMarketplaceProductUrl;
   }
   
   public String getId() {
      return id;
   }
   
   public void setId( String id ) {
      this.id = id;
   }
}
