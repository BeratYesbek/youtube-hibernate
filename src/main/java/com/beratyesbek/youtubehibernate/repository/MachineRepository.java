package com.beratyesbek.youtubehibernate.repository;

import com.beratyesbek.youtubehibernate.entity.interitance.single.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineRepository extends JpaRepository<Machine, Integer> {
}
