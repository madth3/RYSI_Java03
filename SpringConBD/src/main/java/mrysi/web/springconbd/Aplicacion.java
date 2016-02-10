package mrysi.web.springconbd;

import java.util.Properties;
import javax.sql.DataSource;
//import org.apache.tomcat.jdbc.pool.DataSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author jaguilar
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude=DataSourceAutoConfiguration.class)
public class Aplicacion extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(Aplicacion.class);
            
    @Value("${spring.datasource.url}")
    private String dsUrl;
    
    @Value("${spring.datasource.driver-class-name}")
    private String dsDriver;
    
    @Value("${spring.datasource.username}")
    private String dsUsername;
    
    @Value("${spring.datasource.password}")
    private String dsPassword;
//    
//    @Bean
//    public DataSource  dataSource() {
//        try {
//            Properties propiedadesDS = new Properties();
//            propiedadesDS.put("driverClassName", dsDriver);
//            DataSourceFactory dsf = new DataSourceFactory();
//            return dsf.createDataSource(propiedadesDS);
//        } catch (Exception ex) {
//            logger.error("No se pudo crear el DataSource", ex);
//            return null;
//        }
//    }
    
    @Override
    protected SpringApplicationBuilder
            configure(SpringApplicationBuilder builder) {
        return builder.sources(Aplicacion.class)
                .sources(ConfiguracionJpa.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
    }

}
