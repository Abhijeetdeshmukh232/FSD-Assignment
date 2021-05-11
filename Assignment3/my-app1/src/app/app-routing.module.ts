import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeComponent } from './Component/employee/employee.component';
import { DetailsComponent } from './details/details.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  
  { path: 'employeedata', component: EmployeeComponent },
  
  { path: 'Details', component: DetailsComponent },
  { path: 'update', component: UpdateComponent, data:{}},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
