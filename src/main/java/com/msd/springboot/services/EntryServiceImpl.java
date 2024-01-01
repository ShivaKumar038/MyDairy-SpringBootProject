package com.msd.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msd.springboot.entities.Entry;
import com.msd.springboot.entities.repositories.EntryRepository;

@Service
public class EntryServiceImpl implements EntryServiceInterface {
	
	@Autowired
	private EntryRepository entryRepository;

	@Override
	public Entry saveEntry(Entry entry) {
		
		return entryRepository.save(entry);
	}

	@Override
	public Entry updateEntry(Entry entry) {
		
		return entryRepository.save(entry);
	}

	@Override
	public void deleteEntry(long id) {
		entryRepository.deleteById(id);
	}

	@Override
	public Entry findById(long id) {
		return entryRepository.findById(id).get();
	}

	@Override
	public List<Entry> findAll() {
		List<Entry> entries= entryRepository.findAll();
		return entries;
	}

	@Override
	public List<Entry> findUserById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
