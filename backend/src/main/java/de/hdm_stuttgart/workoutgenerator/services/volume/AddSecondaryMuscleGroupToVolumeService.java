package de.hdm_stuttgart.workoutgenerator.services.volume;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;
import de.hdm_stuttgart.workoutgenerator.models.volume.Volume;
import org.springframework.stereotype.Service;

@Service
public class AddSecondaryMuscleGroupToVolumeService implements IAddSecondaryMuscleGroupToVolumeService {
    @Override
    public void addSecondaryMuscleGroupToVolume(MuscleGroupEnums secondaryMuscleGroup, Volume volume) {
        switch (secondaryMuscleGroup) {
            case QUADS -> volume.setSecondaryQuadsVolume(volume.getSecondaryQuadsVolume() + 1);
            case GLUTES -> volume.setSecondaryGlutesVolume(volume.getSecondaryGlutesVolume() + 1);
            case ERECTORS -> volume.setSecondaryErectorsVolume(volume.getSecondaryErectorsVolume() + 1);
            case HAMS -> volume.setSecondaryHamsVolume(volume.getSecondaryHamsVolume() + 1);
            case SCAPULAR_RETRACTORS -> volume.setSecondaryScapularRetractorsVolume(volume.getSecondaryScapularRetractorsVolume() + 1);
            case LATS -> volume.setSecondaryLatsVolume(volume.getSecondaryLatsVolume() + 1);
            case BIS -> volume.setSecondaryBisVolume(volume.getSecondaryBisVolume() + 1);
            case REAR_DELTS -> volume.setSecondaryRearDealtsVolume(volume.getSecondaryRearDealtsVolume() + 1);
            case ANTERIOR_DELTS -> volume.setSecondaryAnteriorDeltsVolume(volume.getSecondaryAnteriorDeltsVolume() + 1);
            case TRIS -> volume.setSecondaryTrisVolume(volume.getSecondaryTrisVolume() + 1);
            case MIDDLE_DELTS -> volume.setSecondaryMiddleDeltsVolume(volume.getSecondaryMiddleDeltsVolume() + 1);
            case CHEST -> volume.setSecondaryChestVolume(volume.getSecondaryChestVolume() + 1);
        }
    }
}
