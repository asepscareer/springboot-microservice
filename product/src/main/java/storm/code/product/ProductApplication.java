package storm.code.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import storm.code.product.entity.Product;
import storm.code.product.repository.ProductRepository;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Bean
	CommandLineRunner startUp(ProductRepository productRepository){
		return args -> {
			productRepository.save(new Product("Lenovo Yoga",8000000));
			productRepository.save(new Product("Printer Hp 2012",2500000));
			productRepository.save(new Product("Xiaomi Poco 3",3500000));
		};
	}

}
