import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { AppdataService } from '../appdata.service';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {
@Input() data:any;
@Output() senddata= new EventEmitter<{}>();
data2:any=[];
  constructor(private appdataservice:AppdataService) {
    
    this.appdataservice.getEmployeedetail().subscribe((data1)=>{this.data2=data1});
   }

  ngOnInit(): void {
  }
  deleteEmployee(employee:any){
   this.appdataservice.deleteEmployee(employee).subscribe((res)=>{console.log(res)});
   window.location.reload(); 
}
  updateEmployee(employee:any){
     console.log(employee);
    window.location.href="/update";
   
  }
}
