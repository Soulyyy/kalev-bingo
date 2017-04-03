package objects;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BingoTicket {

    BingoElement[][] ticket;

    public BingoTicket(BingoElement[][] ticket) {
        this.ticket = ticket;
    }

    public BingoElement[][] getTicket() {
        return ticket;
    }

    public void setTicket(BingoElement[][] ticket) {
        this.ticket = ticket;
    }
}
