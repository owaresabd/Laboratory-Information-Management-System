package message;

/**
 * Author - Sirojkhuja Muminkhodjaev
 * Contact - sirojxuja@gmail.com
 * This class represents ERR (Error) segment of HL7 protocol
 * */

public class SegmentERR implements Segment {
    private String errorCode = "0";

    public SegmentERR setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    @Override
    public String createSegment() {
        return "ERR|"
                + errorCode + "|";

    }
}
