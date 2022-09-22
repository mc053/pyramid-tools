import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { VolumeCalculationRoutingModule } from './volume-calculation-routing.module';
import { VolumeCalculationComponent } from './volume-calculation.component';
import {SharedModule} from "../../../modules/shared/shared.module";
import {MuscleGroupModule} from "../../../pipes/muscle-group/muscle-group.module";
import {IsolationExerciseAddDialogModule} from "../../../components/isolation-exercise-add-dialog/isolation-exercise-add-dialog.module";


@NgModule({
  declarations: [
    VolumeCalculationComponent
  ],
  imports: [
    CommonModule,
    VolumeCalculationRoutingModule,
    SharedModule,
    MuscleGroupModule,
    IsolationExerciseAddDialogModule
  ]
})
export class VolumeCalculationModule { }
