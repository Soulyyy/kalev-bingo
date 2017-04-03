package servlets;


import Utils.ElementChooser;
import Utils.HardCodedElements;
import objects.BingoElement;
import objects.BingoTicket;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bingo")
public class BingoController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public BingoTicket getTicket() {
        int rows = 3;
        int columns = 3;
        String[] elements = ElementChooser.getNElementsWithoutRepetition(HardCodedElements.ELEMENTS, rows * columns);
        BingoElement[][] ticketElements = new BingoElement[rows][columns];
        for (int i = 0; i < elements.length; i++) {
            ticketElements[i / 3][i % 3] = new BingoElement(elements[i]);
        }
        BingoTicket ticket = new BingoTicket(ticketElements);
        return ticket;
    }
}
