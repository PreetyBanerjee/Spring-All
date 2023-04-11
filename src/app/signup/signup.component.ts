import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../model/User';
import { Service } from '../service';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  user:User = new User();
  UserLoginService: any;

  constructor(private UserService:Service, private router:Router){}
  userloginservice: any;
 
  ngOnInit(): void {
    
  }
    

register(){
  this.UserService.registerUser(this.user).subscribe(data=>{
    alert("Registered");
    this.goToLogin();
  });
}
goToLogin(){
  this.router.navigate(['/login']);
}
}