import {MovementPattern} from "../interfaces/movement-pattern.interface";
import {MuscleGroup} from "../enums/muscle-group.enum";

export const MOVEMENT_PATTERNS_MOCK: MovementPattern[] = [
  {
    name: "Squat (all variations, leg press, single leg variants)",
    primaryMuscleGroups: [
      MuscleGroup.QUADS, MuscleGroup.GLUTES
    ],
    secondaryMuscleGroups: []
  },
  {
    name: "Hip Hinge (deadlift variations, good morning, back ext)",
    primaryMuscleGroups: [
      MuscleGroup.GLUTES, MuscleGroup.HAMS, MuscleGroup.ERECTORS
    ],
    secondaryMuscleGroups: [
      MuscleGroup.SCAPULAR_RETRACTORS
    ]
  }
]
