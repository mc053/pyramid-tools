import { Injectable } from '@angular/core';
import {MuscleGroup} from "../../enums/muscle-group.enum";
import {MuscleGroupVolume} from "../../interfaces/muscle-group-volume.interface";

@Injectable({
  providedIn: 'root'
})
export class InitMuscleGroupsVolumeMapService {

  constructor() { }

  initMuscleGroupsVolumeMap() {
    let result = new Map<MuscleGroup, MuscleGroupVolume>();
    Object.keys(MuscleGroup)
      .filter(key => !isNaN(Number(key)))
      .forEach(key => {
        const m = MuscleGroup[key as keyof typeof MuscleGroup];
        const numericKey = parseInt(key, 10); // Parse the key as a number
        result.set(numericKey, {
          name: m,
          sets: 0,
          directWork: 0,
          indirectWork: 0
        });
      });

    return result;
  }

  test() {
    let result = new Map<MuscleGroup, MuscleGroupVolume>();
    Object.keys(MuscleGroup)
      .filter(key => !isNaN(Number(key)))
      .forEach(key => {
        const m = MuscleGroup[key as keyof typeof MuscleGroup];
        result.set(m, {
          name: m,
          sets: 0,
          directWork: 0,
          indirectWork: 0
        });
      });

    return result;
  }
}
