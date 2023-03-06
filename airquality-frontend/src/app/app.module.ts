import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AirQualityComponent } from './air-quality/air-quality.component';
import { HttpClientModule } from '@angular/common/http';
import { Floor1Component } from './floor1/floor1.component';
import { Floor2Component } from './floor2/floor2.component';
import { Floor3Component } from './floor3/floor3.component';


@NgModule({
  declarations: [
    AppComponent,
    AirQualityComponent,
    Floor1Component,
    Floor2Component,
    Floor3Component
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
