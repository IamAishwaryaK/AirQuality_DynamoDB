import { Component, OnInit } from '@angular/core';
import { airQuality } from '../airquality.model';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-floor2',
  templateUrl: './floor2.component.html',
  styleUrls: ['./floor2.component.css']
})
export class Floor2Component implements OnInit {

  
  airQual!: airQuality[];

  constructor(private httpClient:HttpClient
    ) { }


  ngOnInit(): void {
    this.getFloor2()
    
  }

  iferror="Please contact system administrator.Error with sensor device data retrieval."
  ifnull="Please contact system administrator. Device did not return any values device is down."
  getFloor2(){
     this.httpClient.get<any>('http://airqualitymonitor-env.eba-pqiwsqmt.ap-northeast-1.elasticbeanstalk.com/floor/2').subscribe(
      response => {
        console.log(response);
        this.airQual = response;
      }
    );
   
    }
 
}
