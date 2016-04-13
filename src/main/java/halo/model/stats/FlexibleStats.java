package halo.model.stats;

import java.util.ArrayList;
import java.util.List;

public class FlexibleStats {

   private List<MedalStatCount> medalStatCounts = new ArrayList<MedalStatCount>();
   private List<ImpulseStatCount> impulseStatCounts = new ArrayList<ImpulseStatCount>();
   private List<MedalTimelapse> medalTimelapses = new ArrayList<MedalTimelapse>();
   private List<ImpulseTimelapse> impulseTimelapses = new ArrayList<ImpulseTimelapse>();

   public List<MedalStatCount> getMedalStatCounts() {
      return medalStatCounts;
   }

   public void setMedalStatCounts( List<MedalStatCount> medalStatCounts ) {
      this.medalStatCounts = medalStatCounts;
   }

   public List<ImpulseStatCount> getImpulseStatCounts() {
      return impulseStatCounts;
   }

   public void setImpulseStatCounts( List<ImpulseStatCount> impulseStatCounts ) {
      this.impulseStatCounts = impulseStatCounts;
   }

   public List<MedalTimelapse> getMedalTimelapses() {
      return medalTimelapses;
   }

   public void setMedalTimelapses( List<MedalTimelapse> medalTimelapses ) {
      this.medalTimelapses = medalTimelapses;
   }

   public List<ImpulseTimelapse> getImpulseTimelapses() {
      return impulseTimelapses;
   }

   public void setImpulseTimelapses( List<ImpulseTimelapse> impulseTimelapses ) {
      this.impulseTimelapses = impulseTimelapses;
   }

}
