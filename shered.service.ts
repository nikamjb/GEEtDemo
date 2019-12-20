import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AdminDetails} from '../model/admin.model';
import {Login} from '../model/login.model';
import {AddressDetails} from '../model/AddressDetails.model';

import { from } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class SheredService {

  constructor(private http:HttpClient) { }
  
 url:string="url:http://localhost:3000/adminDetails;"
  addAdmin(adm)
  {

  

    return this.http.post<number>(this.url+'/',adm);

  }
  addAddrs(addrs)
  {
    return this.http.post<number>(this.url+'/',addrs);

  }

  addLogin(login)
  {
    return this.http.post<number>(this.url+'/',login);

  }
}

