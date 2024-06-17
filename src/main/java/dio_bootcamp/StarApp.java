package dio_bootcamp;

import dio_bootcamp.model.User;
import dio_bootcamp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StarApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("João");
        user.setUsername("Jota");
        user.setPassword("J1234");

        repository.save(user);

        for (User u : repository.findAll()){
            System.out.println(u);
        }
    }
}
