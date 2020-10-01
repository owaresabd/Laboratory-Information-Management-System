package message;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author - Sirojkhuja Muminkhodjaev
 * Contact - sirojxuja@gmail.com
 * This class represents MSH (Message Header) segment of HL7 protocol
 * */

public class SegmentMSH implements Segment{
    private String manufacturer;
    private String model;
    private String hostName = "LIS";
    private String hostModel = "v1.0.0";
    private String messageDate;
    private String messageType;
    private String messageId;
    private String hl7Version = "2.3.1";
    private String encoding = "ASCII";

    public SegmentMSH setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public SegmentMSH setModel(String model) {
        this.model = model;
        return this;
    }

    public SegmentMSH setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    public SegmentMSH setHostModel(String hostModel) {
        this.hostModel = hostModel;
        return this;
    }

    public SegmentMSH setMessageDate(Date messageDate) {
        this.messageDate = new SimpleDateFormat("yyyyMMddHHmmss").format(messageDate);
        return this;
    }

    public SegmentMSH setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    public SegmentMSH setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public SegmentMSH setHl7Version(String hl7Version) {
        this.hl7Version = hl7Version;
        return this;
    }

    public SegmentMSH setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    @Override
    public String createSegment() {
        return "\u000BMSH|^~\\&|"
                + manufacturer + "|"
                + model + "|"
                + hostName + "|"
                + hostModel + "|"
                + messageDate + "||"
                + messageType + "|"
                + messageId + "|P|"
                + hl7Version + "||||0||"
                + encoding + "|||";
    }

    @Override
    public String toString() {
        return "\u000BMSH|^~\\&|"
                + manufacturer + "|"
                + model + "|"
                + hostName + "|"
                + hostModel + "|"
                + messageDate + "||"
                + messageId + "|P|"
                + hl7Version + "||||0||"
                + encoding + "|||";
    }

}
