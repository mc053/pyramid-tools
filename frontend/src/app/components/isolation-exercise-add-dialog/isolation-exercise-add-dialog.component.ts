import {Component, OnInit} from '@angular/core';
import {MuscleGroup} from "../../enums/muscle-group.enum";
import {VolumeCalculationService} from "../../services/volume-calculation.service";
import {MatDialogRef} from "@angular/material/dialog";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-isolation-exercise-add-dialog',
  templateUrl: './isolation-exercise-add-dialog.component.html',
  styleUrls: ['./isolation-exercise-add-dialog.component.scss']
})
export class IsolationExerciseAddDialogComponent implements OnInit {
  public muscleGroups!: MuscleGroup[];
  public formGroup!: FormGroup;

  constructor(private volumeCalculationService: VolumeCalculationService,
              private dialogRef: MatDialogRef<IsolationExerciseAddDialogComponent>,
              private fb: FormBuilder) { }

  async ngOnInit(): Promise<void> {
    this.muscleGroups = await this.volumeCalculationService.readMuscleGroups();
    this.formGroup = this.fb.group({
      primaryMuscleGroupTrained: this.fb.control('', Validators.required),
      sets: this.fb.control('', Validators.required)
    });
  }

  onAbort() {
    this.dialogRef.close();
  }

  onSave() {
    this.dialogRef.close({
      primaryMuscleGroupTrained: this.formGroup.controls['primaryMuscleGroupTrained'].value,
      sets: this.formGroup.controls['sets'].value
    });
  }
}
