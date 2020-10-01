package message;

/**
 * Author - Sirojkhuja Muminkhodjaev
 * Contact - sirojxuja@gmail.com
 * This class represents DSP (Display Data) segment of HL7 protocol
 * */

public class SegmentDSP implements Segment {
    private String id;
    private String data;

    public SegmentDSP setId(String id) {
        this.id = id;
        return this;
    }

    public SegmentDSP setData(String data) {
        this.data = data;
        return this;
    }

    @Override
    public String createSegment() {
        return "DSP|"
                + id + "||"
                + data + "|||";
    }
}
