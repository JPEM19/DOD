package net.avangrid.dodapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CIRCUITS")
public class Circuits {

    @Id
    @Column(name = "CDE_SERV_CTR", nullable = false)
    private String cdeServCtr;

    @Column(name = "CDE_CIRCUIT")
    private String cdeCircuit;

/*    @OneToMany(mappedBy = "cdeCircuits", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OutageDetail> cdeCircuits = new HashSet<>();*/
}
