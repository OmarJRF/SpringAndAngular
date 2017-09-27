export class Employee {

  constructor(public idEmployee: number,
    public idPerson: number,
    public idCompany: number,
    public idDirection: number,
    public idManagement: number,
    public idDepartment: number,
    public admissionDate = new Date(),
    public salary: number,
    public active: boolean) {

  }

}