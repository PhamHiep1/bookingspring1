package com.example.HotelBooking.repositories;

import com.example.HotelBooking.entities.Room;
import com.example.HotelBooking.enums.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {



}
