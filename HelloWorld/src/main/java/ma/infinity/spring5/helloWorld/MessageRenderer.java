package ma.infinity.spring5.helloWorld;

public interface MessageRenderer {
    MessageProvider getMessageProvider();
    void setMessageProvider(MessageProvider messageProvider);
    void render();
}
