package message;

/**
 * Author - Sirojkhuja Muminkhodjaev
 * Contact - sirojxuja@gmail.com
 * This class represents OBX (Observation/Result) segment of HL7 protocol
 * */

public class SegmentOBX implements Segment {
    private String segmentId = "1";
    private String valueType = "NM";
    private String testCode;
    private String testName;
    private String testResult;
    private String testUnit;
    private String testNorms = "-";
    private String testFlag;

    public SegmentOBX setSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public SegmentOBX setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public SegmentOBX setTestCode(String testCode) {
        this.testCode = testCode;
        return this;
    }

    public SegmentOBX setTestName(String testName) {
        this.testName = testName;
        return this;
    }

    public SegmentOBX setTestResult(String testResult) {
        this.testResult = testResult;
        return this;
    }

    public SegmentOBX setTestUnit(String testUnit) {
        this.testUnit = testUnit;
        return this;
    }

    public SegmentOBX setTestNorms(String testNorms) {
        this.testNorms = testNorms;
        return this;
    }

    public SegmentOBX setTestFlag(String testFlag) {
        this.testFlag = testFlag;
        return this;
    }

    @Override
    public String createSegment() {
        return "OBX|"
                + segmentId + "|"
                + valueType + "|"
                + testCode + "|"
                + testName + "|"
                + testResult + "|"
                + testUnit + "|"
                + testNorms + "|"
                + testFlag + "|||F|||||||"
                ;
    }
}
