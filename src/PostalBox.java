public class PostalBox {
    boolean returned;
    int receiverPostalCode;
    int senderPostalCode;
    int receiver;
    int sender;
    String receiverAddress;
    String senderAddress;
    Mail mail;
    public PostalBox(Mail mail1, int receiverPostalCode, int senderPostalCode, String receiverAddress, String senderAddress, boolean returned) {
        this.mail=mail1;
        this.receiver = mail1.receiver;
        this.sender = mail1.sender;
        this.receiverPostalCode = receiverPostalCode;
        this.senderPostalCode = senderPostalCode;
        this.receiverAddress = receiverAddress;
        this.senderAddress = senderAddress;
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "PostalBox{" +
                "returned=" + returned +
                ", receiverPostalCode=" + receiverPostalCode +
                ", senderPostalCode=" + senderPostalCode +
                ", receiver=" + receiver +
                ", sender=" + sender +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", senderAddress='" + senderAddress + '\'' +
                ", mail ID =" + mail.key +
                '}';
    }
}
