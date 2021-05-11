import { Component, OnInit } from '@angular/core';
import { AppdataService } from '../appdata.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  data:any=[];
  constructor(private appdataservice:AppdataService) {
    
    this.appdataservice.getEmployeedetail().subscribe((data1)=>{this.data=data1});
   }

  ngOnInit(): void {
  }
  onUpdateSubmit(employee:any){
    console.log(employee);
    this.appdataservice.updateEmployee(employee).subscribe((data1)=>{this.data=data1});
    window.location.href="/Details";
  }

}
