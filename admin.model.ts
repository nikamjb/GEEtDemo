import { Login } from "./login.model";
import { AddressDetails } from "./AddressDetails.model";

export class AdminDetails 
{
    adminFirstName:string;
    adminLastName:string;
    adminEmailId:string;
    adminContact:string;
    adminAadharNo:number;
    adminPanNo:string;
    adminDob:Date;
    login:Login;
    addrs:AddressDetails;
}
