package com.room.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.room.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{
	Room findByRoomNumber(String roomNumber);
	List<Room> findByAvailable(boolean isAvailable);
}
