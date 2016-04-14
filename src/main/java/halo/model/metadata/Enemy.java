package halo.model.metadata;


public class Enemy {
   
   private String faction;
   private String name;
   private String description;
   private String largeIconImageUrl;
   private String smallIconImageUrl;
   private String id;
   
   public String getFaction() {
      return faction;
   }
   
   public void setFaction( String faction ) {
      this.faction = faction;
   }
   
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
   
   public String getLargeIconImageUrl() {
      return largeIconImageUrl;
   }
   
   public void setLargeIconImageUrl( String largeIconImageUrl ) {
      this.largeIconImageUrl = largeIconImageUrl;
   }
   
   public String getSmallIconImageUrl() {
      return smallIconImageUrl;
   }
   
   public void setSmallIconImageUrl( String smallIconImageUrl ) {
      this.smallIconImageUrl = smallIconImageUrl;
   }
   
   public String getId() {
      return id;
   }
   
   public void setId( String id ) {
      this.id = id;
   }
}
