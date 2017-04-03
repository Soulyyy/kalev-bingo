package objects;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class BingoElement {

    String contents;

    public BingoElement(String contents) {
        this.contents = contents;
    }


    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
