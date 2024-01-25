package net.avangrid.dodapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OUTAGE_MASTER")
public class OutageMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Outage Date and Time

    @Column(name = "DTE_TIME_OFF")
    private LocalDateTime dateTimeOff;

    @Column(name = "DTE_MODIFIED")
    private LocalDateTime dateModified;

    // Outage Information

    @Column(name = "CDE_CAUSE_OUTAGE")
    private String cdeCauseOutage;

    @Column(name = "CDE_PURPOSE_OUTAGE")
    private String cdePurposeOutage;

    @Column(name = "CDE_WEATHER_CONDITIONS")
    private String cdeWeatherConditions;

    // Damage Location

    @Column(name = "CDE_SERV_CTR", nullable = false)
    private String serverCentre;

    @Column(name = "CMP_TOWN", nullable = false)
    private String town;

    @Column(name = "CMP_STREET", nullable = false)
    private String street;

    @Column(name = "CMP_POLE", nullable = false)
    private Integer pole;

    @Column(name = "ALT")
    private Integer alt;

    // Protective Device

    @Column(name = "CIRCUIT")
    private String circuit;

    @Column(name = "DEVICE")
    private String device;

    @Column(name = "DEVICE_NUMBER")
    private String deviceNumber;

    // Statics

    @Column(name = "NUMBER_CUSTOMERS")
    private Integer numberCustomers;

    @Column(name = "QTY_PHASES")
    private Integer qtyPhases;

    @Column(name = "CDS_EXCLUDE_FOR_ARP")
    private Boolean cdsExcludeForArp;

    // Remarks
    @Column(name = "REMARKS")
    private String remarks;
}
