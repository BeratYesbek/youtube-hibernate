package com.beratyesbek.youtubehibernate;

import com.beratyesbek.youtubehibernate.entity.Category;
import com.beratyesbek.youtubehibernate.entity.Product;
import com.beratyesbek.youtubehibernate.entity.ProductDetail;
import com.beratyesbek.youtubehibernate.entity.Tag;
import com.beratyesbek.youtubehibernate.entity.interitance.discriminator.MachineAccessor;
import com.beratyesbek.youtubehibernate.entity.interitance.single.Machine;
import com.beratyesbek.youtubehibernate.entity.interitance.single.PrivateMachine;
import com.beratyesbek.youtubehibernate.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class YoutubeHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoutubeHibernateApplication.class, args);
    }


    @Bean
    public CommandLineRunner run(ProductRepository productRepository, CategoryRepository categoryRepository,
                                 MachineRepository machineRepository,
                                 PrivateMachineRepository privateMachineRepository,
                                 MachineAccessorRepository machineAccessorRepository
                                 ) {
        return args -> {
       /*     Category category = categoryRepository.findById(1).orElseThrow(
                    () -> new RuntimeException("Category has not been found")
            );
            ProductDetail productDetail = ProductDetail.builder()
                    .brand("Apple")
                    .description("harika bir telefon")
                    .warranty(true)
                    .build();
            Set<Tag> tags = new HashSet<>();
            tags.add(Tag.builder().name("harika telefon").build());
            tags.add(Tag.builder().name("çok iyi telefon").build());
            tags.add(Tag.builder().name("müthiş telefon").build());

           Product product = Product.builder()
                    .name("Iphone 15")
                    .quantity(13)
                    .category(category)
                    .productDetail(productDetail)
                    .tags(tags)
                    .build();

           productRepository.save(product);

            categoryRepository.deleteById(1);*/
          /*  PrivateMachine privateMachine =    new PrivateMachine();
            privateMachine.setPrivateVpn("43254.54.54..54.5.4");
            machineRepository.save(
                privateMachine
            );*/
            List<Machine> machines = machineRepository.findAll();
            PrivateMachine privateMachine = privateMachineRepository.findById(1).get();
            List<MachineAccessor> machineAccessors = machineAccessorRepository.findAll();
            System.out.println(privateMachine.getPrivateVpn());
        };
    }

}
