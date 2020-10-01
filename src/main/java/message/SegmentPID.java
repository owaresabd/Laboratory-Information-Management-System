package message;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author - Sirojkhuja Muminkhodjaev
 * Contact - sirojxuja@gmail.com
 * This class represents PID (Patient Identification) segment of HL7 protocol
 * */

public class SegmentPID implements Segment {
    private String segmentId = "1";
    private String clientId;
    private String bedNo;
    private String patientName;
    private String patientBirthDate;
    private String patientGender;
    private String bloodType = "A";

    public SegmentPID setSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public SegmentPID setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public SegmentPID setBedNo(String bedNo) {
        this.bedNo = bedNo;
        return this;
    }

    public SegmentPID setPatientName(String patientName) {
        this.patientName = patientName;
        return this;
    }

    public SegmentPID setPatientBirthDate(Date patientBirthDate) {
        this.patientBirthDate = new SimpleDateFormat("yyyyMMddHHmmss").format(patientBirthDate);
        return this;
    }

    public SegmentPID setPatientGender(String patientGender) {
        this.patientGender = patientGender;
        return this;
    }

    public SegmentPID setBloodType(String bloodType) {
        this.bloodType = bloodType;
        return this;
    }

    @Override
    public String createSegment() {
        return "PID|"
                + segmentId + "|"
                + clientId + "||"
                + bedNo + "|"
                + patientName + "||"
                + patientBirthDate + "|"
                + patientGender + "|"
                + bloodType + "||||||||||||||||||||||";
    }
}
