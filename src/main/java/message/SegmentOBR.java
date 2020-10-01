package message;

/**
 * Author - Sirojkhuja Muminkhodjaev
 * Contact - sirojxuja@gmail.com
 * This class represents OBR (Observation Report) segment of HL7 protocol
 * */

public class SegmentOBR implements Segment {
    private String segmentId = "1";
    private String barcode;
    private String sampleId;
    private String serviceId;
    private String emergency = "Y";
    private String sampleType = "serum";

    public SegmentOBR setSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public SegmentOBR setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    public SegmentOBR setSampleId(String sampleId) {
        this.sampleId = sampleId;
        return this;
    }

    public SegmentOBR setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public SegmentOBR setEmergency(String emergency) {
        this.emergency = emergency;
        return this;
    }

    public SegmentOBR setSampleType(String sampleType) {
        this.sampleType = sampleType;
        return this;
    }

    @Override
    public String createSegment() {
        return "OBR|"
                + segmentId + "|"
                + barcode + "|"
                + sampleId + "|"
                + serviceId + "|"
                + emergency + "||||||||||"
                + sampleType + "|||||||||||||||||||||||||||||||||"
                ;
    }
}
