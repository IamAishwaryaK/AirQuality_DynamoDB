import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AirQualityComponent } from './air-quality/air-quality.component';
import { Floor1Component } from './floor1/floor1.component';
import { Floor2Component } from './floor2/floor2.component';
import { Floor3Component } from './floor3/floor3.component';

const routes: Routes = [
  {path:'airQuality',component:AirQualityComponent},
  {path:'',component:AirQualityComponent},
  {path:'floorone',component:Floor1Component},
  {path:'floortwo',component:Floor2Component},
  {path:'floorthree',component:Floor3Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
