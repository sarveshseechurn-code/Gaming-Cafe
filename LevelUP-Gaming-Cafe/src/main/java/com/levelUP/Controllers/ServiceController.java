package com.levelUP.Controllers;

import com.levelUP.Domains.ServicesDTO;
import com.levelUP.Services.ServiceService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import java.util.List;

@Controller("/services")
public class ServiceController {

    private final ServiceService serviceService;

    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @Get("/")
    public HttpResponse<List<ServicesDTO>> getAllServices() {
        try {
            List<ServicesDTO> services = serviceService.getAllServices();
            return HttpResponse.ok(services);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Get("/{id}")
    public HttpResponse<ServicesDTO> getServiceById(@PathVariable int id) {
        try {
            if (id <= 0) {
                return HttpResponse.badRequest();
            }
            ServicesDTO service = serviceService.getServiceById(id);
            if (service == null) {
                return HttpResponse.notFound();
            }
            return HttpResponse.ok(service);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Post("/")
    public HttpResponse<ServicesDTO> createService(@Body ServicesDTO service) {
        try {
            if (service.getName() == null || service.getName().isEmpty()) {
                return HttpResponse.badRequest();
            }
            if (service.getPricePerHour() == null || service.getPricePerHour().isEmpty()) {
                return HttpResponse.badRequest();
            }
            ServicesDTO created = serviceService.createService(service);
            return HttpResponse.created(created);
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }

    @Delete("/{id}")
    public HttpResponse<Void> deleteService(@PathVariable int id) {
        try {
            if (id <= 0) {
                return HttpResponse.badRequest();
            }
            serviceService.deleteService(id);
            return HttpResponse.noContent();
        } catch (Exception e) {
            return HttpResponse.serverError();
        }
    }
}