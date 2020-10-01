package message;

/**
 * Author - Sirojkhuja Muminkhodjaev
 * Contact - sirojxuja@gmail.com
 * This class represents DSC (Data Continuation Pointer) segment of HL7 protocol
 * */

public class SegmentDSC implements Segment {
    @Override
    public String createSegment() {
        return "DSC||";
    }
}
