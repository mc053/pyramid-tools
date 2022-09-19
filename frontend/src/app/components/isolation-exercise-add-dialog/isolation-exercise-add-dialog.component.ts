import {Component, OnInit} from '@angular/core';
import {MuscleGroup} from "../../enums/muscle-group.enum";
import {VolumeCalculationService} from "../../services/volume-calculation.service";
import {MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-isolation-exercise-add-dialog',
  templateUrl: './isolation-exercise-add-dialog.component.html',
  styleUrls: ['./isolation-exercise-add-dialog.component.scss']
})
export class IsolationExerciseAddDialogComponent implements OnInit {
  muscleGroups!: MuscleGroup[];

  constructor(private volumeCalculationService: VolumeCalculationService,
              private dialogRef: MatDialogRef<IsolationExerciseAddDialogComponent>) { }

  async ngOnInit(): Promise<void> {
    this.muscleGroups = await this.volumeCalculationService.readMuscleGroups();
  }

  onAbort() {
    this.dialogRef.close();
  }

  onSave() {

  }
}
