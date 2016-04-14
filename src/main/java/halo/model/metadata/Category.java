package halo.model.metadata;


public class Category {
   private String name;
   private String iconImageUrl;
   private String id;
   
   public String getName() {
      return name;
   }
   
   public void setName( String name ) {
      this.name = name;
   }
   
   public String getIconImageUrl() {
      return iconImageUrl;
   }
   
   public void setIconImageUrl( String iconImageUrl ) {
      this.iconImageUrl = iconImageUrl;
   }
   
   public String getId() {
      return id;
   }
   
   public void setId( String id ) {
      this.id = id;
   }
}
