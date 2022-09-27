import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LogoComponent } from './logo.component';
import {SharedModule} from "../../modules/shared/shared.module";



@NgModule({
  declarations: [
    LogoComponent
  ],
  imports: [
    CommonModule,
    SharedModule
  ],
  exports: [
    LogoComponent
  ]
})
export class LogoModule { }
