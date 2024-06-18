package com.room.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.room.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{
	Room findByRoomNumber(String roomNumber);
}
