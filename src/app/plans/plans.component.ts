import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import {  OnInit  } from '@angular/core';

@Component({
  selector: 'app-plans',
  templateUrl: './plans.component.html',
  styleUrls: ['./plans.component.css']
})
export class PlansComponent {
  constructor(private http:HttpClient){ 
    this.http.get("")
  }
  
  
    ngOnInit(): void{
  
    }
}
