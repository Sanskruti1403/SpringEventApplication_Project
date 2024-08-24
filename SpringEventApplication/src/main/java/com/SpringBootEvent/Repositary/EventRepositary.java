package com.SpringBootEvent.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootEvent.model.Event;

@Repository
public interface EventRepositary extends JpaRepository<Event, Long>{

}
