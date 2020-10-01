import message.*;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Message message = new Message();

        message
                .append("MSH")
                .append()
                .append("^~\\&")
                .append()
                .append("Mindray")
                .append()
                .append("BS-240Pro")
                .append()
                .append()
                .append()
                .append("20201001000000")
                .append()
                .append()
                .append("ORU^R01")
                .append()
                .append("1")
                .append()
                .append("P")
                .append()
                .append("2.3.1")
                .append()
                .append()
                .append()
                .append()
                .append("0")
                .append()
                .append()
                .append("ASCII")
                .append()
                .append()
                .append();

        Message headerMessage = new Message();
        headerMessage.setManufacturer("Mindray");
        headerMessage.setModel("BS-240Pro");
        headerMessage.setMessageDate(new Date());
        headerMessage.setMessageType("ORU^R01");
        headerMessage.setMessageId("1");

        System.out.println(
                new SegmentMSH()
                        .setManufacturer("Mindray")
                        .setModel("BS-240Pro")
                        .setMessageDate(new Date())
                        .setMessageType("ORU^R01")
                        .setMessageId("1")
                        .createSegment()
        );
        System.out.println(
                new SegmentPID()
                        .setClientId("854")
                        .setBedNo("12")
                        .setPatientName("Tom Carter")
                        .setPatientBirthDate(new Date())
                        .setPatientGender("M")
                        .createSegment()
        );
        System.out.println(
                new SegmentOBR()
                        .setBarcode("10004304")
                        .setSampleId("2")
                        .setServiceId("Mindray^BS-240Pro")
                        .createSegment()
        );
        System.out.println(
                new SegmentOBX()
                .setSegmentId("1")
                .setTestCode("2")
                .setTestName("Glucose")
                .setTestResult("5.00000")
                .setTestUnit("g/ml")
                .createSegment()
        );
        System.out.println(Message.MESSAGE_END);

//        System.out.println(message.getMessage());
//        System.out.println(headerMessage.getHeaderMessage());
    }
}
