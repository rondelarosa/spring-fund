import com.example.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        // loading configuration file
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println("Speakers: ".concat(String.valueOf(service.findAll().size())));
        System.out.println("Speaker: ".concat(service.findAll().get(0).getFirstName()));
        System.out.println("Speaker: ".concat(service.findAll().get(1).getFirstName()));

        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service);
        System.out.println(service2);
    }


}
