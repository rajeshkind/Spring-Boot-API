package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipresultsRepository extends JpaRepository<Zipresults, Integer> {

	@Query("Select z FROM Zipresults z INNER JOIN z.taxdetails WHERE zip = :zip")
	public Iterable<Zipresults> getZipresults(String zip);
	
}