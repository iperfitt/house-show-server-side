package com.ianperfitt.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ianperfitt.Entities.Event;

@Repository
public interface EventRepo extends JpaRepository<Event, Long> {

	@Transactional
	Long deleteByName(String name);

}
