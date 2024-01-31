package net.avangrid.dodapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.avangrid.dodapplication.composite.CompositeOutage;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OUTAGE_DETAIL")
public class OutageDetail {

    @EmbeddedId
    private CompositeOutage id;

    @Column(name = "DTE_TIME_ON")
    private LocalDate dteTimeOn;

    @Column(name = "QTY_CUSTOMERS_IMPACTED")
    private int qtyCustomersImpacted;

    @Column(name = "CDE_DEVICE_NO")
    private String cdeDeviceNo;

/*    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CDE_CIRCUITS", nullable = false)
    private String cdeCircuits;*/

    @Column(name = "QTY_IMPACTED_SMAP")
    private int qtyImpactedSmap;

    @Column(name = "ID_USER")
    private String idUser;

    @Column(name = "DTE_MODIFIED")
    private LocalDate dteModified;

    @Column(name = "CDS_EXCLUDE_FOR_IDX")
    private boolean cdsExcludeForIdx;
}
