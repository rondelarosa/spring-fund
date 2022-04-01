import com.example.service.SpeakerService;

public class Application {
    public static void main(String[] args) {
        SpeakerService service = new SpeakerService();
        System.out.println("Speakers: ".concat(String.valueOf(service.findAll().size())));
        System.out.println("Speaker: ".concat(service.findAll().get(0).getFirstName()));
    }
}
