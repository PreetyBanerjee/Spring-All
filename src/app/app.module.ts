  import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { PlansComponent } from './plans/plans.component';
import { BroadbandComponent } from './broadband/broadband.component';
import { MyprofileComponent } from './myprofile/myprofile.component';
import { UserComponent } from './user/user.component';
import { RechargeComponent } from './recharge/recharge.component';
import { RechargeSuccessfulComponent } from './recharge-successful/recharge-successful.component';
import { ApplicationSuccessfulComponent } from './application-successful/application-successful.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { HttpClientModule }   from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    HomeComponent,
    SignupComponent,
    LoginComponent,
    PageNotFoundComponent,
    PlansComponent,
    BroadbandComponent,
    MyprofileComponent,
    UserComponent,
    RechargeComponent,
    RechargeSuccessfulComponent,
    ApplicationSuccessfulComponent,
    ContactUsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
