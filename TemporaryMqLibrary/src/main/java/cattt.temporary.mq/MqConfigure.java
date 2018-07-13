package cattt.temporary.mq;

import cattt.temporary.mq.base.enums.QosClub;
import cattt.temporary.mq.base.model.QosType;

public class MqConfigure {
    public static String userName = "guest";
    public static String password = "guest";

    public static String clientId = "11";
    public static String serverUri = new StringBuffer().append("tcp").append("://")
            .append("39.106.117.115").append(":").append("1883").toString();

//    public static String serverUri = new StringBuffer().append("tcp").append("://")
//            .append("39.106.117.115").append(":").append("1883").toString();

    /**
     * key is topic
     * value is qos
     */
    public static String[] topics = null;
    @QosClub
    public static int qos = QosType.NORMAL;

    public static boolean isTrace = true;
}
