package com.levelUP.mappers;

import java.util.ArrayList;
import java.util.List;

import com.levelUP.domains.BookingDTO;

import jakarta.inject.Singleton;

@Singleton
public class BookingMapper {

    public List<BookingDTO> findAll() {
        return new ArrayList<>();
    }

    public BookingDTO findById(int id) {
        return new BookingDTO();
    }

    public BookingDTO save(BookingDTO booking) {
        return booking;
    }

    public void delete(int id) {
    }
}