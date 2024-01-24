package net.avangrid.dodapplication.payload;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class OutageMasterDTO {
    private Long id;
    private String serverCentre;
    private String town;
    private String street;
    private int pole;
    private String cdeCauseOutage;
    private String cdeWeatherConditions;
    private String cdePurposeOutage;
    private int qtyPhases;
    private Boolean cdsExcludeForArp;
}
