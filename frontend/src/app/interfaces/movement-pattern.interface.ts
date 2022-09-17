import {MuscleGroup} from "../enums/muscle-group.enum";

export interface MovementPattern {
  name: string;
  primaryMuscleGroups: MuscleGroup[];
  secondaryMuscleGroups: MuscleGroup[];
}
