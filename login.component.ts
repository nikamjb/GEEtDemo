import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminDetails } from 'app/model/admin.model';
import { Login } from 'app/model/login.model';
import { AddressDetails } from 'app/model/AddressDetails.model';
import { SheredService } from 'app/shered/shered.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  // value = "http://localhost:4200/#/dashboard";
  public show = true;
  public notshow = true;
  public username = '';
  public password = '';
  public email = '';

  admin: AdminDetails = {
    adminFirstName: '',
    adminLastName: '',
    adminEmailId: '',
    adminContact: '',
    adminAadharNo: null,
    adminPanNo: '',
    adminDob: null,
    login: {
      loginUserName: '',
      loginPassword: '',
      status: '',
      role: null
    },
    addrs: {
      addressVillage: '',
      addressTalName: '',
      addressDistName: '',
      addressStateName: '',
      addressCountryName: '',
      addressZipcode: ''
    }
  }
    


  constructor(private router: Router,private shered:SheredService) {}

  ngOnInit() {}
 adminDiv:boolean=true;
 loginDiv:boolean=false;
 addressDiv:boolean=false;



 //log=new Login();

pri()
{

  this.addressDiv=false;
  this.adminDiv=true;
  this.loginDiv=false;
}
 next()
  {
    this.addressDiv=false;
    this.adminDiv=false;
    this.loginDiv=true;
    // return this.shered.addAdmin(this.admin).subscribe(result=>{})
  }
  Next()
  {
    this.addressDiv=true;
    this.adminDiv=false;
    this.loginDiv=false;
   // return this.shered.addAdmin(this.log).subscribe(result=>{})
  }

  sub(admin)
  {
    this.addressDiv=true;
    this.adminDiv=false;
    this.loginDiv=false;
    return this.shered.addAdmin(this.admin).subscribe(result=>{})
    console.log(admin);
  }
  toggle() {
    console.log('toggle');
    this.show = !this.show;
    // CHANGE THE NAME OF THE BUTTON.
  }
  toggle1() {
    this.show = true;
    // CHANGE THE NAME OF THE BUTTON.
  }
  login(username, password) {
    if (username === 'doctor' && password === 'doctor') {
      console.log('in doctor');
      sessionStorage.setItem('role', 'doctor');
      this.router.navigateByUrl('role/doctor/doctordash');
    }
    if (username === 'emp' && password === 'emp') {
      console.log('in emp');
      sessionStorage.setItem('role', 'emp');
      this.router.navigateByUrl('role/emp/empdash');
    }
    if (username === 'nurse' && password === 'nurse') {
      console.log('in nurse');
      sessionStorage.setItem('role', 'nurse');
      this.router.navigateByUrl('role/nurse/nursedash');
    }
    if (username === 'stu' && password === 'stu') {
      console.log('in student');
      sessionStorage.setItem('role', 'student');
      this.router.navigateByUrl('role/student/studash');
    }
    if (username === 'admin' && password === 'admin') {
      console.log('in admin');
      sessionStorage.setItem('role', 'admin');
      this.router.navigateByUrl('role/admin/admindash');
    }
  }
}
