package halo.model.metadata;

import java.util.List;


public class Commendation {
   private String type;
   private String name;
   private String description;
   private String iconImageUrl;
   private List<Level> levels;
   private int threshold;
   private String id;
   private List<RequiredLevel> requiredLevels;
   private Reward reward;
   private Category category;
   private boolean enabled;
   
   public String getType() {
      return type;
   }
   
   public void setType( String type ) {
      this.type = type;
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
   
   public String getIconImageUrl() {
      return iconImageUrl;
   }
   
   public void setIconImageUrl( String iconImageUrl ) {
      this.iconImageUrl = iconImageUrl;
   }
   
   public List<Level> getLevels() {
      return levels;
   }
   
   public void setLevels( List<Level> levels ) {
      this.levels = levels;
   }
   
   public int getThreshold() {
      return threshold;
   }
   
   public void setThreshold( int threshold ) {
      this.threshold = threshold;
   }
   
   public String getId() {
      return id;
   }
   
   public void setId( String id ) {
      this.id = id;
   }

   public List<RequiredLevel> getRequiredLevels() {
      return requiredLevels;
   }

   public void setRequiredLevels( List<RequiredLevel> requiredLevels ) {
      this.requiredLevels = requiredLevels;
   }
   
   public Reward getReward() {
      return reward;
   }

   public void setReward( Reward reward ) {
      this.reward = reward;
   }

   public Category getCategory() {
      return category;
   }

   public void setCategory( Category category ) {
      this.category = category;
   }

   public boolean isEnabled() {
      return enabled;
   }
   
   public void setEnabled( boolean enabled ) {
      this.enabled = enabled;
   }
   
}
