package com.InfyTel.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.InfyTel.domain.Plan;
import org.springframework.transaction.annotation.Transactional;

public interface PlanRepository extends JpaRepository<Plan, Integer>{
    //Method to update Plan details in DB
    @Transactional
    @Modifying
    @Query(value = "update  Plan set local_rate = ?, national_rate=? " + " where plan_id = ?", nativeQuery = true)
    public void updatePlan(Integer localRate, Integer nationalRate, Integer planId);
}
