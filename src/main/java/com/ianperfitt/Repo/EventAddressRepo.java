package com.ianperfitt.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ianperfitt.Entities.EventAddress;

@Repository
public interface EventAddressRepo extends JpaRepository<EventAddress, Long> {

}
