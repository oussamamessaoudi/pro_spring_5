package ma.infinity.spring5.helloWorld;

public class Main {
    public static void main(String... args){
        MessageProvider messageProvider = MessageSupportFactory.getInstance().getMessageProvider();
        MessageRenderer messageRenderer = MessageSupportFactory.getInstance().getMessageRenderer();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
