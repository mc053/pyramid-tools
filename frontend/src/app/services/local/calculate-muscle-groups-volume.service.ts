import {Injectable} from '@angular/core';
import {MovementPattern} from "../../interfaces/movement-pattern.interface";
import {MuscleGroupVolume} from "../../interfaces/muscle-group-volume.interface";
import {MuscleGroup} from "../../enums/muscle-group.enum";

@Injectable({
  providedIn: 'root'
})
export class CalculateMuscleGroupsVolumeService {

  constructor() { }

  calculateMuscleGroupsVolume(muscleGroupsVolumeMap: Map<MuscleGroup, MuscleGroupVolume>, movementPatterns: MovementPattern[]): MuscleGroupVolume[] {
    this.#calculatePrimaryMuscleGroups(muscleGroupsVolumeMap, movementPatterns);
    this.#calculateSecondaryMuscleGroups(muscleGroupsVolumeMap, movementPatterns);

    return Array.from(muscleGroupsVolumeMap.values());
  }

  #calculatePrimaryMuscleGroups(muscleGroupsVolumeMap: Map<MuscleGroup, MuscleGroupVolume>, movementPatterns: MovementPattern[]) {
    // Log the keys of the map to ensure they are what you expect
    console.log([...muscleGroupsVolumeMap.keys()]);

    // Check if the map has the key 'QUADS'
    console.log(muscleGroupsVolumeMap.has(MuscleGroup.QUADS));

    // Retrieve the value again
    const volume = muscleGroupsVolumeMap.get(MuscleGroup.QUADS);
    console.log(volume); // Ensure it's not undefined

    movementPatterns.forEach(m => {
      let primaryMuscleGroups = m.primaryMuscleGroups;

      primaryMuscleGroups.forEach(p => {
        let muscleGroupsVolume = muscleGroupsVolumeMap.get(p);

        if (muscleGroupsVolume !== undefined) {
          muscleGroupsVolume.sets = muscleGroupsVolume.sets + m.sets;
          muscleGroupsVolume.directWork = muscleGroupsVolume.directWork + m.sets;
        }
      })
    })
  }

  #calculateSecondaryMuscleGroups(muscleGroupsVolumeMap: Map<MuscleGroup, MuscleGroupVolume>, movementPatterns: MovementPattern[]) {
    movementPatterns.forEach(m => {
      let secondaryMuscleGroups = m.secondaryMuscleGroups;

      secondaryMuscleGroups.forEach(s => {
        let muscleGroupsVolume = muscleGroupsVolumeMap.get(s);

        if (muscleGroupsVolume !== undefined) {
          muscleGroupsVolume.sets = muscleGroupsVolume.sets + m.sets;
          muscleGroupsVolume.indirectWork = muscleGroupsVolume.indirectWork + m.sets;
        }
      })
    })
  }
}
