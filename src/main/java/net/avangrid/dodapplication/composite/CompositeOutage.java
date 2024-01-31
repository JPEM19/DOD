package net.avangrid.dodapplication.composite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.avangrid.dodapplication.entity.OutageMaster;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CompositeOutage implements Serializable {

    @OneToOne
    @JoinColumn(name = "ID_OUTAGE", referencedColumnName = "idOutage")
    private OutageMaster outageMaster;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SEQ_NO_OUTAGE", nullable = false)
    private long seqNoOutage;
}
