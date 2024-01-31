package net.avangrid.dodapplication.repository;

import net.avangrid.dodapplication.composite.CompositeOutage;
import net.avangrid.dodapplication.entity.OutageDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutageDetailRepository extends JpaRepository<OutageDetail, CompositeOutage> {
}
