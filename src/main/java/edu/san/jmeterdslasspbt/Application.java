package edu.san.jmeterdslasspbt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import us.abstracta.jmeter.javadsl.core.TestPlanStats;

import static us.abstracta.jmeter.javadsl.JmeterDsl.*;


@SpringBootApplication
public class Application implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Hello World!");

    TestPlanStats stats = testPlan(
        threadGroup(2, 10,
            httpSampler("https://abstracta.github.io/jmeter-java-dsl/")
        )
    ).run();
  }
}
