import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UtenteService {

  constructor(private httpClient: HttpClient) { }

  getById(Id: number) : Observable<any> { // get utente tramite Id
    return this.httpClient.get('http://localhost:4200/api/utente/utente?Id=' + Id);
  } 
  
  post(data: any){ // post utente (registrazione)
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    return this.httpClient.post("http://localhost:8080/employees", data, httpOptions);
  }

}
