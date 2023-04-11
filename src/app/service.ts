import { Injectable } from "@angular/core";
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { User } from "./model/User";
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root'
})
export class Service {
    
    private baseUrl="http://localhost:9091";
    httpClient: any;

    constructor(private http:HttpClient){ }

        login(user:User){
            return this.http.post(`${this.baseUrl}/u/login`,user, {responseType:"text"});
        }

        
        
        // register(data:any){
        //     return this.http.post(`${this.baseUrl}/u/signup`,data);
        // }

        loginUser(data:any){
            return this.http.post(`${this.baseUrl}/u/login`,data);
        }

        getAllConnection(data:any){
            return this.http.get(`${this.baseUrl}/connection/getAll`,data);
        }

        createConnection(data:any){
            return this.http.post(`${this.baseUrl}/connection/save`,data);
        }

        getConnectionById(data:any, id:number){
            return this.http.get(`${this.baseUrl}/connection/get/${id}`,data);
        }

        getUserById(){
            const token = localStorage.getItem("token");
            const header=new HttpHeaders({"Authorization":"Bearer "+token});
            return this.http.get(`${this.baseUrl}/user/${token}`,{headers:header,responseType:'json'});
        }

        // signup(user:User){
        //     return this.http.post(`${this.baseUrl}/u/signup`,user, {responseType:"text"});
        // }


        registerUser(user:User):Observable<Object>{
            console.log(user);
            return this.http.post(`${this.baseUrl}/u/signup`,user,{responseType:'text'});
        }
}
