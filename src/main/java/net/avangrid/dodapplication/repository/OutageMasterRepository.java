package net.avangrid.dodapplication.repository;

import net.avangrid.dodapplication.entity.OutageMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OutageMasterRepository extends JpaRepository<OutageMaster, Long> {
}
