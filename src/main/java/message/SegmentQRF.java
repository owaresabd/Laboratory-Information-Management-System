package message;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author - Sirojkhuja Muminkhodjaev
 * Contact - sirojxuja@gmail.com
 * This class represents QRF (Query Filter) segment of HL7 protocol
 * */

public class SegmentQRF implements Segment {
    private String model;
    private String dataStart;
    private String dataEnd;

    public SegmentQRF setModel(String model) {
        this.model = model;
        return this;
    }

    public SegmentQRF setDataStart(Date dataStart) {
        this.dataStart = new SimpleDateFormat("yyyyMMddHHmmss").format(dataStart);;
        return this;
    }

    public SegmentQRF setDataEnd(Date dataEnd) {
        this.dataEnd = new SimpleDateFormat("yyyyMMddHHmmss").format(dataEnd);;
        return this;
    }

    @Override
    public String createSegment() {
        return "QRF|"
                + model + "|"
                + dataStart + "|"
                + dataEnd + "|||RCT|COR|ALL||"
                ;
    }
}
