import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { PlansComponent } from './plans/plans.component';
import { SignupComponent } from './signup/signup.component';
import { BroadbandComponent } from './broadband/broadband.component';
import { MyprofileComponent } from './myprofile/myprofile.component';
import { UserComponent } from './user/user.component';
import { RechargeComponent } from './recharge/recharge.component';
import { RechargeSuccessfulComponent } from './recharge-successful/recharge-successful.component';
import { ApplicationSuccessfulComponent } from './application-successful/application-successful.component';
import { ContactUsComponent } from './contact-us/contact-us.component';


const routes: Routes = [
  {path:"home", component:HomeComponent},
  {path:"login", component:LoginComponent},
  {path:"signup", component:SignupComponent},
  {path:"plans", component:PlansComponent},
  {path:"page-not-found", component:PageNotFoundComponent},
  {path:"broadband", component:BroadbandComponent},
  {path:"myprofile", component:MyprofileComponent},
  {path:"user", component:UserComponent},
  {path:"recharge", component:RechargeComponent},
  {path:"recharge-successful", component:RechargeSuccessfulComponent},
  {path:"application-successful", component:ApplicationSuccessfulComponent},
  {path:"contact-us", component:ContactUsComponent},
  {path:'',redirectTo:'home',pathMatch:'full'}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
