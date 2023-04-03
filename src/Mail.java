public class Mail extends Data<String> {

    String content;
    int receiver;
    int sender;
    int priority;

    public Mail(int priority, String id, String content, int receiver, int sender) {
        super(id);
        this.content = content;
        this.receiver = receiver;
        this.sender = sender;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "content='" + content + '\'' +
                ", receiver=" + receiver +
                ", sender=" + sender +
                ", priority=" + priority +
                ", key=" + key +
                '}';
    }
}
