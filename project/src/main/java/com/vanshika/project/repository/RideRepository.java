package com.vanshika.project.repository;

import com.vanshika.project.model.Ride;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RideRepository extends MongoRepository<Ride, String> {

    List<Ride> findByStatus(String status);

    List<Ride> findByUserId(String userId);
}
