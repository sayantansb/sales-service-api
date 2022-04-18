package api.sales.service.lambda;

import api.sales.service.booking.BookingService;
import api.sales.service.dto.BookingRequest;
import api.sales.service.dto.BookingResponse;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LambdaRequestHandler  implements RequestHandler<BookingRequest, BookingResponse> {

    private static final Logger LOG = LoggerFactory.getLogger(BookingService.class);

    @Override
    public BookingResponse handleRequest(BookingRequest bookingRequest, Context context) {
        LOG.info("In LambdaRequestHandler::handleRequest, bookingRequest = {}",bookingRequest);

        BookingResponse bookingResponse = new BookingResponse();

        try {
            BookingService bookingService = new BookingService();
            bookingResponse.setBookingId(bookingService.doBooking(bookingRequest));
        } catch (Exception e) {
            LOG.error("Exception in generating template, ",e);
        }
        LOG.info("I am Lambda, I am returning to API Gateway {}",bookingResponse);
        return bookingResponse;
    }
}
