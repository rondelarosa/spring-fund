import com.example.repository.SpeakerRepository;
import com.example.service.SpeakerService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.example"})
public class AppConfig {

    /**
     * Bean annotation only applicable at method level
     */

//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON) // guaranteed unique per request opposite of singletone
//    public SpeakerService getSpeakerService() {
//        return new SpeakerService();
//    }

//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository() {
//        return new SpeakerRepository();
//    }
}
