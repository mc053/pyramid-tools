import {MuscleGroup} from "../enums/muscle-group.enum";

export interface MuscleGroupVolume {
  name: MuscleGroup;
  sets: number;
  directWork: number;
  indirectWork: number;
}
