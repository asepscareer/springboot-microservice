package storm.code.warehouse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import storm.code.warehouse.entity.Warehouse;
import storm.code.warehouse.repository.WarehouseRepository;

@SpringBootApplication
public class WarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}

	@Bean
	CommandLineRunner startUp(WarehouseRepository warehouseRepository){
		return args -> {
			warehouseRepository.save(new Warehouse("WH HO",8_000_000));
			warehouseRepository.save(new Warehouse("Wh Cabang Sby",2_500_000));
			warehouseRepository.save(new Warehouse("WH Cabang Bdg",3_500_000));
		};
	}

}
