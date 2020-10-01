package message;

/**
 * Author - Sirojkhuja Muminkhodjaev
 * Contact - sirojxuja@gmail.com
 * This class represents QAK (Query Acknowledgement) segment of HL7 protocol
 * */

public class SegmentQAK implements Segment {
    // SR - Sample Request
    private String queryTag = "SR";
    // Possible Values: OK - ok, NF - Not Found, AE - Application Error, AR - Application Reject
    private String queryResponseStatus = "OK";

    public SegmentQAK setQueryTag(String queryTag) {
        this.queryTag = queryTag;
        return this;
    }

    public SegmentQAK setQueryResponseStatus(String queryResponseStatus) {
        this.queryResponseStatus = queryResponseStatus;
        return this;
    }

    @Override
    public String createSegment() {
        return "QAK|"
                + queryTag + "|"
                + queryResponseStatus + "|"
                ;
    }
}
