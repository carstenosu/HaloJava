package halo.model.metadata;


public class GameVariant {
   private String name;
   private String description;
   private String gameBaseVariantId;
   private String iconUrl;
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
   
   public String getGameBaseVariantId() {
      return gameBaseVariantId;
   }
   
   public void setGameBaseVariantId( String gameBaseVariantId ) {
      this.gameBaseVariantId = gameBaseVariantId;
   }
   
   public String getIconUrl() {
      return iconUrl;
   }
   
   public void setIconUrl( String iconUrl ) {
      this.iconUrl = iconUrl;
   }
   
   public String getId() {
      return id;
   }
   
   public void setId( String id ) {
      this.id = id;
   }
}
