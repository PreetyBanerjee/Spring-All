import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../model/User';
import { Service } from '../service';
import {  NgModule } from '@angular/core';
import {  FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:User = new User();

  constructor(private userloginservice:Service, private router:Router){}

  ngOnInit(): void {
  }


  
  doLogin(user:User){
    let resp = this.userloginservice.login(user);
    resp.subscribe(data=>{
      if(data=="User not authenticated"){
        alert(data);
      }
      else if(data=="phone no or password does not match."){
        alert(data);
      }
      else if(data=="there is an error"){
        alert(data);
      }
      else{
        localStorage.setItem("token",data);
        console.log(data);
        this.router.navigateByUrl("/home");
      }
      
      
    });

  }
}