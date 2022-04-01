import com.example.repository.SpeakerRepository;
import com.example.service.SpeakerService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE) // guaranteed unique per request opposite of singletone
    public SpeakerService getSpeakerService() {
        return new SpeakerService(getSpeakerRepository());
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new SpeakerRepository();
    }
}
