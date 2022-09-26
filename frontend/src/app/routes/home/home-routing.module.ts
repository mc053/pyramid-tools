import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home.component';

const routes: Routes = [
  { path: '',
    component: HomeComponent,
    children: [
      {
        path: 'volume-calculation',
        loadChildren: () => import('./volume-calculation/volume-calculation.module').then(m => m.VolumeCalculationModule)
      },
      {
        path: 'more-tools',
        loadChildren: () => import('./more-tools/more-tools.module').then(m => m.MoreToolsModule)
      },
      {
        path: '**',
        redirectTo: 'volume-calculation'
      }
    ]
},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule { }
