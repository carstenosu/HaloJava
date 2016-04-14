package halo.model.metadata;

import java.util.List;


public class GameBaseVariant {
   private String name;
   private String internalName;
   private String iconUrl;
   private List<String> supportedGameModes;
   private String id;
   
   public String getName() {
      return name;
   }
   
   public void setName( String name ) {
      this.name = name;
   }
   
   public String getInternalName() {
      return internalName;
   }
   
   public void setInternalName( String internalName ) {
      this.internalName = internalName;
   }
   
   public String getIconUrl() {
      return iconUrl;
   }
   
   public void setIconUrl( String iconUrl ) {
      this.iconUrl = iconUrl;
   }
   
   public List<String> getSupportedGameModes() {
      return supportedGameModes;
   }
   
   public void setSupportedGameModes( List<String> supportedGameModes ) {
      this.supportedGameModes = supportedGameModes;
   }
   
   public String getId() {
      return id;
   }
   
   public void setId( String id ) {
      this.id = id;
   }
}
