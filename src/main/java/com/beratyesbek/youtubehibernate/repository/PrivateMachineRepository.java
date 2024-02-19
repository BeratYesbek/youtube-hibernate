package com.beratyesbek.youtubehibernate.repository;

import com.beratyesbek.youtubehibernate.entity.interitance.single.PrivateMachine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivateMachineRepository extends JpaRepository<PrivateMachine, Integer> {
}
