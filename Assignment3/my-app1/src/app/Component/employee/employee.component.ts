import { Component, OnInit } from '@angular/core';
import { from } from 'rxjs';
import { AppdataService } from 'src/app/appdata.service';


@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  constructor(private appdataservice:AppdataService){
  
  }

  ngOnInit(): void {
  }
  onSubmit(data: { employeeName: string; employeeAddress: string; employeePID: string}) {
    this.appdataservice.postEmployeedetail(data).subscribe(res=>console.log(res));
    window.location.href="/Details";
 }
 

}
