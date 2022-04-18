package api.sales.service.lambda;

import api.sales.service.booking.BookingService;
import api.sales.service.dto.BookingRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LambdaRequestHandlerTest {

    @Test
    void handleRequest() throws JsonProcessingException {
        String strBookingRequest = "{\n" +
                "  \"request\": {\n" +
                "    \"requesterId\": 28, \"userId\": 0, \"userContactAddress\": {\n" +
                "      \"firstname\": \"Jane\",\n" +
                "      \"lastname\": \"Doe\",\n" +
                "      \"gender\": \"FEMALE\",\n" +
                "      \"companyName\": \"Umbrella Corp.\", \"phoneNumber\": \"+1 416 321313-55\", \"emailAddress\": \"jane.doe@umbrella.com\", \"country\": \"US\",\n" +
                "      \"federalState\": \"CA\",\n" +
                "      \"city\": \"[CA] Avalon\", \"zipCode\": \"[CA] 90704\", \"street\": \"[CA] Umbrella Alley\", \"houseNo\": \"[CA] 20-27\", \"addOn\": \"[CA] Building C\"\n" +
                "    },\n" +
                "    \"userBillingAddress\": null, \"clearingHouse\": \"GMBH\", \"liableOffice\": \"HAMBURG\", \"salesTeam\": \"DACH\", \"salesManagerId\": 1055, \"accountBookingType\": \"NEW_BUSINESS\", \"billingTerms\": \"NET_10\", \"otherBillingTerms\": null, \"salesChannels\": [\n" +
                "      \"COLD_CALL\",\n" +
                "      \"CUSTOMER_VISIT\"\n" +
                "    ],\n" +
                "    \"areSeatsLimited\": true,\n" +
                "    \"seatsLimit\": 15, \"accountAccessTypes\": [\n" +
                "      \"PASSWORD\",\n" +
                "      \"IP_LOGIN\",\n" +
                "      \"DOMAIN\",\n" +
                "      \"SSO_LINK\",\n" +
                "      \"SHIBBOLETH\",\n" +
                "      \"SAML_2\"\n" +
                "    ],\n" +
                "    \"agreementForm\": \"CONTRACT\", \"products\": [\n" +
                "      {\n" +
                "        \"enumValue\": \"PREMIUM_ACCOUNT\", \"price\": 25,\n" +
                "        \"pricePerMonth\": 25, \"description\": \"single account\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"enumValue\": \"DOSSIER\", \"price\": 0, \"pricePerMonth\": 0, \"description\": \"dossier\"\n" +
                "      } ],\n" +
                "    \"subscriptionStartDate\": null, \"subscriptionFullMonths\": 12, \"subscriptionEndDate\": null, \"pricePerMonth\": null, \"discountAmount\": null, \"newBusinessAmountPart\": null, \"renewalAmountPart\": null, \"invoiceAmount\": 0.01,\n" +
                "    \"currency\": \"EUR\",\n" +
                "    \"businessLanguage\": \"DE\", \"isPurchaseOrderNumberRequired\": false, \"purchaseOrderNumber\": null,\n" +
                "    \"vatId\": null,\n" +
                "    \"hasAutoCancellation\": null, \"contractDocumentUrl\": null, \"contractDocumentFileName\": null, \"contractDocument\": null, \"offerDocumentUrl\": null, \"offerDocumentFileName\": null, \"offerDocument\": null,\n" +
                "    \"isBundleBooking\": null,\n" +
                "    \"isInvoiceSplit\": null,\n" +
                "    \"dealType\": \"SINGLE\", \"salesforceOpportunityId\": \"dsadsayxcsdfret\", \"smRevenueShares\": [\n" +
                "      {\n" +
                "        \"salesManagerId\": 1055, \"profitCenter\": \"DACH_CORE\", \"totalShareInPercent\": 0.01, \"totalShareValue\": 0.01\n" +
                "      } ],\n" +
                "    \"flsRevenueShares\": [], \"additionalInfo\": null, \"version\": null\n" +
                "  } }";

        BookingRequest bookingRequest = (new ObjectMapper()).readValue(strBookingRequest,BookingRequest.class);
        Integer bookingId = new BookingService().doBooking(bookingRequest);
        assertNotNull(bookingId);


    }
}