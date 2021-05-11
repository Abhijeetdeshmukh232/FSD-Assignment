import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './Component/navbar/navbar.component';
import { EmployeeComponent } from './Component/employee/employee.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClientInMemoryWebApiModule } from 'angular-in-memory-web-api';
import { DetailsComponent } from './details/details.component';
import { UpdateComponent } from './update/update.component';
@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    EmployeeComponent,
    DetailsComponent,
    UpdateComponent     
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,

    RouterModule.forRoot([
      { path: 'employeedata', component: EmployeeComponent },
      { path: 'Details', component: DetailsComponent },
      { path: 'update', component: UpdateComponent},
    ])

    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
