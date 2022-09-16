package de.hdm_stuttgart.workoutgenerator.services.volume;

import de.hdm_stuttgart.workoutgenerator.enums.MuscleGroupEnums;
import de.hdm_stuttgart.workoutgenerator.models.volume.Volume;
import org.springframework.stereotype.Service;

@Service
public class AddPrimaryMuscleGroupToVolumeService implements IAddPrimaryMuscleGroupToVolumeService {
    @Override
    public void addPrimaryMuscleGroupToVolume(MuscleGroupEnums primaryMuscleGroup, Volume volume) {
        switch (primaryMuscleGroup) {
            case QUADS -> volume.setPrimaryQuadsVolume(volume.getPrimaryQuadsVolume() + 1);
            case GLUTES -> volume.setPrimaryGlutesVolume(volume.getPrimaryGlutesVolume() + 1);
            case ERECTORS -> volume.setPrimaryErectorsVolume(volume.getPrimaryErectorsVolume() + 1);
            case HAMS -> volume.setPrimaryHamsVolume(volume.getPrimaryHamsVolume() + 1);
            case SCAPULAR_RETRACTORS -> volume.setPrimaryScapularRetractorsVolume(volume.getPrimaryScapularRetractorsVolume() + 1);
            case LATS -> volume.setPrimaryLatsVolume(volume.getPrimaryLatsVolume() + 1);
            case BIS -> volume.setPrimaryBisVolume(volume.getPrimaryBisVolume() + 1);
            case REAR_DELTS -> volume.setPrimaryRearDealtsVolume(volume.getPrimaryRearDealtsVolume() + 1);
            case ANTERIOR_DELTS -> volume.setPrimaryAnteriorDeltsVolume(volume.getPrimaryAnteriorDeltsVolume() + 1);
            case TRIS -> volume.setPrimaryTrisVolume(volume.getPrimaryTrisVolume() + 1);
            case MIDDLE_DELTS -> volume.setPrimaryMiddleDeltsVolume(volume.getPrimaryMiddleDeltsVolume() + 1);
            case CHEST -> volume.setPrimaryChestVolume(volume.getPrimaryChestVolume() + 1);
        }
    }
}
