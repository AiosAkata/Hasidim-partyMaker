package hasidim.partyMaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"hasidim.partyMaker.jpa"})
@EnableJpaRepositories({"hasidim.partyMaker.repository"})
public class PartyMakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PartyMakerApplication.class, args);
    }

}
