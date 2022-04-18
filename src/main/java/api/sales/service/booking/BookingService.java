package api.sales.service.booking;

import api.sales.service.dto.BookingRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class BookingService {

    private static final Logger LOG = LoggerFactory.getLogger(BookingService.class);

    public Integer doBooking(BookingRequest bookingRequest){
        LOG.info("Booking initiated for requestorId : {}",bookingRequest.getRequest().getRequesterId());
        //internal logic to persist request, return a booking id between 10,000 to 99,999
        Integer bookingId = new Random().nextInt(90000) + 10000;
        LOG.info("Booking for requestorId {} initiated successfully ,Booking Id : {}",bookingRequest.getRequest().getRequesterId(),bookingId);
        return bookingId;
    }

}
