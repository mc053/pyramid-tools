import {Pipe, PipeTransform} from '@angular/core';
import {MuscleGroup} from "../../enums/muscle-group.enum";

@Pipe({
  name: 'muscleGroup'
})
export class MuscleGroupPipe implements PipeTransform {

  transform(muscleGroups: MuscleGroup[]): string | unknown {
    let result: string[] = [];

    for (let muscleGroup of muscleGroups) {
      switch (muscleGroup) {
        case MuscleGroup.QUADS: result.push('Quads'); break;
        case MuscleGroup.GLUTES: result.push('Glutes'); break;
        case MuscleGroup.ERECTORS: result.push('Erectors'); break;
        case MuscleGroup.HAMS: result.push('Hams'); break;
        case MuscleGroup.SCAPULAR_RETRACTORS: result.push('Scapular Retractors'); break;
        case MuscleGroup.LATS: result.push('Lats'); break;
        case MuscleGroup.BIS: result.push('Bis'); break;
        case MuscleGroup.REAR_DELTS: result.push('Rear Delts'); break;
        case MuscleGroup.ANTERIOR_DELTS: result.push('Anterior Delts'); break;
        case MuscleGroup.TRIS: result.push('Tris'); break;
        case MuscleGroup.MIDDLE_DELTS: result.push('Middle Delts'); break;
        case MuscleGroup.CHEST: result.push('Chest'); break;
      }
    }

    return result.join(', ');
  }

}
