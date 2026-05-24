package com.levelUP.Controllers;

import com.levelUP.Domains.BookingDTO;
import com.levelUP.Services.BookingService;
import io.micronaut.http.annotation.*;
import java.util.List;

@Controller("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @Get("/")
    public List<BookingDTO> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @Get("/{id}")
    public BookingDTO getBookingById(@PathVariable int id) {
        return bookingService.getBookingById(id);
    }

    @Post("/")
    public BookingDTO createBooking(@Body BookingDTO booking) {
        return bookingService.createBooking(booking);
    }

    @Delete("/{id}")
    public void deleteBooking(@PathVariable int id) {
        bookingService.deleteBooking(id);
    }
}