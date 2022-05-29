public class DownLinkTelegramSend {


    private String cmd = "tx";
    private String EUI = "0004A30B00E8207E";
    private int port = 1;
    private boolean confirmed = false;
    private String data = "0102AABB";


    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getEUI() {
        return EUI;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setEUI(String EUI) {
        this.EUI = EUI;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
