import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Route, Routes } from '@angular/router';


export class airQuality
{
  
  constructor(public floor:Number,    
    public oxygen:Number,
    public carbondioxide:Number,
    public sulphurdioxde:Number,
    public carbonmonoxide:Number,
    public carbon:Number,
    public airqual:Number,
    public timestamp:string,
    public isError:Number,
    public isNull:Number){}
}
@Component({
  selector: 'app-floor1',
  templateUrl: './floor1.component.html',
  styleUrls: ['./floor1.component.css']
})
export class Floor1Component implements OnInit {

  
  
constructor(private httpClient:HttpClient) { }
  
    airQuali!: airQuality[];

  ngOnInit(): void  {
    this.getFloor1()
  }
  iferror="Please contact system administrator.Error with sensor device data retrieval."
  ifnull="Please contact system administrator. Device did not return any values device is down."
  getFloor1(){
    this.httpClient.get<any>('http://airqualitymonitor-env.eba-pqiwsqmt.ap-northeast-1.elasticbeanstalk.com/floor/1').subscribe(
     response => {
       console.log(response);
       this.airQuali = response;
     }
   );

}
}
