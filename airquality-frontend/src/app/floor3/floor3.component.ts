import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { airQuality } from '../airquality.model';
@Component({
  selector: 'app-floor3',
  templateUrl: './floor3.component.html',
  styleUrls: ['./floor3.component.css']
})
export class Floor3Component implements OnInit {

  
  constructor(private httpClient:HttpClient) { }
  
  airQuali!: airQuality[];

ngOnInit(): void  {
  this.getFloor3()
}
iferror="Please contact system administrator.Error with sensor device data retrieval."
ifnull="Please contact system administrator. Device did not return any values device is down."
getFloor3(){
  this.httpClient.get<any>('http://airqualitymonitor-env.eba-pqiwsqmt.ap-northeast-1.elasticbeanstalk.com/floor/3').subscribe(
   response => {
     console.log(response);
     this.airQuali = response;
   }
 );

}
}


