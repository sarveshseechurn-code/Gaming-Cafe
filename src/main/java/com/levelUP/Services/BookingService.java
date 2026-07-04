package com.levelUP.Services;

import com.levelUP.Domains.BookingDTO;
import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class BookingService {

    public List<BookingDTO> getAllBookings() {
        return new ArrayList<>();
    }

    public BookingDTO getBookingById(int id) {
        return new BookingDTO();
    }

    public BookingDTO createBooking(BookingDTO booking) {
        return booking;
    }

    public void deleteBooking(int id) {
    }
}