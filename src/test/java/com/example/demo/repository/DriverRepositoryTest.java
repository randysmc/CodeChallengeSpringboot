package com.example.demo.repository;

import com.example.demo.entity.Driver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test") // application-test.propierties
public class DriverRepositoryTest {

    @Autowired
    DriverRepository driverRepository;

    @Test
    public void testSaveDriver(){
        //given
        Driver driver = new Driver();
        driver.setId(1L);
        driver.setName("Juan");
        driver.setAge(15);

        //when
        Driver saveDriver = driverRepository.save(driver);

        //then
        assertThat(saveDriver).isNotNull();
        assertThat(saveDriver.getId()).isGreaterThan(0);
        assertThat(saveDriver.getName()).isEqualTo("Juan");
    }
}
