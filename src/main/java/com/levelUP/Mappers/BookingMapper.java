package com.levelUP.Mappers;

import com.levelUP.Domains.BookingDTO;
import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

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