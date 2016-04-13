
package halo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CampaignMissionStat {

    private FlexibleStats flexibleStats;
    private CoopStats coopStats;
    private SoloStats soloStats;
    private String missionId;
    private String totalKills;
    private String totalHeadshots;
    private String totalWeaponDamage;
    private String totalShotsFired;
    private String totalShotsLanded;
    private WeaponWithMostKills weaponWithMostKills;
    private String totalMeleeKills;
    private String totalMeleeDamage;
    private String totalAssassinations;
    private String totalGroundPoundKills;
    private String totalGroundPoundDamage;
    private String totalShoulderBashKills;
    private String totalShoulderBashDamage;
    private String totalGrenadeDamage;
    private String totalPowerWeaponKills;
    private String totalPowerWeaponDamage;
    private String totalPowerWeaponGrabs;
    private String totalPowerWeaponPossessionTime;
    private String totalDeaths;
    private String totalAssists;
    private String totalGamesCompleted;
    private String totalGamesWon;
    private String totalGamesLost;
    private String totalGamesTied;
    private String totalTimePlayed;
    private String totalGrenadeKills;
    private List<MedalAward> medalAwards = new ArrayList<MedalAward>();
    private List<DestroyedEnemyVehicle> destroyedEnemyVehicles = new ArrayList<DestroyedEnemyVehicle>();
    private List<EnemyKill> enemyKills = new ArrayList<EnemyKill>();
    private List<WeaponStat> weaponStats = new ArrayList<WeaponStat>();
    private List<Impulse> impulses = new ArrayList<Impulse>();
    private String totalSpartanKills;

	
}
