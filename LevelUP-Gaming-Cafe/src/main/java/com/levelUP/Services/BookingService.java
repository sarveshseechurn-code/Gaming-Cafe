package com.levelUP.Services;

import com.levelUP.Domains.BookingDTO;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class BookingService {

    private static final Logger logger = LoggerFactory.getLogger(BookingService.class);

    public List<BookingDTO> getAllBookings() {
        logger.info("Fetching all bookings");
        try {
            List<BookingDTO> bookings = new ArrayList<>();
            logger.info("Successfully fetched {} bookings", bookings.size());
            return bookings;
        } catch (Exception e) {
            logger.error("Error fetching all bookings: {}", e.getMessage());
            throw e;
        }
    }

    public BookingDTO getBookingById(int id) {
        logger.info("Fetching booking with id: {}", id);
        try {
            BookingDTO booking = new BookingDTO();
            logger.info("Successfully fetched booking with id: {}", id);
            return booking;
        } catch (Exception e) {
            logger.error("Error fetching booking with id {}: {}", id, e.getMessage());
            throw e;
        }
    }

    public BookingDTO createBooking(BookingDTO booking) {
        logger.info("Creating new booking for: {}", booking.getFullName());
        try {
            logger.info("Successfully created booking for: {}", booking.getFullName());
            return booking;
        } catch (Exception e) {
            logger.error("Error creating booking: {}", e.getMessage());
            throw e;
        }
    }

    public void deleteBooking(int id) {
        logger.info("Deleting booking with id: {}", id);
        try {
            logger.info("Successfully deleted booking with id: {}", id);
        } catch (Exception e) {
            logger.error("Error deleting booking with id {}: {}", id, e.getMessage());
            throw e;
        }
    }
}