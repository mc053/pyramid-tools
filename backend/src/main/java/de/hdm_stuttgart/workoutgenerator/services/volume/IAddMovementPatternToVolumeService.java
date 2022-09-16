package de.hdm_stuttgart.workoutgenerator.services.volume;

import de.hdm_stuttgart.workoutgenerator.models.movement_pattern.IMovementPattern;
import de.hdm_stuttgart.workoutgenerator.models.volume.Volume;

public interface IAddMovementPatternToVolumeService {

    Volume addMovementPatternToVolume(IMovementPattern movementPattern, Volume volume);

}
