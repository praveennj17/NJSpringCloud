package com.example.springbootapplication;


import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Component;

@Component
public class SimpleCacheManager {

	List values = null;

	@Cacheable(value="numbers")
	public List getnumbers1() {
		values = new ArrayList<>();
		System.out.println("SimpleCacheManager Entering getnumbers1");
//		for (int i = 0; i < 4; i++) {
//			values.add(Math.random());
//		}
		values.add(4);
		System.out.println(values.toString());
		System.out.println("SimpleCacheManager Exiting  getnumbers1");
		return values;

	}

//	@Cacheable({ "numberses1", "numberstemp2" })
//	public List<String> getnumbers2() {
//		System.out.println("SimpleCacheManager .getnumbers2");
//		return Arrays.asList("kerala", "Tamilnadu", "Banglore", "Delhi", "Hyderabad");
//
//	}

	@CacheEvict(value = "numbers", allEntries = true)
	public List clear() {
		values = new ArrayList<>();
		System.out.println(" Entering SimpleCacheManager .clear");
//		for (int i = 0; i < 4; i++) {
//			values.add(Math.random());
//		}
		values.add(6);
		System.out.println(" Exiting SimpleCacheManager .clear");
		System.out.println(values.toString());
		return values;

	}

	// While @CacheEvict reduces the overhead of looking up entries in a large cache
	// by removing stale and unused entries, we want to avoid evicting too much data
	// out of the cache.
	// Instead, we selectively update the entries whenever we alter them.
	
	// @CachePut annotation, we can update the content of the cache without
	// interfering with the method execution. That is, the method will always be
	// executed and the result cached:
	
	//@Caching	group multiple caching annotations
	@Caching(evict = { @CacheEvict("numbers"),
			@CacheEvict(value = "directory", key = "#customer.name") })
	public String getAddress(String customer) {
		return "";
	}
	
	//@CachePut(value="addresses", unless="#result.length()<64")
	//public String getAddress(Customer customer) {...}

}
