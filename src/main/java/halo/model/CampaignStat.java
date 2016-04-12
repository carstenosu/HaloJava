
package halo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class CampaignStat {

    private List<CampaignMissionStat> CampaignMissionStats = new ArrayList<CampaignMissionStat>();
    private String TotalKills;
    private String TotalHeadshots;
    private String TotalWeaponDamage;
    private String TotalShotsFired;
    private String TotalShotsLanded;
    private WeaponWithMostKills WeaponWithMostKills;
    private String TotalMeleeKills;
    private String TotalMeleeDamage;
    private String TotalAssassinations;
    private String TotalGroundPoundKills;
    private String TotalGroundPoundDamage;
    private String TotalShoulderBashKills;
    private String TotalShoulderBashDamage;
    private String TotalGrenadeDamage;
    private String TotalPowerWeaponKills;
    private String TotalPowerWeaponDamage;
    private String TotalPowerWeaponGrabs;
    private String TotalPowerWeaponPossessionTime;
    private String TotalDeaths;
    private String TotalAssists;
    private String TotalGamesCompleted;
    private String TotalGamesWon;
    private String TotalGamesLost;
    private String TotalGamesTied;
    private String TotalTimePlayed;
    private String TotalGrenadeKills;
    private List<MedalAward> MedalAwards = new ArrayList<MedalAward>();
    private List<DestroyedEnemyVehicle> DestroyedEnemyVehicles = new ArrayList<DestroyedEnemyVehicle>();
    private List<EnemyKill> EnemyKills = new ArrayList<EnemyKill>();
    private List<WeaponStat> WeaponStats = new ArrayList<WeaponStat>();
    private List<Impulse> Impulses = new ArrayList<Impulse>();
    private String TotalSpartanKills;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The CampaignMissionStats
     */
    public List<CampaignMissionStat> getCampaignMissionStats() {
        return CampaignMissionStats;
    }

    /**
     * 
     * @param CampaignMissionStats
     *     The CampaignMissionStats
     */
    public void setCampaignMissionStats(List<CampaignMissionStat> CampaignMissionStats) {
        this.CampaignMissionStats = CampaignMissionStats;
    }

    /**
     * 
     * @return
     *     The TotalKills
     */
    public String getTotalKills() {
        return TotalKills;
    }

    /**
     * 
     * @param TotalKills
     *     The TotalKills
     */
    public void setTotalKills(String TotalKills) {
        this.TotalKills = TotalKills;
    }

    /**
     * 
     * @return
     *     The TotalHeadshots
     */
    public String getTotalHeadshots() {
        return TotalHeadshots;
    }

    /**
     * 
     * @param TotalHeadshots
     *     The TotalHeadshots
     */
    public void setTotalHeadshots(String TotalHeadshots) {
        this.TotalHeadshots = TotalHeadshots;
    }

    /**
     * 
     * @return
     *     The TotalWeaponDamage
     */
    public String getTotalWeaponDamage() {
        return TotalWeaponDamage;
    }

    /**
     * 
     * @param TotalWeaponDamage
     *     The TotalWeaponDamage
     */
    public void setTotalWeaponDamage(String TotalWeaponDamage) {
        this.TotalWeaponDamage = TotalWeaponDamage;
    }

    /**
     * 
     * @return
     *     The TotalShotsFired
     */
    public String getTotalShotsFired() {
        return TotalShotsFired;
    }

    /**
     * 
     * @param TotalShotsFired
     *     The TotalShotsFired
     */
    public void setTotalShotsFired(String TotalShotsFired) {
        this.TotalShotsFired = TotalShotsFired;
    }

    /**
     * 
     * @return
     *     The TotalShotsLanded
     */
    public String getTotalShotsLanded() {
        return TotalShotsLanded;
    }

    /**
     * 
     * @param TotalShotsLanded
     *     The TotalShotsLanded
     */
    public void setTotalShotsLanded(String TotalShotsLanded) {
        this.TotalShotsLanded = TotalShotsLanded;
    }

    /**
     * 
     * @return
     *     The WeaponWithMostKills
     */
    public WeaponWithMostKills getWeaponWithMostKills() {
        return WeaponWithMostKills;
    }

    /**
     * 
     * @param WeaponWithMostKills
     *     The WeaponWithMostKills
     */
    public void setWeaponWithMostKills(WeaponWithMostKills WeaponWithMostKills) {
        this.WeaponWithMostKills = WeaponWithMostKills;
    }

    /**
     * 
     * @return
     *     The TotalMeleeKills
     */
    public String getTotalMeleeKills() {
        return TotalMeleeKills;
    }

    /**
     * 
     * @param TotalMeleeKills
     *     The TotalMeleeKills
     */
    public void setTotalMeleeKills(String TotalMeleeKills) {
        this.TotalMeleeKills = TotalMeleeKills;
    }

    /**
     * 
     * @return
     *     The TotalMeleeDamage
     */
    public String getTotalMeleeDamage() {
        return TotalMeleeDamage;
    }

    /**
     * 
     * @param TotalMeleeDamage
     *     The TotalMeleeDamage
     */
    public void setTotalMeleeDamage(String TotalMeleeDamage) {
        this.TotalMeleeDamage = TotalMeleeDamage;
    }

    /**
     * 
     * @return
     *     The TotalAssassinations
     */
    public String getTotalAssassinations() {
        return TotalAssassinations;
    }

    /**
     * 
     * @param TotalAssassinations
     *     The TotalAssassinations
     */
    public void setTotalAssassinations(String TotalAssassinations) {
        this.TotalAssassinations = TotalAssassinations;
    }

    /**
     * 
     * @return
     *     The TotalGroundPoundKills
     */
    public String getTotalGroundPoundKills() {
        return TotalGroundPoundKills;
    }

    /**
     * 
     * @param TotalGroundPoundKills
     *     The TotalGroundPoundKills
     */
    public void setTotalGroundPoundKills(String TotalGroundPoundKills) {
        this.TotalGroundPoundKills = TotalGroundPoundKills;
    }

    /**
     * 
     * @return
     *     The TotalGroundPoundDamage
     */
    public String getTotalGroundPoundDamage() {
        return TotalGroundPoundDamage;
    }

    /**
     * 
     * @param TotalGroundPoundDamage
     *     The TotalGroundPoundDamage
     */
    public void setTotalGroundPoundDamage(String TotalGroundPoundDamage) {
        this.TotalGroundPoundDamage = TotalGroundPoundDamage;
    }

    /**
     * 
     * @return
     *     The TotalShoulderBashKills
     */
    public String getTotalShoulderBashKills() {
        return TotalShoulderBashKills;
    }

    /**
     * 
     * @param TotalShoulderBashKills
     *     The TotalShoulderBashKills
     */
    public void setTotalShoulderBashKills(String TotalShoulderBashKills) {
        this.TotalShoulderBashKills = TotalShoulderBashKills;
    }

    /**
     * 
     * @return
     *     The TotalShoulderBashDamage
     */
    public String getTotalShoulderBashDamage() {
        return TotalShoulderBashDamage;
    }

    /**
     * 
     * @param TotalShoulderBashDamage
     *     The TotalShoulderBashDamage
     */
    public void setTotalShoulderBashDamage(String TotalShoulderBashDamage) {
        this.TotalShoulderBashDamage = TotalShoulderBashDamage;
    }

    /**
     * 
     * @return
     *     The TotalGrenadeDamage
     */
    public String getTotalGrenadeDamage() {
        return TotalGrenadeDamage;
    }

    /**
     * 
     * @param TotalGrenadeDamage
     *     The TotalGrenadeDamage
     */
    public void setTotalGrenadeDamage(String TotalGrenadeDamage) {
        this.TotalGrenadeDamage = TotalGrenadeDamage;
    }

    /**
     * 
     * @return
     *     The TotalPowerWeaponKills
     */
    public String getTotalPowerWeaponKills() {
        return TotalPowerWeaponKills;
    }

    /**
     * 
     * @param TotalPowerWeaponKills
     *     The TotalPowerWeaponKills
     */
    public void setTotalPowerWeaponKills(String TotalPowerWeaponKills) {
        this.TotalPowerWeaponKills = TotalPowerWeaponKills;
    }

    /**
     * 
     * @return
     *     The TotalPowerWeaponDamage
     */
    public String getTotalPowerWeaponDamage() {
        return TotalPowerWeaponDamage;
    }

    /**
     * 
     * @param TotalPowerWeaponDamage
     *     The TotalPowerWeaponDamage
     */
    public void setTotalPowerWeaponDamage(String TotalPowerWeaponDamage) {
        this.TotalPowerWeaponDamage = TotalPowerWeaponDamage;
    }

    /**
     * 
     * @return
     *     The TotalPowerWeaponGrabs
     */
    public String getTotalPowerWeaponGrabs() {
        return TotalPowerWeaponGrabs;
    }

    /**
     * 
     * @param TotalPowerWeaponGrabs
     *     The TotalPowerWeaponGrabs
     */
    public void setTotalPowerWeaponGrabs(String TotalPowerWeaponGrabs) {
        this.TotalPowerWeaponGrabs = TotalPowerWeaponGrabs;
    }

    /**
     * 
     * @return
     *     The TotalPowerWeaponPossessionTime
     */
    public String getTotalPowerWeaponPossessionTime() {
        return TotalPowerWeaponPossessionTime;
    }

    /**
     * 
     * @param TotalPowerWeaponPossessionTime
     *     The TotalPowerWeaponPossessionTime
     */
    public void setTotalPowerWeaponPossessionTime(String TotalPowerWeaponPossessionTime) {
        this.TotalPowerWeaponPossessionTime = TotalPowerWeaponPossessionTime;
    }

    /**
     * 
     * @return
     *     The TotalDeaths
     */
    public String getTotalDeaths() {
        return TotalDeaths;
    }

    /**
     * 
     * @param TotalDeaths
     *     The TotalDeaths
     */
    public void setTotalDeaths(String TotalDeaths) {
        this.TotalDeaths = TotalDeaths;
    }

    /**
     * 
     * @return
     *     The TotalAssists
     */
    public String getTotalAssists() {
        return TotalAssists;
    }

    /**
     * 
     * @param TotalAssists
     *     The TotalAssists
     */
    public void setTotalAssists(String TotalAssists) {
        this.TotalAssists = TotalAssists;
    }

    /**
     * 
     * @return
     *     The TotalGamesCompleted
     */
    public String getTotalGamesCompleted() {
        return TotalGamesCompleted;
    }

    /**
     * 
     * @param TotalGamesCompleted
     *     The TotalGamesCompleted
     */
    public void setTotalGamesCompleted(String TotalGamesCompleted) {
        this.TotalGamesCompleted = TotalGamesCompleted;
    }

    /**
     * 
     * @return
     *     The TotalGamesWon
     */
    public String getTotalGamesWon() {
        return TotalGamesWon;
    }

    /**
     * 
     * @param TotalGamesWon
     *     The TotalGamesWon
     */
    public void setTotalGamesWon(String TotalGamesWon) {
        this.TotalGamesWon = TotalGamesWon;
    }

    /**
     * 
     * @return
     *     The TotalGamesLost
     */
    public String getTotalGamesLost() {
        return TotalGamesLost;
    }

    /**
     * 
     * @param TotalGamesLost
     *     The TotalGamesLost
     */
    public void setTotalGamesLost(String TotalGamesLost) {
        this.TotalGamesLost = TotalGamesLost;
    }

    /**
     * 
     * @return
     *     The TotalGamesTied
     */
    public String getTotalGamesTied() {
        return TotalGamesTied;
    }

    /**
     * 
     * @param TotalGamesTied
     *     The TotalGamesTied
     */
    public void setTotalGamesTied(String TotalGamesTied) {
        this.TotalGamesTied = TotalGamesTied;
    }

    /**
     * 
     * @return
     *     The TotalTimePlayed
     */
    public String getTotalTimePlayed() {
        return TotalTimePlayed;
    }

    /**
     * 
     * @param TotalTimePlayed
     *     The TotalTimePlayed
     */
    public void setTotalTimePlayed(String TotalTimePlayed) {
        this.TotalTimePlayed = TotalTimePlayed;
    }

    /**
     * 
     * @return
     *     The TotalGrenadeKills
     */
    public String getTotalGrenadeKills() {
        return TotalGrenadeKills;
    }

    /**
     * 
     * @param TotalGrenadeKills
     *     The TotalGrenadeKills
     */
    public void setTotalGrenadeKills(String TotalGrenadeKills) {
        this.TotalGrenadeKills = TotalGrenadeKills;
    }

    /**
     * 
     * @return
     *     The MedalAwards
     */
    public List<MedalAward> getMedalAwards() {
        return MedalAwards;
    }

    /**
     * 
     * @param MedalAwards
     *     The MedalAwards
     */
    public void setMedalAwards(List<MedalAward> MedalAwards) {
        this.MedalAwards = MedalAwards;
    }

    /**
     * 
     * @return
     *     The DestroyedEnemyVehicles
     */
    public List<DestroyedEnemyVehicle> getDestroyedEnemyVehicles() {
        return DestroyedEnemyVehicles;
    }

    /**
     * 
     * @param DestroyedEnemyVehicles
     *     The DestroyedEnemyVehicles
     */
    public void setDestroyedEnemyVehicles(List<DestroyedEnemyVehicle> DestroyedEnemyVehicles) {
        this.DestroyedEnemyVehicles = DestroyedEnemyVehicles;
    }

    /**
     * 
     * @return
     *     The EnemyKills
     */
    public List<EnemyKill> getEnemyKills() {
        return EnemyKills;
    }

    /**
     * 
     * @param EnemyKills
     *     The EnemyKills
     */
    public void setEnemyKills(List<EnemyKill> EnemyKills) {
        this.EnemyKills = EnemyKills;
    }

    /**
     * 
     * @return
     *     The WeaponStats
     */
    public List<WeaponStat> getWeaponStats() {
        return WeaponStats;
    }

    /**
     * 
     * @param WeaponStats
     *     The WeaponStats
     */
    public void setWeaponStats(List<WeaponStat> WeaponStats) {
        this.WeaponStats = WeaponStats;
    }

    /**
     * 
     * @return
     *     The Impulses
     */
    public List<Impulse> getImpulses() {
        return Impulses;
    }

    /**
     * 
     * @param Impulses
     *     The Impulses
     */
    public void setImpulses(List<Impulse> Impulses) {
        this.Impulses = Impulses;
    }

    /**
     * 
     * @return
     *     The TotalSpartanKills
     */
    public String getTotalSpartanKills() {
        return TotalSpartanKills;
    }

    /**
     * 
     * @param TotalSpartanKills
     *     The TotalSpartanKills
     */
    public void setTotalSpartanKills(String TotalSpartanKills) {
        this.TotalSpartanKills = TotalSpartanKills;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(CampaignMissionStats).append(TotalKills).append(TotalHeadshots).append(TotalWeaponDamage).append(TotalShotsFired).append(TotalShotsLanded).append(WeaponWithMostKills).append(TotalMeleeKills).append(TotalMeleeDamage).append(TotalAssassinations).append(TotalGroundPoundKills).append(TotalGroundPoundDamage).append(TotalShoulderBashKills).append(TotalShoulderBashDamage).append(TotalGrenadeDamage).append(TotalPowerWeaponKills).append(TotalPowerWeaponDamage).append(TotalPowerWeaponGrabs).append(TotalPowerWeaponPossessionTime).append(TotalDeaths).append(TotalAssists).append(TotalGamesCompleted).append(TotalGamesWon).append(TotalGamesLost).append(TotalGamesTied).append(TotalTimePlayed).append(TotalGrenadeKills).append(MedalAwards).append(DestroyedEnemyVehicles).append(EnemyKills).append(WeaponStats).append(Impulses).append(TotalSpartanKills).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CampaignStat) == false) {
            return false;
        }
        CampaignStat rhs = ((CampaignStat) other);
        return new EqualsBuilder().append(CampaignMissionStats, rhs.CampaignMissionStats).append(TotalKills, rhs.TotalKills).append(TotalHeadshots, rhs.TotalHeadshots).append(TotalWeaponDamage, rhs.TotalWeaponDamage).append(TotalShotsFired, rhs.TotalShotsFired).append(TotalShotsLanded, rhs.TotalShotsLanded).append(WeaponWithMostKills, rhs.WeaponWithMostKills).append(TotalMeleeKills, rhs.TotalMeleeKills).append(TotalMeleeDamage, rhs.TotalMeleeDamage).append(TotalAssassinations, rhs.TotalAssassinations).append(TotalGroundPoundKills, rhs.TotalGroundPoundKills).append(TotalGroundPoundDamage, rhs.TotalGroundPoundDamage).append(TotalShoulderBashKills, rhs.TotalShoulderBashKills).append(TotalShoulderBashDamage, rhs.TotalShoulderBashDamage).append(TotalGrenadeDamage, rhs.TotalGrenadeDamage).append(TotalPowerWeaponKills, rhs.TotalPowerWeaponKills).append(TotalPowerWeaponDamage, rhs.TotalPowerWeaponDamage).append(TotalPowerWeaponGrabs, rhs.TotalPowerWeaponGrabs).append(TotalPowerWeaponPossessionTime, rhs.TotalPowerWeaponPossessionTime).append(TotalDeaths, rhs.TotalDeaths).append(TotalAssists, rhs.TotalAssists).append(TotalGamesCompleted, rhs.TotalGamesCompleted).append(TotalGamesWon, rhs.TotalGamesWon).append(TotalGamesLost, rhs.TotalGamesLost).append(TotalGamesTied, rhs.TotalGamesTied).append(TotalTimePlayed, rhs.TotalTimePlayed).append(TotalGrenadeKills, rhs.TotalGrenadeKills).append(MedalAwards, rhs.MedalAwards).append(DestroyedEnemyVehicles, rhs.DestroyedEnemyVehicles).append(EnemyKills, rhs.EnemyKills).append(WeaponStats, rhs.WeaponStats).append(Impulses, rhs.Impulses).append(TotalSpartanKills, rhs.TotalSpartanKills).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
