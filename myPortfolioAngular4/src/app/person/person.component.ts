import {CivilStatus} from '../civilStatus/civilStatus';
import {CivilStatusService} from '../services/civil-status.service';
import {Component, OnInit, Provider, Input} from '@angular/core';
import {PersonService} from '../services/person.service';
import {Person} from './person';
import {Country} from '../country/country';
import {CountryService} from '../services/country.service';
import {Nationality} from '../nationality/nationality';
import {NationalityService} from '../services/nationality.service';
import {EmployeeComponent} from '../employee/employee.component';


@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css'],
  providers: [PersonService, NationalityService, CivilStatusService, CountryService]
})

export class PersonComponent implements OnInit {

  _router: any;
  public _person: Person;
  public _listPerson: Person[];
  public _listNationality: Nationality[];
  public _listCivilStatus: CivilStatus[];
  public _listCountry: Country[];
  public _listState: Country[];
  public _listMunicipality: Country[];
  public dateAct = new Date();
  _find: boolean;


  constructor(public _personService: PersonService, public _nationalityService: NationalityService, public _civilStatusService: CivilStatusService, public _countryService: CountryService, public _employeeComponent: EmployeeComponent) {
    this._person = new Person(0, 0, '', '', this.dateAct, 0, '', '', 0, 0, 0, '');

  }


  ngOnInit() {
  //  this.findPerson();
    this.getListCivilStatus();
    this.getListCountry();
    this.getListNationality();
  }


  onSubmit() {

  }


  findPerson() {
    let id= this._person.ci;
    this._personService.getPerson(id).subscribe(
      result => {
        this._person = result;
         this._find = false;
      },
      error => {
        console.log(<any>error);
      }
    );
  }

  findByFirstNameStartsWith() {
    let nameFind = this._person.firstName;
    let lengthName = this._person.firstName.length;
    if (lengthName > 3) {
      this._personService.findByFirstNameStartsWith(nameFind).subscribe(
        result => {
           this._listPerson = result;
          if (this._listPerson.length > 0) {
            this._find = true;
          } else {
            this._find = false;
          }
         

        },
        error => {
          console.log(<any>error);
        }
      );
    }
  }
  savePerson() {
    console.log('savePerson: ' + this._person.birthDate)
    this._personService.savePerson(this._person).subscribe(
      response => {
        if (response.toString() == "200") {
          this._employeeComponent.idPerson = this._person.ci;
          this._employeeComponent.isLocationData = true;
          this._employeeComponent.findEmployee();
        } else {
          console.log('Error: ' + response);
        }
      },
      error => {
        console.log('error:' + <any>error);
      }
    );
  }

  getListNationality() {
    this._nationalityService.getListNationality().subscribe(
      result => {
        this._listNationality = result;
      },
      error => {
        console.log(<any>error);
      }
    );
  }


  getListCivilStatus() {
    this._civilStatusService.getListCivilStatus().subscribe(
      result => {
        this._listCivilStatus = result;
      },
      error => {
        console.log(<any>error);
      }
    );
  }

  getListCountry() {
    this._countryService.getListCountry().subscribe(
      result => {
        this._listCountry = result;
        this.getListState();
      },
      error => {
        console.log(<any>error);
      }
    );
  }

  getListState() {
    let idCountry = this._person.country;
    if (idCountry > 0) {
      this._countryService.getListStateMunicipality(idCountry).subscribe(
        result => {
          this._listState = result;
          this.getListMunicipality();
        },
        error => {
          console.log(<any>error);
        }
      );
    } else {
      this._listState = null;
    }
  }

  getListMunicipality() {
    let idState = this._person.state;
    if (idState > 0) {
      this._countryService.getListStateMunicipality(idState).subscribe(
        result => {
          this._listMunicipality = result;
        },
        error => {
          console.log(<any>error);
        }
      );
    } else {
      this._listMunicipality = null;
    }
  }
}
