import { Component, OnInit } from '@angular/core';
import { map, Subscription, timer } from 'rxjs';
import { switchMap } from 'rxjs';
import { Floor1Component } from './floor1/floor1.component';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  title = 'airquality-frontend';
  
    
  constructor() {}
  
  ngOnInit() {
      
  }
  // getFloor()
  // {
  //   this.airQualit.getFloor1();
  // }

  
}