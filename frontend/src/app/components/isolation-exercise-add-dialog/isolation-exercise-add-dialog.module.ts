import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IsolationExerciseAddDialogComponent } from './isolation-exercise-add-dialog.component';
import {SharedModule} from "../../modules/shared/shared.module";
import {MuscleGroupModule} from "../../pipes/muscle-group/muscle-group.module";



@NgModule({
  declarations: [
    IsolationExerciseAddDialogComponent
  ],
  imports: [
    CommonModule,
    SharedModule,
    MuscleGroupModule
  ],
  exports: [
    IsolationExerciseAddDialogComponent
  ]
})
export class IsolationExerciseAddDialogModule { }
