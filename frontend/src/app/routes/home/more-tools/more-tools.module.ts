import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MoreToolsRoutingModule } from './more-tools-routing.module';
import { MoreToolsComponent } from './more-tools.component';
import {SharedModule} from "../../../modules/shared/shared.module";


@NgModule({
  declarations: [
    MoreToolsComponent
  ],
  imports: [
    CommonModule,
    MoreToolsRoutingModule,
    SharedModule
  ]
})
export class MoreToolsModule { }
