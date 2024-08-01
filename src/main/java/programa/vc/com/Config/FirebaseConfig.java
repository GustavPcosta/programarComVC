package programa.vc.com.Config;


import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
//import org.springframework.core.io.ClassPathResource;

import io.github.cdimascio.dotenv.Dotenv;

@Configuration
public class FirebaseConfig {

    @Bean
    public  FirebaseApp initializeFirebase() throws IOException {
    	Dotenv  dotenv = Dotenv.load();
    	String bucketFirebase = dotenv.get(null);
        FileInputStream serviceAccount = new FileInputStream("caminho-ferente");
        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setStorageBucket(bucketFirebase)
                .build();

        if (FirebaseApp.getApps().isEmpty()) {
            return FirebaseApp.initializeApp(options);
        } else {
            return FirebaseApp.getInstance();
        }
    }
}
