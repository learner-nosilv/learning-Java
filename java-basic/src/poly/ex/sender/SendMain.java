package poly.ex.sender;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = new Sender[]{ new EmailSender() , new SmsSender() , new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}

/**
 * 메일을 발송합니다: 환영합니다!
 * SMS을 발송합니다: 환영합니다!
 * 페이스북에 발송합니다: 환영합니다!
 */
