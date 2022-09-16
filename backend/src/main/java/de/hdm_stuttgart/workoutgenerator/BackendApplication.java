package de.hdm_stuttgart.workoutgenerator;

import de.hdm_stuttgart.workoutgenerator.models.movement_pattern.MovementPatternHorizontalPush;
import de.hdm_stuttgart.workoutgenerator.models.training_day.TrainingDay;
import de.hdm_stuttgart.workoutgenerator.models.training_week.TrainingWeek;
import de.hdm_stuttgart.workoutgenerator.models.volume.Volume;
import de.hdm_stuttgart.workoutgenerator.services.volume.IGetVolumeForTrainingWeekService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner test(IGetVolumeForTrainingWeekService getVolumeForTrainingWeekService) {
        return args -> {
            TrainingWeek trainingWeek = new TrainingWeek();

            TrainingDay trainingDay1 = new TrainingDay();
            TrainingDay trainingDay2 = new TrainingDay();
            TrainingDay trainingDay3 = new TrainingDay();
            TrainingDay trainingDay4 = new TrainingDay();

            MovementPatternHorizontalPush movementPatternHorizontalPush = new MovementPatternHorizontalPush();

            trainingDay1.setMovementPatterns(List.of(movementPatternHorizontalPush));
            trainingDay2.setMovementPatterns(List.of(movementPatternHorizontalPush));
            trainingDay3.setMovementPatterns(List.of(movementPatternHorizontalPush));
            trainingDay4.setMovementPatterns(List.of(movementPatternHorizontalPush));

            trainingWeek.setTrainingDays(List.of(trainingDay1, trainingDay2, trainingDay3, trainingDay4));

            System.out.println(getVolumeForTrainingWeekService.getVolumeForTrainingWeek(trainingWeek));
        };
    }
}
