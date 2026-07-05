package com.levelUP.Controllers;

import com.levelUP.Domains.BookingDTO;
import com.levelUP.Services.BookingService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import java.util.List;

@Controller("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @Get("/")
    public HttpResponse<List<BookingDTO>> getAllBookings() {
        try {
            List<BookingDTO> bookings = bookingService.getAllBookings();
            return HttpResponse.ok(bookings);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Get("/{id}")
    public HttpResponse<BookingDTO> getBookingById(@PathVariable int id) {
        try {
            if (id <= 0) {
                return HttpResponse.badRequest();
            }
            BookingDTO booking = bookingService.getBookingById(id);
            if (booking == null) {
                return HttpResponse.notFound();
            }
            return HttpResponse.ok(booking);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Post("/")
    public HttpResponse<BookingDTO> createBooking(@Body BookingDTO booking) {
        try {
            if (booking.getFullName() == null || booking.getFullName().isEmpty()) {
                return HttpResponse.badRequest();
            }
            if (booking.getTimeSlot() == null || booking.getTimeSlot().isEmpty()) {
                return HttpResponse.badRequest();
            }
            if (booking.getServiceId() <= 0) {
                return HttpResponse.badRequest();
            }
            BookingDTO created = bookingService.createBooking(booking);
            return HttpResponse.created(created);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteBooking(@PathVariable int id) {
        try {
            if (id <= 0) {
                return HttpResponse.badRequest();
            }
            bookingService.deleteBooking(id);
            return HttpResponse.noContent();
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }
}