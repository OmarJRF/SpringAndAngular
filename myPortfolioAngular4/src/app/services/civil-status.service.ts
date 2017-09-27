import {Injectable} from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class CivilStatusService {

  public url: string;
  public headers: Headers;
  public options: RequestOptions;



  constructor(private _http: Http) {

  }
  
  
  getListCivilStatus(){
    console.log('getListCivilStatus');
     this.url = 'http://localhost:8080/myportfoliospring/getListCivilStatus';
    return this._http.get(this.url).map(res => res.json());
    
  }

}
