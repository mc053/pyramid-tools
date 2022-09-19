import {MuscleGroup} from "../enums/muscle-group.enum";

export interface MovementPattern {
  name: string;
  sets: number;
  primaryMuscleGroups: MuscleGroup[];
  secondaryMuscleGroups: MuscleGroup[];
}
