import { HttpClient } from '@angular/common/http';
import { Component, Injectable, OnInit } from '@angular/core';
import { timer } from 'rxjs';
import { airQuality } from '../airquality.model';


  

@Component({
  selector: 'app-air-quality',
  templateUrl: './air-quality.component.html',
  styleUrls: ['./air-quality.component.css']
})
export class AirQualityComponent implements OnInit {


  airQual!: airQuality[];

  constructor(private httpClient:HttpClient
    ) { }

  ngOnInit(): void {
    this.getAirQual()
    
  }

  iferror="Please contact system administrator.Error with sensor device data retrieval."
  ifnull="Please contact system administrator. Device did not return any values device is down."
  getAirQual(){
     this.httpClient.get<any>('http://airqualitymonitor-env.eba-pqiwsqmt.ap-northeast-1.elasticbeanstalk.com/floor/all').subscribe(
      response => {
        console.log(response);
        this.airQual = response;
      }
    );
   
      setTimeout(()=>{
        window.location.reload();
      }, 60000);
  
  }
  getFloor1(){
    this.httpClient.get<any>('http://airqualitymonitor-env.eba-pqiwsqmt.ap-northeast-1.elasticbeanstalk.com/floor/1').subscribe(
     response => {
       console.log(response);
       this.airQual = response;
     }
   );
 




  
}
}
