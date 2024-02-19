package com.beratyesbek.youtubehibernate.repository;

import com.beratyesbek.youtubehibernate.entity.interitance.discriminator.MachineAccessor;
import com.beratyesbek.youtubehibernate.entity.interitance.single.Machine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MachineAccessorRepository extends JpaRepository<MachineAccessor, Integer> {
}
