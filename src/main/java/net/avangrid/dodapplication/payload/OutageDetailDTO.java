package net.avangrid.dodapplication.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
@Data
public class OutageDetailDTO {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dteTimeOn;
    private int qtyCustomersImpacted;
    private String cdeDeviceNo;
    private int qtyImpactedSmap;
    private String idUser;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dteModified;
    private boolean cdsExcludeForIdx;
}
