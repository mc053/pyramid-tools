package de.hdm_stuttgart.workoutgenerator.controllers;

import de.hdm_stuttgart.workoutgenerator.dtos.MovementPatternDTO;
import de.hdm_stuttgart.workoutgenerator.services.movement_pattern.get.IGetAllMovementPatternsDTOService;
import de.hdm_stuttgart.workoutgenerator.services.muscle_group.get.IGetAllMuscleGroupsDTOService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MuscleGroupVolumeDTOCalculateController {
    private final IGetAllMovementPatternsDTOService getAllMovementPatternsDTOService;
    private final IGetAllMuscleGroupsDTOService getAllMuscleGroupsDTOService;

    public MuscleGroupVolumeDTOCalculateController(IGetAllMovementPatternsDTOService getAllMovementPatternsDTOService, IGetAllMuscleGroupsDTOService getAllMuscleGroupsDTOService) {
        this.getAllMovementPatternsDTOService = getAllMovementPatternsDTOService;
        this.getAllMuscleGroupsDTOService = getAllMuscleGroupsDTOService;
    }

    // READ
    @GetMapping("/movementPatterns")
    public Iterable<MovementPatternDTO> getAllMovementPatterns() {
        return getAllMovementPatternsDTOService.getAllMovementPatternsDTO();
    }

    @GetMapping("/muscleGroups")
    public Iterable<String> getAllMuscleGroups() {
        return getAllMuscleGroupsDTOService.getAllMuscleGroupsDTO();
    }
}
