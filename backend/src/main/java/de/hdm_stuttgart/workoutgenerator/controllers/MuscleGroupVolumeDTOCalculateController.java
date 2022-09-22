package de.hdm_stuttgart.workoutgenerator.controllers;

import de.hdm_stuttgart.workoutgenerator.dtos.MovementPatternDTO;
import de.hdm_stuttgart.workoutgenerator.dtos.MuscleGroupVolumeDTO;
import de.hdm_stuttgart.workoutgenerator.services.movement_pattern.get.IGetAllMovementPatternsDTOService;
import de.hdm_stuttgart.workoutgenerator.services.muscle_group.get.IGetAllMuscleGroupsDTOService;
import de.hdm_stuttgart.workoutgenerator.services.muscle_group_volume.generate.IGenerateMuscleGroupsVolumeDTOService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class MuscleGroupVolumeDTOCalculateController {
    private final IGenerateMuscleGroupsVolumeDTOService generateMuscleGroupsVolumeDTOService;
    private final IGetAllMovementPatternsDTOService getAllMovementPatternsDTOService;
    private final IGetAllMuscleGroupsDTOService getAllMuscleGroupsDTOService;

    public MuscleGroupVolumeDTOCalculateController(IGenerateMuscleGroupsVolumeDTOService generateMuscleGroupsVolumeDTOService, IGetAllMovementPatternsDTOService getAllMovementPatternsDTOService, IGetAllMuscleGroupsDTOService getAllMuscleGroupsDTOService) {
        this.generateMuscleGroupsVolumeDTOService = generateMuscleGroupsVolumeDTOService;
        this.getAllMovementPatternsDTOService = getAllMovementPatternsDTOService;
        this.getAllMuscleGroupsDTOService = getAllMuscleGroupsDTOService;
    }

    // CREATE
    @PostMapping("/muscleGroupsVolume")
    public Iterable<MuscleGroupVolumeDTO> generateMuscleGroupsVolumeDTO(@RequestBody Iterable<MovementPatternDTO> movementPatternsDTO) {
        return generateMuscleGroupsVolumeDTOService.generateMuscleGroupsVolumeDTO(movementPatternsDTO);
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
