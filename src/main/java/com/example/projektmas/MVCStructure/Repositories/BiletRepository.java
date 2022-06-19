package com.example.projektmas.MVCStructure.Repositories;

import com.example.projektmas.MVCStructure.Models.Bilet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiletRepository extends JpaRepository<Bilet, Long> {

}
