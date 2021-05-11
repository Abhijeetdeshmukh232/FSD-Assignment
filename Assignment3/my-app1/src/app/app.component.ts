import { Component, ViewChild } from '@angular/core';
import{AppdataService} from './appdata.service'
import {DetailsComponent} from './details/details.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  template:`<app-details (senddata)=updateEmployee($event)></app-details>`
})
export class AppComponent {
  updateEmployee(employee:any){
    console.log(employee);
  }
}
