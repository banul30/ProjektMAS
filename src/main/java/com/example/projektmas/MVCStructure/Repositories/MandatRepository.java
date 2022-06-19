package com.example.projektmas.MVCStructure.Repositories;

import com.example.projektmas.MVCStructure.Models.Mandat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MandatRepository extends JpaRepository<Mandat, Long> {


    @Query(value = "select COALESCE(MAX(id_mandat), 0) +1 from mandat", nativeQuery = true)
    public int getNextMandatId();



}
