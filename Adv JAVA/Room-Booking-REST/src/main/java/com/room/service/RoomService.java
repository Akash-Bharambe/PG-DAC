package com.room.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.room.dto.RoomDTO;
import com.room.entities.Room;
import com.room.repository.RoomRepository;

@Service
@Transactional
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	public List<RoomDTO> getAvailableRooms(boolean isAvailable) {
		List<Room> findByAvailable = roomRepository.findByAvailable(isAvailable);
		List<RoomDTO> list = findByAvailable.stream().map(entity-> mapper.map(entity, RoomDTO.class)).collect(Collectors.toList());
		return list;
	}
}
