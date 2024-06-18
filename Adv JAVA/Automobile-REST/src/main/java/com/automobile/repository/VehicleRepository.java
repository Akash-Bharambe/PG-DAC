package com.automobile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.automobile.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

	@Query(value = "select v from Vehicle v where v.user.username = :name")
	List<Vehicle> findAllByUsername(String name);
	
	@Modifying
//	@Query(value = "delete from Vehicle v where v.user.username = :name")
//	@Query(value = "DELETE FROM Vehicle v WHERE v.user.id = (SELECT u.id FROM User u WHERE u.username = :name)")
	@Query(value = "delete v from vehicles v inner join user u on v.user_id = u.user_id where u.username = :name",nativeQuery = true)
	void deleteByUsername(String name);

}
