package net.avangrid.dodapplication.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OutageMasterDTO {

    private Long id;

    // Outage Date and Time
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dateTimeOff;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dateModified;

    // Outage Information

    private String cdeCauseOutage;
    private String cdePurposeOutage;
    private String cdeWeatherConditions;

    // Damage Location
    private String serverCentre;
    private String town;
    private String street;
    private Integer pole;
    private Integer alt;

    // Protective Device

    private String circuit;
    private String device;
    private String deviceNumber;

    // Statics

    private Integer numberCustomers;
    private Integer qtyPhases;
    private Boolean cdsExcludeForArp;

    // Remarks
    private String remarks;
}
