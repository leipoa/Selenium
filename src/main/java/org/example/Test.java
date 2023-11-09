package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



class Test {

        private WebDriver driver;

        @BeforeAll
        static void setUpAll() {
            System.setProperty("webdriver.chrome.driver", "C:/Users/User/chromedriver/chromedriver.exe");
        }

        @BeforeEach
        void setUp() {
            driver = new ChromeDriver();
        }

        @AfterEach
        void tearDown() {
            driver.quit();
            driver = null;

        }
        @Test
        void shouldTestSomething(){
            throw new UnsupportedOperationException();
        }
    }