package com.beratyesbek.youtubehibernate;

import com.beratyesbek.youtubehibernate.entity.Category;
import com.beratyesbek.youtubehibernate.entity.Merchant;
import com.beratyesbek.youtubehibernate.repository.*;
import com.beratyesbek.youtubehibernate.service.MerchantService;
import lombok.extern.log4j.Log4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.logging.Logger;

@EnableCaching
@SpringBootApplication
public class YoutubeHibernateApplication {

    Logger logger = Logger.getLogger(YoutubeHibernateApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(YoutubeHibernateApplication.class, args);
    }


    @Bean
    public CommandLineRunner run(CategoryRepository categoryRepository) {
        return args -> {
           /* logger.info("A category is called");
            List<Category> categoriesA = categoryRepository.findAllByCode("A");
            logger.info("B category is called");
            List<Category> categoriesB = categoryRepository.findAllByCode("B");

            logger.info("A category is called second time");
            List<Category> categoriesASecondTime = categoryRepository.findAllByCode("A"); */

        };
    }


    @Bean
    public CommandLineRunner runMerchant(MerchantService merchantService) {
        return args -> {

           logger.info("Merchant is called first time");
            List<Merchant> merchantsFirstTime = merchantService.findByName("Berat");

            logger.info("Merchant is called second time");
            List<Merchant> merchantsSecondTime = merchantService.findByName("Berat");

            logger.info("Merchant is saved");
            Merchant merchant = Merchant.builder().name("Berat").email("berat@gmail.com").address("Istanbul").build();
            merchantService.save(merchant);

            logger.info("Merchant is called third time");
            List<Merchant> merchantsThirdTime = merchantService.findByName("Berat");

            logger.info("Merchant is called fourth time");
            List<Merchant> merchantsFourthTime = merchantService.findByName("Furkan");


        };
    }

}
