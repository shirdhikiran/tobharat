import { Component } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { DomSanitizer } from '@angular/platform-browser';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

private countryurl: string;

countries:any=[];
statusList:any=[];
segments:any=[];

urls:any=[];
thumbnail1: any;
thumbnail2: any;
imageResponse:any={};
private selectedCountry:string;
private selectedSegment:string;
private selectedUrl:string;
private selectedStatus:string;
constructor(private http: HttpClient,private sanitizer: DomSanitizer) {
    this.countryurl = '/imagecomparision/countries';

  }

ngOnInit(){
 this.http.get(this.countryurl).subscribe(data => {
     this.countries = data;

    });


}
changeStatus(e){
this.selectedStatus = e.target.value;
let segmentUrl = "/imagecomparision/urls/"+this.selectedCountry+"/"+this.selectedSegment+"/"+this.selectedStatus;
this.http.get(segmentUrl).subscribe(data => {
     this.urls = data;

    });
}
changeCountry(e){
console.log(e.target.value);
this.selectedCountry = e.target.value;
this.imageResponse ={};
this.urls = [];
this.segments = [];
this.statusList = [];
this.thumbnail1=null;
this.thumbnail2=null;
let segmentUrl = "/imagecomparision/segments/"+this.selectedCountry;
this.http.get(segmentUrl).subscribe(data => {
     this.segments = data;

    });
}

changeSegment(e){
console.log(e.target.value);
this.selectedSegment = e.target.value;
this.imageResponse ={};
this.urls = [];
this.statusList = [];
this.thumbnail1=null;
this.thumbnail2=null;

let statusUrl = "/imagecomparision/statusList/"+this.selectedCountry+"/"+this.selectedSegment;
this.http.get(statusUrl).subscribe(data => {
     this.statusList = data;

    });
}

changeUrl(e){
console.log(e.target.value);
this.selectedUrl = e.target.value;
this.imageResponse ={};
let urlsUrl = "/imagecomparision/getImages/"+this.selectedCountry+"/"+this.selectedSegment+"/"+this.selectedUrl;
this.http.get(urlsUrl).subscribe(data => {
     console.log(data);
this.imageResponse = data;
let objectURL1 = 'data:image/jpeg;base64,' + this.imageResponse.exp_screenshot;

         this.thumbnail1 = this.sanitizer.bypassSecurityTrustUrl(objectURL1);
let objectURL2 = 'data:image/jpeg;base64,' + this.imageResponse.exp_screenshot;

         this.thumbnail2 = this.sanitizer.bypassSecurityTrustUrl(objectURL2);
    });

}

}
