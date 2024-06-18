package com.room.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.room.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {
	
	@Autowired
	private RoomService roomService;

	@GetMapping
	public ResponseEntity<?> getAvailableRooms(@PathParam(value = "available") boolean isAv) {
		return ResponseEntity.status(HttpStatus.OK).body(roomService.getAvailableRooms(isAv));
	}
}

