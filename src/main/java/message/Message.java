package message;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    public static final String MESSAGE_START = "\u000B";
    public static final String MESSAGE_END = "\u001C";
    private StringBuilder message;
    private final int MANUFACTURER = 2;
    private int MODEL = 3;
    private int MESSAGE_DATE = 6;
    private int MESSAGE_TYPE = 8;
    private int MESSAGE_ID = 9;
    private int HL_7_VERSION = 11;
    private int ENCODING = 17;
    private String [] MSH = new String[]{
            "MSH",
            "^~\\&",
            "Manufacturer",
            "Model",
            "",
            "",
            "Message Date",
            "",
            "Message Type",
            "1",
            "P",
            "2.3.1",
            "",
            "",
            "",
            "0",
            "",
            "ASCII",
            "",
            "",
            ""
    };

    private String [] PID = new String[]{
            "PID",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
    };

    public Message(){message = new StringBuilder();}
    public Message append(){this.message.append("|"); return this;}
    public Message append(String text){this.message.append(text); return this;}
    public String getMessage(){return this.message.toString();}
    public String getHeaderMessage(){return String.join("|",this.MSH);}

    public void setManufacturer(String manufacturer){this.MSH[MANUFACTURER] = manufacturer;}
    public void setModel(String model){this.MSH[MODEL] = model;}
    public void setMessageDate(Date messageDate) {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMddHHmmss");
        Date now = new Date();
        this.MSH[MESSAGE_DATE] = sdfDate.format(now);
    }
    public void setMessageType(String messageType){this.MSH[MESSAGE_TYPE] = messageType;}
    public void setMessageId(String messageId){this.MSH[MESSAGE_ID] = messageId;}
    public void setHl7Version(String hl7Version){this.MSH[HL_7_VERSION] = hl7Version;}
    public void setEncoding(String encoding){this.MSH[ENCODING] = encoding;}
}
