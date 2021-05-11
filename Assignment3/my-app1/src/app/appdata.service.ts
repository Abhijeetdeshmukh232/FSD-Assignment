import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AppdataService{

  url:string ='http://localhost:8004/';
  url1:string ='http://localhost:8004/employeee';

  constructor(private http:HttpClient) {

   }

   private handleError(error: HttpErrorResponse) {
    if (error.status === 0) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong.
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    // Return an observable with a user-facing error message.
    return throwError(
      'Something bad happened; please try again later.');
  }
getEmployeedetail(){
  //console.log(this.http.get(this.url));
  return this.http.get(this.url);
}

postEmployeedetail(data : any){
  //console.log(this.http.get(this.url));
  console.log(data);
  return this.http.post(this.url1, data);
}
deleteEmployee(employee:any){
  this.url =this.url+"/"+employee.id;
  return this.http.delete(this.url)
}
updateEmployee(employee:any){
  //console.log(employee);
  this.url =this.url+"/"+employee.id;
  return this.http.put(this.url,employee)
}


}
