package ma.infinity.spring5.helloWorldSpring;

public interface MessageRenderer {
    MessageProvider getMessageProvider();
    void setMessageProvider(MessageProvider messageProvider);
    void render();
}
