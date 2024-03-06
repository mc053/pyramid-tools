import {Pipe, PipeTransform} from '@angular/core';
import {MuscleGroup} from "../../enums/muscle-group.enum";

@Pipe({
  name: 'muscleGroup'
})
export class MuscleGroupPipe implements PipeTransform {

  transform(muscleGroups: MuscleGroup[]): string | unknown {
    let result: string[] = [];
    let nameOfMuscleGroup: string;
      for (let muscleGroup of muscleGroups) {
        if (isNaN(muscleGroup)) { // if we retrieved muscleGroups from actual backend (not mocks)
          nameOfMuscleGroup = MuscleGroup[+MuscleGroup[muscleGroup]];
          this.#addStringifiedMuscleGroupToResult(result, nameOfMuscleGroup); // not tested yet
        } else {
          nameOfMuscleGroup = MuscleGroup[muscleGroup];
          this.#addStringifiedMuscleGroupToResult(result, nameOfMuscleGroup);
        }
      }

      return result.join(', ');
  }

  #addStringifiedMuscleGroupToResult(result: string[], nameOfMuscleGroup: string) {
    switch (nameOfMuscleGroup) {
      case MuscleGroup[MuscleGroup.QUADS]:
        result.push('Quads');
        break;
      case MuscleGroup[MuscleGroup.GLUTES]:
        result.push('Glutes');
        break;
      case MuscleGroup[MuscleGroup.ERECTORS]:
        result.push('Erectors');
        break;
      case MuscleGroup[MuscleGroup.HAMS]:
        result.push('Hams');
        break;
      case MuscleGroup[MuscleGroup.SCAPULAR_RETRACTORS]:
        result.push('Scapular Retractors');
        break;
      case MuscleGroup[MuscleGroup.LATS]:
        result.push('Lats');
        break;
      case MuscleGroup[MuscleGroup.BIS]:
        result.push('Bis');
        break;
      case MuscleGroup[MuscleGroup.REAR_DELTS]:
        result.push('Rear Delts');
        break;
      case MuscleGroup[MuscleGroup.ANTERIOR_DELTS]:
        result.push('Anterior Delts');
        break;
      case MuscleGroup[MuscleGroup.TRIS]:
        result.push('Tris');
        break;
      case MuscleGroup[MuscleGroup.MIDDLE_DELTS]:
        result.push('Middle Delts');
        break;
      case MuscleGroup[MuscleGroup.CHEST]:
        result.push('Chest');
        break;
    }
  }

}
