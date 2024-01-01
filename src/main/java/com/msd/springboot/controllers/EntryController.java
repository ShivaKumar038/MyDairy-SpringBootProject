package com.msd.springboot.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.msd.springboot.entities.Entry;
import com.msd.springboot.services.EntryServiceInterface;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/entries")
public class EntryController {

	@Autowired
	public EntryServiceInterface entryServiceInterface;
	
	@GetMapping("/")
	public List<Entry> findEntries() {
		List<Entry> entries = entryServiceInterface.findAll();
		return entries;
	}
	
	@PostMapping("/")
	public Entry findById(@RequestBody Entry entry) {
		Entry entry1 = entryServiceInterface.saveEntry(entry);
		return entry1;
	}
	
	@PutMapping("/")
	public Entry updateEntry(@RequestBody Entry entry) {
		return entryServiceInterface.updateEntry(entry);
	}
	
	@PutMapping("/{id}")
	public Entry updateEntryVariabe(@PathVariable("id") long id, @RequestBody Entry entry) {
		Entry entry1 = entryServiceInterface.findById(id);
		entry1.setDescription(entry.getDescription());
		entry1.setDate(entry.getDate());
		entry1.setUserid(entry.getUserid());
		return entryServiceInterface.updateEntry(entry1);
	}
	
	@PatchMapping("/{id}")
	public Entry updateEntryPatch(@PathVariable("id") long id, @RequestBody Entry entry) {
		
		Entry entry1 = entryServiceInterface.findById(id);
		
		String desc = entry.getDescription();
		Date dt = entry.getDate();
		long usrid = entry.getUserid();
		
		if(desc != null && desc.length()<0 ) {
			entry1.setDescription(desc);
		}
		
		if(dt != null) {
			entry1.setDate(dt);
		}
		
		if(usrid > 0) {
			entry1.setUserid(usrid);
		}
		
		return entryServiceInterface.updateEntry(entry1);
		
	}
	
	@GetMapping("/{id}")
	public Entry findById(@PathVariable("id") long id) {
		return entryServiceInterface.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEntry(@PathVariable("id") long id) {
		entryServiceInterface.deleteEntry(id);
	}
}
