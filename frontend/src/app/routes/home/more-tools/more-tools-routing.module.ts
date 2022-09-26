import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MoreToolsComponent } from './more-tools.component';

const routes: Routes = [{ path: '', component: MoreToolsComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MoreToolsRoutingModule { }
