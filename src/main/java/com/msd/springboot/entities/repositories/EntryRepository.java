 package com.msd.springboot.entities.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msd.springboot.entities.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long> {
	
	public List<Entry> findAll();

}
