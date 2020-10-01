package message;

/**
 * Author - Sirojkhuja Muminkhodjaev
 * Contact - sirojxuja@gmail.com
 * This class represents MSA (Message Acknowledgement) segment of HL7 protocol
 * */

public class SegmentMSA implements Segment {
    // Possible values: AA - Accepted, AE - Error, AR - Rejected
    private String ackCode = "AA";
    // This message ID should be the same with the message ID from request message
    private String reqMessageId;
    // Ack Code description text. For more info refer to a documentation
    private String ackCodeDescription = "Message Accepted";
    private String errorCode = "0";

    public SegmentMSA setAckCode(String ackCode) {
        this.ackCode = ackCode;
        return this;
    }

    public SegmentMSA setReqMessageId(String reqMessageId) {
        this.reqMessageId = reqMessageId;
        return this;
    }

    public SegmentMSA setAckCodeDescription(String ackCodeDescription) {
        this.ackCodeDescription = ackCodeDescription;
        return this;
    }

    public SegmentMSA setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    @Override
    public String createSegment() {
        return "MSA|"
                + ackCode + "|"
                + reqMessageId + "|"
                + ackCodeDescription + "|||"
                + errorCode + "|"
                ;
    }
}
