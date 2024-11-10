package com.bcscuentamngr.repository;

import com.bcscuentamngr.entity.CondicionCdt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicionCdtRepository extends JpaRepository<CondicionCdt, Long> {
}
