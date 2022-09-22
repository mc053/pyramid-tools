package de.hdm_stuttgart.workoutgenerator.services.movement_pattern.get;

import de.hdm_stuttgart.workoutgenerator.dtos.MovementPatternDTO;

public interface IGetAllMovementPatternsDTOService {
    Iterable<MovementPatternDTO> getAllMovementPatternsDTO();
}
