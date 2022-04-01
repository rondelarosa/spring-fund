import com.example.repository.SpeakerRepository;
import com.example.service.SpeakerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        return new SpeakerService(getSpeakerRepository());
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new SpeakerRepository();
    }
}
