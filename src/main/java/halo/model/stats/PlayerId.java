package halo.model.stats;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class PlayerId {

   private String gamertag;
   private String xuid;

   public String getGamertag() {
      return gamertag;
   }

   public void setGamertag( String gamertag ) {
      this.gamertag = gamertag;
   }

   public String getXuid() {
      return xuid;
   }

   public void setXuid( String xuid ) {
      this.xuid = xuid;
   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString( this );
   }

}
