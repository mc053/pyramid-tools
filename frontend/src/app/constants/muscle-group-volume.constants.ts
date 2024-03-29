import {MuscleGroupVolume} from "../interfaces/muscle-group-volume.interface";
import {MuscleGroup} from "../enums/muscle-group.enum";

export const MUSCLE_GROUPS_VOLUME_MOCK: MuscleGroupVolume[] = [
  {
    name: MuscleGroup.LATS,
    sets: 3,
    directWork: 3,
    indirectWork: 0
  },
  {
    name: MuscleGroup.BIS,
    sets: 2,
    directWork: 2,
    indirectWork: 0
  }
]
