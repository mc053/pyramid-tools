import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { VolumeCalculationRoutingModule } from './volume-calculation-routing.module';
import { VolumeCalculationComponent } from './volume-calculation.component';


@NgModule({
  declarations: [
    VolumeCalculationComponent
  ],
  imports: [
    CommonModule,
    VolumeCalculationRoutingModule
  ]
})
export class VolumeCalculationModule { }
