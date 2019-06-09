package lk.sCs.moveManagement.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("lk.sCs.moveManagement")
@Import(JpaConfig.class)
public class AppConfig {
}
