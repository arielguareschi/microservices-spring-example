package br.com.ariel.inventoryservice;

import br.com.ariel.inventoryservice.model.Inventory;
import br.com.ariel.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


//    @Bean
//    public CommandLineRunner loadData(InventoryRepository inventoryRepository){
//        return args -> {
//            Inventory inventory = new Inventory();
//            inventory.setSkuCode("iphone-16");
//            inventory.setQuantity(100);
//
//            Inventory inventory1 = new Inventory();
//            inventory1.setSkuCode("iphone-16-red");
//            inventory1.setQuantity(100);
//
//            Inventory inventory2 = new Inventory();
//            inventory2.setSkuCode("iphone-16-black");
//            inventory2.setQuantity(100);
//
//            inventoryRepository.save(inventory);
//            inventoryRepository.save(inventory1);
//            inventoryRepository.save(inventory2);
//        };
//    }

}
