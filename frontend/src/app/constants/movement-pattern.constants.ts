import {MovementPattern} from "../interfaces/movement-pattern.interface";
import {MuscleGroup} from "../enums/muscle-group.enum";
export const MOVEMENT_PATTERNS_MOCK: MovementPattern[] = [
  {
    name: "Free Weight Squat (all variations, single leg variants)",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.QUADS, MuscleGroup.GLUTES
    ],
    secondaryMuscleGroups: [
      MuscleGroup.ERECTORS
    ]
  },
  {
    name: "Non-Free Weight Squat (leg press)",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.QUADS, MuscleGroup.GLUTES
    ],
    secondaryMuscleGroups: []
  },
  {
    name: "Hip Hinge (deadlift variations, good morning, back ext)",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.GLUTES, MuscleGroup.HAMS, MuscleGroup.ERECTORS
    ],
    secondaryMuscleGroups: [
      MuscleGroup.SCAPULAR_RETRACTORS
    ]
  },
  {
    name: "Vertical Pull (chins, lat pull)",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.LATS, MuscleGroup.BIS
    ],
    secondaryMuscleGroups: [
      MuscleGroup.REAR_DELTS
    ]
  },
  {
    name: "Vertical Push (OHP variations)",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.ANTERIOR_DELTS, MuscleGroup.TRIS
    ],
    secondaryMuscleGroups: [
      MuscleGroup.MIDDLE_DELTS
    ]
  },
  {
    name: "Horizontal Pull (row variations)",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.LATS, MuscleGroup.SCAPULAR_RETRACTORS
    ],
    secondaryMuscleGroups: [
      MuscleGroup.REAR_DELTS, MuscleGroup.BIS, MuscleGroup.MIDDLE_DELTS
    ]
  },
  {
    name: "Horizontal Push (flat, decline pushing variants)",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.CHEST, MuscleGroup.ANTERIOR_DELTS
    ],
    secondaryMuscleGroups: [
      MuscleGroup.TRIS
    ]
  },
  {
    name: "CG Horizontal Push",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.CHEST, MuscleGroup.ANTERIOR_DELTS, MuscleGroup.TRIS
    ],
    secondaryMuscleGroups: []
  },
  {
    name: "Incline Push",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.CHEST, MuscleGroup.ANTERIOR_DELTS
    ],
    secondaryMuscleGroups: [
      MuscleGroup.TRIS, MuscleGroup.MIDDLE_DELTS
    ]
  },
  {
    name: "CG Incline Push",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.CHEST, MuscleGroup.ANTERIOR_DELTS, MuscleGroup.TRIS
    ],
    secondaryMuscleGroups: [
      MuscleGroup.MIDDLE_DELTS
    ]
  },
  {
    name: "Dips",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.CHEST, MuscleGroup.ANTERIOR_DELTS, MuscleGroup.TRIS
    ],
    secondaryMuscleGroups: []
  },
  {
    name: "Horizontal Hip Extension (hip thrust, glute bridge etc)",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.GLUTES
    ],
    secondaryMuscleGroups: [
      MuscleGroup.HAMS
    ]
  },
  {
    name: "Pull Over (DB pullover, lat pushdown, BB pullover etc)",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.LATS
    ],
    secondaryMuscleGroups: [
      MuscleGroup.TRIS, MuscleGroup.CHEST
    ]
  },
  {
    name: "Fly (cable crossover, DB flys)",
    sets: 0,
    primaryMuscleGroups: [
      MuscleGroup.CHEST
    ],
    secondaryMuscleGroups: [
      MuscleGroup.ANTERIOR_DELTS
    ]
  }
];

