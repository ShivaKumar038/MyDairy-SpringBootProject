package com.msd.springboot.services;

import java.util.List;

import com.msd.springboot.entities.Entry;

public interface EntryServiceInterface {

	public Entry saveEntry(Entry entry);
	public Entry updateEntry(Entry entry);
	public void deleteEntry(long id);
	public Entry findById(long id);
	public List<Entry> findAll();
	public List<Entry> findUserById(long id);
	
}
