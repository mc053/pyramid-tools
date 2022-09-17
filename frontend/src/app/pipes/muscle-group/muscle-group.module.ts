import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MuscleGroupPipe } from './muscle-group.pipe';



@NgModule({
  declarations: [
    MuscleGroupPipe
  ],
  imports: [
    CommonModule
  ],
  exports: [
    MuscleGroupPipe
  ]
})
export class MuscleGroupModule { }
