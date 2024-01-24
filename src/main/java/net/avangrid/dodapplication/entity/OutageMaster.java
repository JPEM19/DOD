package net.avangrid.dodapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OUTAGE_MASTER")
public class OutageMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CDE_SERV_CTR", nullable = false)
    private String serverCentre;

    @Column(name = "CMP_TOWN", nullable = false)
    private String town;

    @Column(name = "CMP_STREET", nullable = false)
    private String street;

    @Column(name = "CMP_POLE", nullable = false)
    private int pole;

    @Column(name = "CDE_CAUSE_OUTAGE")
    private String cdeCauseOutage;

    @Column(name = "CDE_WEATHER_CONDITIONS")
    private String cdeWeatherConditions;

    @Column(name = "CDE_PURPOSE_OUTAGE")
    private String cdePurposeOutage;

    @Column(name = "QTY_PHASES")
    private int qtyPhases;

    @Column(name = "CDS_EXCLUDE_FOR_ARP")
    private Boolean cdsExcludeForArp;
}
