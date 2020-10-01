package message;

/**
 * Author - Sirojkhuja Muminkhodjaev
 * Contact - sirojxuja@gmail.com
 * This class represents QRD (Query Definition) segment of HL7 protocol
 * */

public class SegmentQRD implements Segment {
    private String queryTime;
    // R - record-oriented
    private String queryFormatCode = "R";
    // D - deferred
    private String queryPriority = "D";
    private String queryId = "1";
    // RD - record
    private String quantityLimitedRequest = "RD";
    private String barcode;
    // Possible values: OTH - query, CAN - cancelling
    private String subjectFilter = "OTH";
    // T - full results
    private String resultLevel = "T";

    public SegmentQRD setQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }

    public SegmentQRD setQueryFormatCode(String queryFormatCode) {
        this.queryFormatCode = queryFormatCode;
        return this;
    }

    public SegmentQRD setQueryPriority(String queryPriority) {
        this.queryPriority = queryPriority;
        return this;
    }

    public SegmentQRD setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    public SegmentQRD setQuantityLimitedRequest(String quantityLimitedRequest) {
        this.quantityLimitedRequest = quantityLimitedRequest;
        return this;
    }

    public SegmentQRD setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    public SegmentQRD setSubjectFilter(String subjectFilter) {
        this.subjectFilter = subjectFilter;
        return this;
    }

    public SegmentQRD setResultLevel(String resultLevel) {
        this.resultLevel = resultLevel;
        return this;
    }

    @Override
    public String createSegment() {
        return "QRD|"
                + queryTime + "|"
                + queryFormatCode + "|"
                + queryPriority + "|"
                + queryId + "|||"
                + quantityLimitedRequest + "|"
                + barcode + "|"
                + subjectFilter + "|||"
                + resultLevel + "|"
                ;
    }
}
